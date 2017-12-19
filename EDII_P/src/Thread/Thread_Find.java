package Thread;

import Principal.Menu.Elements.DeskPanel;
import Principal.Menu.Elements.NavigationPanel;
import Struct.Tree;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTable;

/**
 *
 * @author CJ
 */
public class Thread_Find implements Runnable {

    public DeskPanel dP;
    public JTable table;
    public boolean live;
    public boolean go;
    public NavigationPanel navi;
    public NavigationPanel naviE;
    public String field;
    public String fieldE;
    public JList<String> list;
    public JList<String> listE;

    public Thread_Find(DeskPanel dP) {
        this.live = true;
        this.go = true;
        this.dP = dP;
        if (dP.isDesk()) {
            this.table = dP.getTable_Foreground();
        } else {
            this.table = dP.getTable_Background();
        }
        this.navi = dP.getNaviPanel();
        this.field = navi.getBar_Find().getTextField_Find().getText();
        this.list = navi.getList_Find().getList_Find();
    }

    @Override
    public void run() {
        while (live) {
            System.out.print("");
            if (go) {
                // PRINCIPAL
                this.navi = dP.getNaviPanel();
                this.field = navi.getBar_Find().getTextField_Find().getText();
                this.list = navi.getList_Find().getList_Find();
                try {
                    DefaultListModel modelo = new DefaultListModel();
                    //System.out.println(field);
                    //System.out.println(navi.getBox_Fields().getSelectedItem().toString());
                    for (int i = 0; i < table.getRowCount(); i++) {
                        //System.out.println(table.getValueAt(i, navi.getBox_Fields().getSelectedIndex()).toString());
                        if (table.getValueAt(i, navi.getBox_Fields().getSelectedIndex()).toString().contains(field)) {
                            //System.out.println("____________");                          
                            navi.getList_Find().index.add(i);
                            modelo.addElement(table.getValueAt(i, navi.getBox_Fields().getSelectedIndex()).toString() + " -> " + i);
                        }
                    }
                    if (navi.getList_Find().index.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "No se encontró registro", "ERROR", 0);
                    }
                    list.setModel(modelo);
                    navi.getList_Find().getList_Find().setModel(modelo);
                } catch (Exception e) {
                    //e.printStackTrace();
                }
                //SECUNDARIO

                go = false;
            }
        }
    }

    public DeskPanel getdP() {
        return dP;
    }

    public void setdP(DeskPanel dP) {
        this.dP = dP;
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

    public NavigationPanel getNavi() {
        return navi;
    }

    public void setNavi(NavigationPanel navi) {
        this.navi = navi;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

}
