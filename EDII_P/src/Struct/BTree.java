package Struct;

import java.io.Serializable;
import java.util.LinkedList;

/**
 *
 * @author CJ
 */
public class BTree implements Serializable {

    private Page root;
    private int order;

    public BTree(int order) {
        this.order = order;
        this.root = new Page(null, new LinkedList(), order);
    }

    public Page getRoot() {
        return root;
    }

    public boolean trim() {
        return true;
    }

    public void insert(Node node) throws Exception {
        ////System.out.println("\n# Nueva inserción - " + node.toString());
        try {
            // Si la raíz tiene contenido.
            //System.out.println("_ Si la raíz tiene contenido.");
            if (root.getNodes().size() > 0) {
                // Inserta con validaciones.
                //System.out.println("_ Inserta con validaciones.");
                specialInsert(root, node);
            } else {
                // Inserta directo.
                //System.out.println("_ Inserta directo.");
                root.insert(node);
            }
            //System.out.println("Listo");
        } catch (Exception e) {
            //e.printStackTrace();
            //System.out.println(e.getMessage() + "\t\t\t\tERROR!");
            throw new Exception(e);
        }
    }

    private int specialInsert(Page page, Node newNode) throws Exception {
        // Buscar en pagina.
        //System.out.println("_ Busca en página.");
        for (int i = 0; i < page.getNodes().size(); i++) {
            // Valida repeticiones .
            //System.out.println("_ Valida repeticiones.");
            if (newNode.value == page.getNodes().get(i).value) {
                throw new Exception("BTREE_INSERT: EQUALS");
            }
            // Si es menor, busca izquierda.
            //System.out.println("_ Si es menor, busca izquierda.");
            if (newNode.value < page.getNodes().get(i).value) {
                rigth_Left(page, page.getNodes().get(i).left, newNode);
                return 0;
            }
        }
        // Proceso del último nodo.
        //System.out.println("_ Busca último nodo.");
        rigth_Left(page, page.get(page.getNodes().size() - 1).right, newNode);
        return 1;
    }

    private byte rigth_Left(Page currentPage, Page sonPage, Node newNode) throws Exception {
        // Si hay página hija.
        //System.out.println("_ Si hay página hija.");
        newNode.container = currentPage;
        if (sonPage != null) {
            // Accede recursivamente a ella.
            //System.out.println("_ Accede recursivamente a ella.");
            specialInsert(sonPage, newNode);
            sonPage.setAncestor(currentPage);
        } else {
            // Si hay lugar en la página.
            //System.out.println("_ Si hay lugar en la página.");
            if (currentPage.insert(newNode)) {
                return 0;
            } else {
                // Crea página virtual.
                //System.out.println("_ Crea página virtual.");
                Page virtual = new Page(currentPage, new LinkedList(currentPage.getNodes()), currentPage.getNodes().size() + 2);
                virtual.insert(newNode);
                // Crea nodo final.
                //System.out.println("_ Crea nodo final.");
                int trimConst = (order - 1) / 2;
                Node finalNode = new Node(currentPage, virtual.get(trimConst).value);
                finalNode.reference = virtual.get(trimConst).reference;
                // Define páginas hijas.
                //System.out.println("_ Define páginas hijas.");
                finalNode.left = new Page(currentPage, new LinkedList(virtual.getNodes().subList(0, trimConst)), order);
                finalNode.right = new Page(currentPage, new LinkedList(virtual.getNodes().subList(trimConst + 1, virtual.getOrder() - 1)), order);
                // Si es raíz.
                //System.out.println("_ Si es raíz.");
                if (currentPage == root) {
                    // Reemplaza la raíz con una nueva.
                    //System.out.println("_ Reemplaza la raíz con una nueva.");
                    currentPage.getNodes().clear();
                    currentPage.insert(finalNode);
                } else {
                    // Reestructura subárbol.
                    //System.out.println("_ Reestructura subárbol.");
                    //currentPage.getNodes().clear();
                    if (!currentPage.getAncestor().insert(finalNode)) {
                        rigth_Left(currentPage.getAncestor(), sonPage, finalNode);
                    }
                }
            }
        }
        return 0;
    }

    public void delete(Object o) {
        // Nueva eliminación.
        //System.out.println("_ Nueva eliminación.");
        // Encuentra nodo en estructura.
        //System.out.println("_ Encuentra nodo en estructura.");
        Node node = find(o);
        // Obtener página contenedora.
        //System.out.println("_ Obtener página contenedora.");
        Page currentPage = node.container;
        // Localiza nodo padre.
        int father = 0;
        //System.out.println("_ Localiza nodo padre.");
        for (int i = 0; i < currentPage.getAncestor().getNodes().size(); i++) {
            if (currentPage == currentPage.getAncestor().get(i).left) {
                father = i;
                break;
            }
        }
        father = currentPage.getAncestor().getNodes().size() - 1;
        // Si es una hoja.
        //System.out.println("_ Si es una hoja.");
        if (currentPage.get(0).left == null) {
            // Si resulta página válida.
            //System.out.println("_ Si resulta página válida.");
            if (!currentPage.delete(node)) {
                // Si es el primer nodo.
                //System.out.println("_ Si es el primer nodo.");
                if (father == 0) {
                    // Crea página virtual.
                    //System.out.println("_ Crea página virtual.");
                    Page virtual = new Page(currentPage.getAncestor(), currentPage.getNodes(), order + 1);
                    virtual.insert(currentPage.getAncestor().get(father));
                    virtual.insertAll(currentPage.getAncestor().get(father).left.getNodes());
                    // Si nodo virtual es válido.
                    //System.out.println("_ Si nodo virtual es válido.");
                    if (virtual.getNodes().size() <= virtual.getOrder()) {
                        // Si n es mayor a 1.
                        //System.out.println("_ Si n es mayor a 1.");
                        if (currentPage.getAncestor().getNodes().size() > 1) {
                            // Modifica relaciones.
                            //System.out.println("_ Modifica relaciones.");
                            currentPage.getAncestor().getNodes().get(father).right = virtual;
                        }
                        // Eliimina nodo padre
                        //System.out.println("_ Eliimina nodo padre.");
                        currentPage.getAncestor().delete(currentPage.getAncestor().getNodes().get(father));
                    } else {

                    }
                }
            }
        }
    }

    public Node find(Object o) {
        if (o instanceof Node) {
            return findNode(root, (Node) o);
        } else if (o instanceof Integer) {
            return findValue(root, (Integer) o);
        } else {
            return null;
        }
    }

    private Node findNode(Page page, Node node) {
        if (page != null) {
            for (int i = 0; i < page.getNodes().size(); i++) {
                if (node.value == page.getNodes().get(i).value) {
                    return page.getNodes().get(i);
                } else if (node.value < page.getNodes().get(i).value) {
                    return findNode(page.getNodes().get(i).left, node);
                }
            }
            if (node.value > page.getNodes().getLast().value) {
                return findNode(page.getNodes().getLast().right, node);
            }
        }
        return null;
    }

    private Node findValue(Page page, int value) {
        if (page != null) {
            for (int i = 0; i < page.getNodes().size(); i++) {
                if (value == page.getNodes().get(i).value) {
                    return page.getNodes().get(i);
                } else if (value < page.getNodes().get(i).value) {
                    return findValue(page.getNodes().get(i).left, value);
                }
            }
            if (value > page.getNodes().getLast().value) {
                return findValue(page.getNodes().getLast().right, value);
            }
        }
        return null;
    }

    public void clean() {
        this.root = new Page(null, new LinkedList(), order);
    }

    @Override
    public String toString() {
        return root.toString();
    }

}
