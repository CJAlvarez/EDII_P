package Struct;

import java.io.Serializable;
import java.util.LinkedList;
import java.math.*;

/**
 *
 * @author CJ
 */
public class Page  implements Serializable {

    private Page ancestor;
    private LinkedList<Node> nodes;
    private int order;
    private boolean root;

    public Page(Page ancestor, LinkedList<Node> nodes, int order) {
        this.ancestor = ancestor;
        this.nodes = nodes;
        this.order = order;
        if (ancestor != null) {
            root = true;
        } else {
            root = false;
        }
    }

    public Page getAncestor() {
        return ancestor;
    }

    public void setAncestor(Page ancestor) {
        this.ancestor = ancestor;
    }

    public LinkedList<Node> getNodes() {
        return nodes;
    }

    public void setNodes(LinkedList<Node> nodes) {
        this.nodes = nodes;
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    public boolean isRoot() {
        return root;
    }

    public void setRoot(boolean root) {
        this.root = root;
    }

    public Node get(int i) {
        return nodes.get(i);
    }

    public void insertAll(LinkedList<Node> ns) {
        for (int i = 0; i < ns.size(); i++) {
            insert(ns.get(i));
        }
    }

    public boolean insert(Node node) {
        if (nodes.size() < order - 1) {
            for (int i = 0; i < nodes.size(); i++) {
                // Si la página tiene espacio.
                //System.out.println("_ Si la página tiene espacio.");
                if (node.value < nodes.get(i).value) {
                    createRelations(node, i);
                    // Inserta en orden en la página.
                    //System.out.println("_ Inserta en orden en la página.");
                    nodes.add(i, node);
                    refreshContainer(this);
                    return true;
                }
            }
            createRelations(node, nodes.size());
            // Inserta al final.
            //System.out.println("_ Inserta al final.");
            nodes.add(node);
            refreshContainer(this);
            return true;
        } else {
            return false;
        }
    }

    private void createRelations(Node node, int pos) {
        // Valida posición de inserción.
        //System.out.println("_ Valida posición de inserción.");
        if (pos == 0) {
            // Crea la relación derecha_izquierda.
            //System.out.println("_ Crea la relación derecha_izquierda.");
            if (nodes.size() > 0) {
                nodes.get(pos).left = node.right;
            }
        } else if (pos == nodes.size()) {
            // Crea la relación izquierda_derecha.
            //System.out.println("_ Crea la relación izquierda_derecha.");
            nodes.get(pos - 1).right = node.left;
        } else {
            // Crea la relación izquierda_derecha, derecha_izquierda.
            //System.out.println("_ Crea la relación izquierda_derecha, derecha_izquierda.");
            nodes.get(pos).left = node.right;
            nodes.get(pos - 1).right = node.left;
        }
    }

    public boolean delete(Node node) {
        // Elmina nodo.
        //System.out.println("_ Elmina nodo.");
        nodes.remove(node);
        // Si no cumple el mínimo.
        //System.out.println("_ Si no cumple el mínimo.");
        if (nodes.size() < (order - 1) / 2) {
            return false;
        }
        return true;
    }

    private void refreshContainer(Page p) {
        if (p != null) {
            //System.out.println(p);
            for (int i = 0; i < p.getNodes().size(); i++) {

                p.get(i).container = p;
                refreshContainer(p.get(i).left);
                if (p.get(i).left != null) {
                    p.get(i).left.setAncestor(p);
                }
            }
            p.get(p.getNodes().size() - 1).container = p;
            refreshContainer(p.get(p.getNodes().size() - 1).right);
            if (p.get(p.getNodes().size() - 1).right != null) {
                p.get(p.getNodes().size() - 1).right.setAncestor(p);
            }
        }

    }

    public String toString() {
        return " { " + nodes.toString() + " }";
    }

}
