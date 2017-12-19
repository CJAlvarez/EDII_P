package Principal.Menu.Elements;

import Thread.Thread_Save;
import Thread.Thread_Open;
import Thread.Thread_BTree;
import Struct.BTree;
import Thread.Thread_Find;
import java.util.Arrays;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.WindowConstants;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author CJ
 */
public class DeskPanel extends javax.swing.JPanel {

    public DeskPanel() {
        initComponents();
        fields = new Object[1];
        design = new Object[]{"Llave", "Campo", "Tipo", "Longitud"};
        desk = true;
        key = -1;
        close();
        info = new TabBar();
        // B-TREE
        bTree = new BTree(6);
        thread_BTree = new Thread_BTree(this);
        bTree_Manager = new Thread(thread_BTree);
        try {
            bTree_Manager.start();
        } catch (Exception e) {
            System.out.println("OUCH!");
        }
        frame_Print = new Frame_Print();
        frame_Print.setResizable(true);
        frame_Print.setLocationRelativeTo(null);
        frame_Print.setName("LISTADO");
        frame_Print.setEnabled(true);
        frame_Print.setTitle("LISTADO");
        frame_Print.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        Table_Background = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table_Foreground = new javax.swing.JTable();

        Table_Background.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Llave", "Nombre", "Tipo", "Tamaño"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Boolean.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Table_Background.setCellSelectionEnabled(true);
        Table_Background.setDoubleBuffered(true);
        Table_Background.setDragEnabled(true);
        Table_Background.setFocusCycleRoot(true);
        Table_Background.setFocusTraversalPolicyProvider(true);
        Table_Background.setInheritsPopupMenu(true);
        jScrollPane2.setViewportView(Table_Background);

        setBackground(new java.awt.Color(255, 255, 255));
        setAutoscrolls(true);
        setFocusCycleRoot(true);
        setFocusTraversalPolicyProvider(true);
        setInheritsPopupMenu(true);
        setMinimumSize(new java.awt.Dimension(100, 100));

        Table_Foreground.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        Table_Foreground.setDoubleBuffered(true);
        Table_Foreground.setDragEnabled(true);
        Table_Foreground.setFocusCycleRoot(true);
        Table_Foreground.setFocusTraversalPolicyProvider(true);
        Table_Foreground.setInheritsPopupMenu(true);
        Table_Foreground.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                Table_ForegroundPropertyChange(evt);
            }
        });
        jScrollPane1.setViewportView(Table_Foreground);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void Table_ForegroundPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_Table_ForegroundPropertyChange
        try {
            // INFO
            if (!desk) {
                //System.out.println(Table_Foreground.getSelectedColumn());
                switch (Table_Foreground.getSelectedColumn()) {
                    case 0: {
                        info.change("   1.- Si     2.- No");
                        break;
                    }
                    case 1: {
                        info.change("   Texto");
                        break;
                    }
                    case 2: {
                        info.change("   1.- Número     2.- Texto");
                        break;
                    }
                    case 3: {
                        info.change("   Número entero");
                        break;
                    }
                }
            }
            // TAB
            int eRow = Table_Foreground.getEditingRow();
            int eColumn = Table_Foreground.getEditingColumn();
            /*
            if (eRow >= Table_Foreground.getRowCount()) {
                eRow = Table_Foreground.getRowC ount() - 1;
            }
            //System.out.println(eColumn + " - " + eRow);
            /* Si hay columna selecta. */
            if (eColumn >= 0) {
                String value = "";
                if (eRow >= Table_Foreground.getRowCount() - 1) {
                    eRow = Table_Foreground.getRowCount() - 1;
                }
                if (eColumn >= Table_Foreground.getColumnCount() - 1) {
                    eColumn = Table_Foreground.getColumnCount() - 1;
                }
                value = Table_Foreground.getValueAt(eRow, eColumn).toString();
                if (value.contains("\\") || value.contains("<")) {
                    JOptionPane.showMessageDialog(null, "Caracteres no permitidos\n(\\, <)", "CONFLICTO", 2);
                    value = value.replace('\\', '/');
                    value = value.replace('<', '>');
                    Table_Foreground.setValueAt(value, eRow, eColumn);
                }
                // TABLA DE DATOS.
                if (desk) {
                    // Tipo
                    if (!"texto".equals(Table_Background.getValueAt(eColumn, 2).toString().toLowerCase())) {
                        try {
                            Integer.parseInt(value);
                        } catch (Exception e) {
                            Table_Foreground.setValueAt("0", eRow, eColumn);
                            value = "0";
                            JOptionPane.showMessageDialog(null, "Inserción inválida", "ERROR", 0);
                        }
                    }
                    // Tamaño
                    if (value.length() > Integer.parseInt(Table_Background.getValueAt(eColumn, 3).toString())) {
                        Table_Foreground.setValueAt(value.substring(0, Integer.parseInt(Table_Background.getValueAt(eColumn, 3).toString())), eRow, eColumn);
                        JOptionPane.showMessageDialog(null, "Tamaño exedido", "ERROR", 0);
                    }
                    // Llave{
                    if (eColumn == key) {
                        for (int i = 0; i < Table_Foreground.getRowCount(); i++) {
                            if (i != eRow) {
                                if (!"texto".equals(Table_Background.getValueAt(key, 2).toString())) {
                                    if (Integer.parseInt(value) == Integer.parseInt(Table_Foreground.getValueAt(i, key).toString())) {
                                        int temp = 0;
                                        do {
                                            try {
                                                temp = Integer.parseInt(JOptionPane.showInputDialog(null, "No puede ingresar datos duplicados\nElija uno nuevo.", "ERROR", 0));
                                            } catch (Exception e) {
                                                temp = Integer.parseInt(value);
                                            }
                                        } while (Integer.parseInt(value) == temp);
                                        Table_Foreground.setValueAt(value = "" + temp, eRow, eColumn);
                                        Table_Foreground.setRowSelectionInterval(eRow, eRow);
                                        Table_Foreground.setColumnSelectionInterval(eColumn, eColumn);
                                        Table_Foreground.setEditingColumn(eColumn);
                                        Table_Foreground.setEditingRow(eRow);
                                        i = -1;
                                    }
                                } else {
                                    if (value.equals(Table_Foreground.getValueAt(i, key).toString())) {
                                        String temp = "";
                                        while (value.equals(temp = JOptionPane.showInputDialog(null, "No puede ingresar datos duplicados\nElija uno nuevo.", "ERROR", 0))) {
                                        }
                                        Table_Foreground.setValueAt(value = temp, eRow, eColumn);
                                        Table_Foreground.setRowSelectionInterval(eRow, eRow);
                                        Table_Foreground.setColumnSelectionInterval(eColumn, eColumn);
                                        Table_Foreground.setEditingColumn(eColumn);
                                        Table_Foreground.setEditingRow(eRow);
                                        i = -1;
                                    }
                                }
                            }
                        }
                    }
                } // TABLA DE DISEÑO.
                else {
                    // Tamaño
                    if (eColumn == 3) {
                        try {
                            Integer.parseInt(value);
                        } catch (Exception e) {
                            Table_Foreground.setValueAt("10", eRow, eColumn);
                            JOptionPane.showMessageDialog(null, "Inserción inválida", "ERROR", 0);
                        }
                    }
                    // Tipo
                    if (eColumn == 2) {
                        switch (value.toLowerCase()) {
                            case "numero":
                            case "número":
                            case "texto": {
                                break;
                            }
                            default: {
                                Table_Foreground.setValueAt("Texto", eRow, eColumn);
                                JOptionPane.showMessageDialog(null, "Inserción inválida\n1.- Número\n2.- Texto", "ERROR", 0);
                            }
                        }
                    }
                    // LLave
                    if (eColumn == 0) {
                        switch (value.toLowerCase()) {
                            case "si": {
                                if (key > -1) {
                                    if (key != eRow) {
                                        if (JOptionPane.showConfirmDialog(null, "La llave primaria ya está definida.\n¿Realizar cambio?", "SUGERENCIA", 1) == 0) {
                                            Table_Foreground.setValueAt("No", key, eColumn);
                                            key = eRow;
                                        } else {
                                            Table_Foreground.setValueAt("No", eRow, eColumn);
                                        }
                                    }
                                } else {
                                    key = eRow;
                                }
                                break;
                            }
                            case "no": {
                                break;
                            }
                            default: {
                                Table_Foreground.resetKeyboardActions();
                                if (key != eRow) {
                                    Table_Foreground.setValueAt("No", eRow, eColumn);
                                } else {
                                    Table_Foreground.setValueAt("Si", eRow, eColumn);
                                }
                                JOptionPane.showMessageDialog(null, "Inserción inválida\n1.- Si\n2.- No", "ERROR", 0);
                            }
                        }
                    }
                    // Campo
                    if (eColumn == 1) {
                        if (value.length() > 50) {
                            Table_Foreground.setValueAt(value.substring(0, 100), eRow, eColumn);
                            JOptionPane.showMessageDialog(null, "Inserción inválida\nTamaño excedido", "ERROR", 0);
                        }
                    }
                }
            }
            if (desk) {
                thread_BTree.setGo(true);
            }
        } catch (Exception e) {
            //e.printStackTrace();
            //System.out.print("ERROR_PROPERTYCHANGE");
        }
    }//GEN-LAST:event_Table_ForegroundPropertyChange

    public String changeTable() {
        Table_Foreground.removeEditor();
        Table_Background.removeEditor();
        if (desk == false) {
            info.change("       Tabla de datos");
            refeshFields();
        } else {
            info.change("       Tabla de diseño");
        }
        TableModel temp = Table_Foreground.getModel();
        DefaultTableModel model = (DefaultTableModel) Table_Background.getModel();
        if (desk == false) {
            model.setColumnIdentifiers(fields);
        }
        Table_Foreground.setModel(model);
        Table_Background.setModel(temp);
        desk = !desk;
        //System.out.println("CAMBIO");
        if (desk) {
            return "Tabla de registro";
        } else {
            return "Tabla de diseño";
        }
    }

    public void plus() {
        DefaultTableModel model = (DefaultTableModel) Table_Foreground.getModel();
        if (desk) {
            model.addRow(new Object[]{""});
        } else {
            String ifKey = "No";
            if (key < 0) {
                ifKey = "Si";
                key = Table_Foreground.getRowCount();
            }
            model.addRow(new Object[]{ifKey, "Campo " + (Table_Foreground.getRowCount() + 1), "Texto", "10"});
        }
        Table_Foreground.setModel(model);
        //System.out.println("PLUS");
        try {
            int eRow = Table_Foreground.getEditingRow();
            //Table_Foreground.resetKeyboardActions();
            if (eRow < 0) {
                Table_Foreground.setEditingRow(0);
            }
        } catch (Exception e) {
            System.out.println("REF_PLUS");
        }
    }

    public void less() {
        Table_Foreground.removeEditor();
        int eRow = Table_Foreground.getEditingRow();
        int eColumn = Table_Foreground.getEditingColumn();
        if (eRow > -1) {
            Table_Foreground.setRowSelectionInterval(eRow, eRow);
            //Table_Foreground.setRowSelectionAllowed(true);
            Table_Foreground.setColumnSelectionInterval(eColumn, eColumn);
            //Table_Foreground.setColumnSelectionAllowed(true);
        }
        if (Table_Foreground.getRowCount() > 0) {
            DefaultTableModel model = (DefaultTableModel) Table_Foreground.getModel();
            if (Table_Foreground.getSelectedRow() < 0) {
                if (!desk) {
                    // LLAVE
                    if (key == Table_Foreground.getRowCount() - 1) {
                        key--;
                    }
                }
                try {
                    Table_Background.removeColumnSelectionInterval(Table_Foreground.getRowCount() - 1, Table_Foreground.getRowCount() - 1);
                    model.removeRow(Table_Foreground.getRowCount() - 1);
                } catch (Exception e) {
                    System.out.println("HEY_REMOVE_SIZE-1");
                }
            } else {
                if (!desk) {
                    if (key > Table_Foreground.getSelectedRow()) {
                        key--;
                    } else if (key == Table_Foreground.getSelectedRow()) {
                        if (key < Table_Foreground.getRowCount() - 1) {
                            if (key - 1 >= 0) {
                                //key--;
                            } else {
                                key++;
                            }
                        } else {
                            key--;
                        }
                    }
                }
                try {
                    if (Table_Foreground.getSelectedRow() < Table_Foreground.getRowCount()) {
                        for (int i = 0; i < Table_Background.getRowCount(); i++) {
                            for (int j = Table_Foreground.getSelectedRow(); j < Table_Background.getColumnCount() - 1; j++) {
                                Table_Background.setValueAt(Table_Background.getValueAt(i, j + 1), i, j);
                            }
                        }
                    }
                    Table_Background.removeColumnSelectionInterval(Table_Foreground.getSelectedRow(), Table_Foreground.getSelectedRow());
                    model.removeRow(Table_Foreground.getSelectedRow());
                } catch (Exception e) {
                    System.out.println("HEY_REMOVE_EDIT");
                }
            }
            if (!desk && Table_Foreground.getRowCount() > 0) {
                Table_Foreground.setValueAt("Si", key, 0);
            }
            Table_Foreground.setModel(model);
            //System.out.println("LESS");
        }
        //Table_Foreground.setEditingRow(Table_Foreground.getEditingRow() - 1);
        try {
            Table_Foreground.resetKeyboardActions();
            if (eRow >= Table_Foreground.getRowCount()) {
                Table_Foreground.setEditingRow(Table_Foreground.getRowCount() - 1);
            }
        } catch (Exception e) {

            System.out.println("REF_LESS");
        }
        Table_Foreground.removeEditor();
    }

    // TEMPORAL
    public void newTable() {
        key = -1;
        close();
        Table_Background.setModel(new DefaultTableModel(0, 3));
        Table_Foreground.setModel(new DefaultTableModel(0, 1));
        DefaultTableModel model = (DefaultTableModel) Table_Background.getModel();
        model.setColumnIdentifiers(design);
        Table_Background.setModel(model);
        desk = true;
        changeTable();
        //System.out.println("NEW");
    }

    public void close() {
        Table_Background.setModel(new DefaultTableModel(0, 0));
        Table_Foreground.setModel(new DefaultTableModel(0, 0));
        try {
            bTree.clean();
        } catch (Exception e) {
        }
        //System.out.println("CLOSE");
    }

    public void save() {
        refeshFields();
        tSave = new Thread_Save(desk, Table_Foreground, Table_Background, fields);
        tSave.run();
        JFC = tSave.getJFC();
        thread_BTree.setGo(true);
    }

    public void open() {
        close();
        Thread_Open tOpen = new Thread_Open(this.key, Table_Foreground, Table_Background);
        tOpen.run();
        JFC = tOpen.getJFC();
        tSave = new Thread_Save(desk, Table_Foreground, Table_Background, fields, JFC);
        this.key = tOpen.getKey();
        desk = true;
        refeshFields();
        thread_BTree.refresh();
        thread_BTree.m.read();
        thread_BTree.setGo(true);
    }

    public void print() {
        frame_Print.getTextArea_Print().setText(TableToString());
        frame_Print.setVisible(true);
        //System.out.println("PRINT");
    }

    public String TableToString() {
        refeshFields();
        String stamp = "";
        for (int i = 0; i < fields.length; i++) {
            stamp += fields[i] + "\t|";
        }
        stamp += "\n";
        if (desk) {
            for (int i = 0; i < Table_Foreground.getRowCount(); i++) {
                for (int j = 0; j < Table_Foreground.getColumnCount(); j++) {
                    stamp += Table_Foreground.getValueAt(i, j) + "\t|";
                }
                stamp += "\n";
            }
        } else {
            for (int i = 0; i < Table_Background.getRowCount(); i++) {
                for (int j = 0; j < Table_Background.getColumnCount(); j++) {
                    stamp += Table_Background.getValueAt(i, j) + "\t|";
                }
                stamp += "\n";
            }
        }
        return stamp;
    }

    public void setInfo(TabBar info) {
        this.info = info;
    }

    public void refeshFields() {
        try {

            naviPanel.getBox_Fields().removeAllItems();
            naviPanelEx.getBox_Fields().removeAllItems();
            if (desk) {
                fields = new Object[Table_Background.getRowCount()];
                for (int i = 0; i < Table_Background.getRowCount(); i++) {
                    fields[i] = Table_Background.getValueAt(i, 1);
                    naviPanel.getBox_Fields().addItem(Table_Background.getValueAt(i, 1).toString());
                    naviPanelEx.getBox_Fields().addItem(Table_Background.getValueAt(i, 1).toString());
                }
            } else {
                fields = new Object[Table_Foreground.getRowCount()];
                for (int i = 0; i < Table_Foreground.getRowCount(); i++) {
                    fields[i] = Table_Foreground.getValueAt(i, 1);
                    naviPanel.getBox_Fields().addItem(Table_Foreground.getValueAt(i, 1).toString());
                    naviPanelEx.getBox_Fields().addItem(Table_Foreground.getValueAt(i, 1).toString());
                }
            }
        } catch (Exception e) {
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Table_Background;
    private javax.swing.JTable Table_Foreground;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
    // TABLA
    private boolean desk;
    private Object[] fields;
    private Object[] design;
    private int key;
    private TabBar info;
    // DIALOGO
    private JFileChooser JFC;
    // THREAD
    private Thread_Save tSave;
    private Thread_BTree thread_BTree;
    private Thread bTree_Manager;
    public Thread_Find thread_Tree;
    private Thread tree_Manager;
    // ELEMENTO
    private BTree bTree;
    private NavigationPanel naviPanel;
    private NavigationPanel naviPanelEx;
    // IMPRESION
    Frame_Print frame_Print;

    public NavigationPanel getNaviPanel() {
        return naviPanel;
    }

    public void setNaviPanel(NavigationPanel naviPanel) {
        this.naviPanel = naviPanel;
    }

    public NavigationPanel getNaviPanelEx() {
        return naviPanelEx;
    }

    public void setNaviPanelEx(NavigationPanel naviPanelEx) {
        this.naviPanelEx = naviPanelEx;
    }

    public JFileChooser getJFC() {
        return JFC;
    }

    public Thread_Save gettSave() {
        return tSave;
    }

    public JTable getTable_Background() {
        return Table_Background;
    }

    public JTable getTable_Foreground() {
        return Table_Foreground;
    }

    public boolean isDesk() {
        return desk;
    }

    public Object[] getFields() {
        return fields;
    }

    public TabBar getInfo() {
        return info;
    }

    public void setJFC(JFileChooser JFC) {
        this.JFC = JFC;
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

    public Thread_BTree getThread_BTree() {
        return thread_BTree;
    }

    public void setThread_BTree(Thread_BTree thread_BTree) {
        this.thread_BTree = thread_BTree;
    }

    public Thread getbTree_Manager() {
        return bTree_Manager;
    }

    public void setbTree_Manager(Thread bTree_Manager) {
        this.bTree_Manager = bTree_Manager;
    }

    public Thread_Find getThread_Tree() {
        return thread_Tree;
    }

    public void setThread_Tree(Thread_Find thread_Tree) {
        this.thread_Tree = thread_Tree;
    }

    public Thread getTree_Manager() {
        return tree_Manager;
    }

    public void setTree_Manager(Thread tree_Manager) {
        this.tree_Manager = tree_Manager;
    }

}
