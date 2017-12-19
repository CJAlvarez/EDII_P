package Thread;

import Principal.Menu.Elements.DeskPanel;
import Struct.BTree;
import Struct.Node;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import javax.swing.JTable;

/**
 *
 * @author CJ
 */
public class Thread_BTree implements Runnable {

    public Manager m;
    private boolean live;
    private boolean go;
    private boolean isInt;
    private DeskPanel dP;
    private int key;
    private BTree bTree;
    private JTable table;

    public Thread_BTree(DeskPanel dP) {
        this.live = true;
        this.go = true;
        this.dP = dP;
        refresh();
    }

    public void refresh() {
        try {
            try {
                if (dP.getJFC() == null) {
                    m = new Manager(new File(".temporal.bt"));
                } else {
                    String name = "";
                    if (dP.getJFC().getSelectedFile().getName().contains(".dbp")) {
                        name = dP.getJFC().getSelectedFile().getName().replace(".dbp", ".bt");
                    } else {
                        name = dP.getJFC().getSelectedFile().getName() + ".bt";
                    }
                    m = new Manager(new File("." + name));
                }
            } catch (Exception e) {
                //System.out.println("ERROR_LOGTREE");
            }
            if (dP.isDesk()) {
                this.table = dP.getTable_Foreground();
                this.isInt = !dP.getTable_Background().getValueAt(key, 2).toString().toLowerCase().equals("text");
            } else {
                this.table = dP.getTable_Background();
                this.isInt = !dP.getTable_Foreground().getValueAt(key, 2).toString().toLowerCase().equals("text");
            }
            this.key = dP.getKey();
            this.bTree = dP.getbTree();
            bTree.clean();
        } catch (Exception e) {
            go = false;
        }
    }

    private void make() { // BTREE_INSERT: EQUALS
        refresh();
        if (isInt) {
            for (int i = 0; i < table.getRowCount(); i++) {
                try {
                    Node node = new Node(null, Integer.parseInt(table.getValueAt(i, key).toString()));
                    node.reference = i;
                    bTree.insert(node);
                } catch (Exception ex) {
                }
            }
        } else {

        }
        try {
            //System.out.println(bTree.toString());
        } catch (Exception e) {
            //System.out.println("No hay BTree");
        }
    }
    // Para Strings usar el valor ascii letra por letra
    // valor = row

    @Override
    public void run() {
        while (live) {
            System.out.print("");
            if (go) {
                make();
                m.write();
                go = false;
            }
        }
    }

    public boolean isInteger() {
        return isInt;
    }

    public void setInt(boolean isInt) {
        this.isInt = isInt;
    }

    public DeskPanel getdP() {
        return dP;
    }

    public void setdP(DeskPanel dP) {
        this.dP = dP;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public BTree getbTree() {
        return bTree;
    }

    public void setbTree(BTree bTree) {
        this.bTree = bTree;
    }

    public JTable getTable() {
        return table;
    }

    public void setTable(JTable table) {
        this.table = table;
    }

    public boolean isLive() {
        return live;
    }

    public void setLive(boolean live) {
        this.live = live;
    }

    public boolean isGo() {
        return go;
    }

    public void setGo(boolean go) {
        this.go = go;
    }

    public boolean isIsInt() {
        return isInt;
    }

    public void setIsInt(boolean isInt) {
        this.isInt = isInt;
    }

    public class Manager {

        protected File file;

        public Manager(File file) {
            this.file = file;
        }

        public void write() {
            try {
                ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(file));
                out.writeObject(bTree);
                out.close();
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("ERROR_WRITE_BTREE");
            }
        }

        public void read() {
            try {
                ObjectInputStream entrada = new ObjectInputStream(new FileInputStream(file));
                Object o = entrada.readObject();
                bTree = (BTree) o;
                entrada.close();
            } catch (Exception e) {
                //System.out.println("ERROR_READ_BTREE");
            }
        }
    }

}
