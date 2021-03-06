package Principal;

import Desk.Excel_Manager;
import Desk.XML_Manager;
import Principal.Menu.Elements.DeskPanel;
import Principal.Menu.Elements.Frame_FEE;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;

/**
 *
 * @author CJ
 */
public class Work_Menu extends javax.swing.JFrame {

    public Work_Menu() {
        initComponents();
        deskPanel.setInfo(tabBar1);
        deskPanel.setNaviPanel(navigationPanel1);

        frame_FEE = new Frame_FEE();
        frame_FEE.setWm(this);
        frame_FEE.setResizable(true);
        frame_FEE.setLocationRelativeTo(null);
        frame_FEE.setName("MODIFICAR");
        frame_FEE.setEnabled(true);
        frame_FEE.setTitle("MODIFICAR");
        frame_FEE.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        //frame_FEE.setNavigationPanel1(navigationPanel1);
        deskPanel.setNaviPanelEx(frame_FEE.getNavigationPanel1());
        init();
        enableI(false);
    }

    // INIT_COMPONENTS_BUG
    /**
     * @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        statusBar1 = new Principal.Menu.Elements.StatusBar();
        jPanel1 = new javax.swing.JPanel();
        tabBar1 = new Principal.Menu.Elements.TabBar();
        navigationPanel1 = new Principal.Menu.Elements.NavigationPanel();
        toolBar1 = new Principal.Menu.Elements.ToolBar();
        MenuBar = new javax.swing.JMenuBar();
        Menu_File = new javax.swing.JMenu();
        Item_New = new javax.swing.JMenuItem();
        Item_Open = new javax.swing.JMenuItem();
        Item_Save = new javax.swing.JMenuItem();
        Item_SaveAs = new javax.swing.JMenuItem();
        Item_Close = new javax.swing.JMenuItem();
        Item_Exit = new javax.swing.JMenuItem();
        Menu_Edit = new javax.swing.JMenu();
        Menu_Field = new javax.swing.JMenu();
        Item_NewField = new javax.swing.JMenuItem();
        Item_PrintField = new javax.swing.JMenuItem();
        Item_DeleteField = new javax.swing.JMenuItem();
        Menu_Record = new javax.swing.JMenu();
        Item_PrintRecord = new javax.swing.JMenuItem();
        Item_EditRecord = new javax.swing.JMenuItem();
        Item_FindRecord = new javax.swing.JMenuItem();
        Item_DeleteRecord = new javax.swing.JMenuItem();
        Menu_Export = new javax.swing.JMenu();
        Item_Excel = new javax.swing.JMenuItem();
        Item_Xml = new javax.swing.JMenuItem();
        Menu_View = new javax.swing.JMenu();
        Item_ChangeTable = new javax.swing.JMenuItem();
        Menu_Window = new javax.swing.JMenu();
        Menu_Help = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout statusBar1Layout = new javax.swing.GroupLayout(statusBar1);
        statusBar1.setLayout(statusBar1Layout);
        statusBar1Layout.setHorizontalGroup(
            statusBar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        statusBar1Layout.setVerticalGroup(
            statusBar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 31, Short.MAX_VALUE)
        );

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));
        jPanel1.setAutoscrolls(true);
        jPanel1.setDebugGraphicsOptions(javax.swing.DebugGraphics.BUFFERED_OPTION);
        jPanel1.setFocusCycleRoot(true);
        jPanel1.setFocusTraversalPolicyProvider(true);
        jPanel1.setName(""); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(700, 700));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(navigationPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(tabBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(tabBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(navigationPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout toolBar1Layout = new javax.swing.GroupLayout(toolBar1);
        toolBar1.setLayout(toolBar1Layout);
        toolBar1Layout.setHorizontalGroup(
            toolBar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 673, Short.MAX_VALUE)
        );
        toolBar1Layout.setVerticalGroup(
            toolBar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 45, Short.MAX_VALUE)
        );

        MenuBar.setBackground(new java.awt.Color(55, 41, 40));
        MenuBar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        MenuBar.setForeground(new java.awt.Color(55, 41, 40));
        MenuBar.setToolTipText("");
        MenuBar.setAlignmentX(0.0F);
        MenuBar.setBorderPainted(false);
        MenuBar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        MenuBar.setDoubleBuffered(true);
        MenuBar.setFocusCycleRoot(true);
        MenuBar.setFocusTraversalPolicyProvider(true);
        MenuBar.setInheritsPopupMenu(true);
        MenuBar.setPreferredSize(new java.awt.Dimension(56, 25));

        Menu_File.setBackground(new java.awt.Color(55, 41, 40));
        Menu_File.setBorder(null);
        Menu_File.setForeground(new java.awt.Color(255, 255, 255));
        Menu_File.setText("Archivo  ");
        Menu_File.setAlignmentX(0.0F);
        Menu_File.setAlignmentY(0.0F);
        Menu_File.setContentAreaFilled(false);
        Menu_File.setDoubleBuffered(true);
        Menu_File.setFocusCycleRoot(true);
        Menu_File.setFocusPainted(true);
        Menu_File.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        Item_New.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        Item_New.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Window/New_20.png"))); // NOI18N
        Item_New.setText("Nuevo");
        Item_New.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Item_NewActionPerformed(evt);
            }
        });
        Menu_File.add(Item_New);

        Item_Open.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        Item_Open.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Window/Open_20.png"))); // NOI18N
        Item_Open.setText("Abrir");
        Item_Open.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Item_OpenActionPerformed(evt);
            }
        });
        Menu_File.add(Item_Open);

        Item_Save.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.CTRL_MASK));
        Item_Save.setText("Guardar");
        Item_Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Item_SaveActionPerformed(evt);
            }
        });
        Menu_File.add(Item_Save);

        Item_SaveAs.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        Item_SaveAs.setText("Guardar como...");
        Item_SaveAs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Item_SaveAsActionPerformed(evt);
            }
        });
        Menu_File.add(Item_SaveAs);

        Item_Close.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
        Item_Close.setText("Cerrar");
        Item_Close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Item_CloseActionPerformed(evt);
            }
        });
        Menu_File.add(Item_Close);

        Item_Exit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        Item_Exit.setText("Salir");
        Item_Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Item_ExitActionPerformed(evt);
            }
        });
        Menu_File.add(Item_Exit);

        MenuBar.add(Menu_File);

        Menu_Edit.setBackground(new java.awt.Color(55, 41, 40));
        Menu_Edit.setBorder(null);
        Menu_Edit.setForeground(new java.awt.Color(255, 255, 255));
        Menu_Edit.setText("Editar  ");
        Menu_Edit.setAlignmentX(0.0F);
        Menu_Edit.setAlignmentY(0.0F);
        Menu_Edit.setContentAreaFilled(false);
        Menu_Edit.setDoubleBuffered(true);
        Menu_Edit.setFocusCycleRoot(true);
        Menu_Edit.setFocusPainted(true);
        Menu_Edit.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        Menu_Field.setText("Campo");

        Item_NewField.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.ALT_MASK));
        Item_NewField.setText("Crear");
        Item_NewField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Item_NewFieldActionPerformed(evt);
            }
        });
        Menu_Field.add(Item_NewField);

        Item_PrintField.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.ALT_MASK));
        Item_PrintField.setText("Listar");
        Item_PrintField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Item_PrintFieldActionPerformed(evt);
            }
        });
        Menu_Field.add(Item_PrintField);

        Item_DeleteField.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.ALT_MASK));
        Item_DeleteField.setText("Borrar");
        Item_DeleteField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Item_DeleteFieldActionPerformed(evt);
            }
        });
        Menu_Field.add(Item_DeleteField);

        Menu_Edit.add(Menu_Field);

        Menu_Record.setText("Registro");

        Item_PrintRecord.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_MASK));
        Item_PrintRecord.setText("Listar");
        Item_PrintRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Item_PrintRecordActionPerformed(evt);
            }
        });
        Menu_Record.add(Item_PrintRecord);

        Item_EditRecord.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.CTRL_MASK));
        Item_EditRecord.setText("Modificar");
        Item_EditRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Item_EditRecordActionPerformed(evt);
            }
        });
        Menu_Record.add(Item_EditRecord);

        Item_FindRecord.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.CTRL_MASK));
        Item_FindRecord.setText("Buscar");
        Item_FindRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Item_FindRecordActionPerformed(evt);
            }
        });
        Menu_Record.add(Item_FindRecord);

        Item_DeleteRecord.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_MASK));
        Item_DeleteRecord.setText("Borrar");
        Item_DeleteRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Item_DeleteRecordActionPerformed(evt);
            }
        });
        Menu_Record.add(Item_DeleteRecord);

        Menu_Edit.add(Menu_Record);

        Menu_Export.setText("Exportar");

        Item_Excel.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        Item_Excel.setText("Excel");
        Item_Excel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Item_ExcelActionPerformed(evt);
            }
        });
        Menu_Export.add(Item_Excel);

        Item_Xml.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
        Item_Xml.setText("Xml");
        Item_Xml.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Item_XmlActionPerformed(evt);
            }
        });
        Menu_Export.add(Item_Xml);

        Menu_Edit.add(Menu_Export);

        MenuBar.add(Menu_Edit);

        Menu_View.setBackground(new java.awt.Color(55, 41, 40));
        Menu_View.setBorder(null);
        Menu_View.setForeground(new java.awt.Color(255, 255, 255));
        Menu_View.setText("Vista  ");
        Menu_View.setAlignmentX(0.0F);
        Menu_View.setAlignmentY(0.0F);
        Menu_View.setContentAreaFilled(false);
        Menu_View.setDoubleBuffered(true);
        Menu_View.setFocusCycleRoot(true);
        Menu_View.setFocusPainted(true);
        Menu_View.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        Item_ChangeTable.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_MASK));
        Item_ChangeTable.setText("Cambiar Tabla");
        Item_ChangeTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Item_ChangeTableActionPerformed(evt);
            }
        });
        Menu_View.add(Item_ChangeTable);

        MenuBar.add(Menu_View);

        Menu_Window.setBackground(new java.awt.Color(55, 41, 40));
        Menu_Window.setBorder(null);
        Menu_Window.setForeground(new java.awt.Color(255, 255, 255));
        Menu_Window.setText("Ventana  ");
        Menu_Window.setAlignmentX(0.0F);
        Menu_Window.setAlignmentY(0.0F);
        Menu_Window.setContentAreaFilled(false);
        Menu_Window.setDoubleBuffered(true);
        Menu_Window.setFocusCycleRoot(true);
        Menu_Window.setFocusPainted(true);
        Menu_Window.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        MenuBar.add(Menu_Window);

        Menu_Help.setBackground(new java.awt.Color(55, 41, 40));
        Menu_Help.setBorder(null);
        Menu_Help.setForeground(new java.awt.Color(255, 255, 255));
        Menu_Help.setText("Ayuda  ");
        Menu_Help.setAlignmentX(0.0F);
        Menu_Help.setAlignmentY(0.0F);
        Menu_Help.setContentAreaFilled(false);
        Menu_Help.setDoubleBuffered(true);
        Menu_Help.setFocusCycleRoot(true);
        Menu_Help.setFocusPainted(true);
        Menu_Help.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        MenuBar.add(Menu_Help);

        setJMenuBar(MenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(toolBar1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 673, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(statusBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 673, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(toolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(statusBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        setSize(new java.awt.Dimension(689, 430));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
*/
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        tabBar1 = new Principal.Menu.Elements.TabBar();
        navigationPanel1 = new Principal.Menu.Elements.NavigationPanel();
        statusBar1 = new Principal.Menu.Elements.StatusBar();
        deskPanel = new Principal.Menu.Elements.DeskPanel();
        toolBar1 = new Principal.Menu.Elements.ToolBar();
        MenuBar = new javax.swing.JMenuBar();
        Menu_File = new javax.swing.JMenu();
        Item_New = new javax.swing.JMenuItem();
        Item_Open = new javax.swing.JMenuItem();
        Item_Save = new javax.swing.JMenuItem();
        Item_SaveAs = new javax.swing.JMenuItem();
        Item_Close = new javax.swing.JMenuItem();
        Item_Exit = new javax.swing.JMenuItem();
        Menu_Edit = new javax.swing.JMenu();
        Menu_Field = new javax.swing.JMenu();
        Item_NewField = new javax.swing.JMenuItem();
        Item_PrintField = new javax.swing.JMenuItem();
        Item_DeleteField = new javax.swing.JMenuItem();
        Menu_Record = new javax.swing.JMenu();
        Item_PrintRecord = new javax.swing.JMenuItem();
        Item_EditRecord = new javax.swing.JMenuItem();
        Item_FindRecord = new javax.swing.JMenuItem();
        Item_DeleteRecord = new javax.swing.JMenuItem();
        Menu_Export = new javax.swing.JMenu();
        Item_Excel = new javax.swing.JMenuItem();
        Item_Xml = new javax.swing.JMenuItem();
        Menu_View = new javax.swing.JMenu();
        Item_ChangeTable = new javax.swing.JMenuItem();
        Menu_Window = new javax.swing.JMenu();
        Menu_Help = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));
        jPanel1.setAutoscrolls(true);
        jPanel1.setDebugGraphicsOptions(javax.swing.DebugGraphics.BUFFERED_OPTION);
        jPanel1.setFocusCycleRoot(true);
        jPanel1.setFocusTraversalPolicyProvider(true);
        jPanel1.setName(""); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(700, 700));

        javax.swing.GroupLayout statusBar1Layout = new javax.swing.GroupLayout(statusBar1);
        statusBar1.setLayout(statusBar1Layout);
        statusBar1Layout.setHorizontalGroup(
                statusBar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 0, Short.MAX_VALUE)
        );
        statusBar1Layout.setVerticalGroup(
                statusBar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 36, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(statusBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(navigationPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, 0)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(tabBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 725, Short.MAX_VALUE)
                                                        .addComponent(deskPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                .addGap(0, 0, 0))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(navigationPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(tabBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, 0)
                                                .addComponent(deskPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)))
                                .addComponent(statusBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout toolBar1Layout = new javax.swing.GroupLayout(toolBar1);
        toolBar1.setLayout(toolBar1Layout);
        toolBar1Layout.setHorizontalGroup(
                toolBar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 0, Short.MAX_VALUE)
        );
        toolBar1Layout.setVerticalGroup(
                toolBar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 45, Short.MAX_VALUE)
        );

        MenuBar.setBackground(new java.awt.Color(55, 41, 40));
        MenuBar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        MenuBar.setForeground(new java.awt.Color(55, 41, 40));
        MenuBar.setToolTipText("");
        MenuBar.setAlignmentX(0.0F);
        MenuBar.setBorderPainted(false);
        MenuBar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        MenuBar.setDoubleBuffered(true);
        MenuBar.setFocusCycleRoot(true);
        MenuBar.setFocusTraversalPolicyProvider(true);
        MenuBar.setInheritsPopupMenu(true);
        MenuBar.setPreferredSize(new java.awt.Dimension(56, 25));

        Menu_File.setBackground(new java.awt.Color(55, 41, 40));
        Menu_File.setBorder(null);
        Menu_File.setForeground(new java.awt.Color(255, 255, 255));
        Menu_File.setText("Archivo  ");
        Menu_File.setAlignmentX(0.0F);
        Menu_File.setAlignmentY(0.0F);
        Menu_File.setContentAreaFilled(false);
        Menu_File.setDoubleBuffered(true);
        Menu_File.setFocusCycleRoot(true);
        Menu_File.setFocusPainted(true);
        Menu_File.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        Item_New.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        Item_New.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Window/New_20.png"))); // NOI18N
        Item_New.setText("Nuevo");
        Item_New.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Item_NewActionPerformed(evt);
            }
        });
        Menu_File.add(Item_New);

        Item_Open.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        Item_Open.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Window/Open_20.png"))); // NOI18N
        Item_Open.setText("Abrir");
        Item_Open.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Item_OpenActionPerformed(evt);
            }
        });
        Menu_File.add(Item_Open);

        Item_Save.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.CTRL_MASK));
        Item_Save.setText("Guardar");
        Item_Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Item_SaveActionPerformed(evt);
            }
        });
        Menu_File.add(Item_Save);

        Item_SaveAs.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        Item_SaveAs.setText("Guardar como...");
        Item_SaveAs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Item_SaveAsActionPerformed(evt);
            }
        });
        Menu_File.add(Item_SaveAs);

        Item_Close.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
        Item_Close.setText("Cerrar");
        Item_Close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Item_CloseActionPerformed(evt);
            }
        });
        Menu_File.add(Item_Close);

        Item_Exit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        Item_Exit.setText("Salir");
        Item_Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Item_ExitActionPerformed(evt);
            }
        });
        Menu_File.add(Item_Exit);

        MenuBar.add(Menu_File);

        Menu_Edit.setBackground(new java.awt.Color(55, 41, 40));
        Menu_Edit.setBorder(null);
        Menu_Edit.setForeground(new java.awt.Color(255, 255, 255));
        Menu_Edit.setText("Editar  ");
        Menu_Edit.setAlignmentX(0.0F);
        Menu_Edit.setAlignmentY(0.0F);
        Menu_Edit.setContentAreaFilled(false);
        Menu_Edit.setDoubleBuffered(true);
        Menu_Edit.setFocusCycleRoot(true);
        Menu_Edit.setFocusPainted(true);
        Menu_Edit.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        Menu_Field.setText("Campo");

        Item_NewField.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.ALT_MASK));
        Item_NewField.setText("Crear");
        Item_NewField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Item_NewFieldActionPerformed(evt);
            }
        });
        Menu_Field.add(Item_NewField);

        Item_PrintField.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.ALT_MASK));
        Item_PrintField.setText("Listar");
        Item_PrintField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Item_PrintFieldActionPerformed(evt);
            }
        });
        Menu_Field.add(Item_PrintField);

        Item_DeleteField.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.ALT_MASK));
        Item_DeleteField.setText("Borrar");
        Item_DeleteField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Item_DeleteFieldActionPerformed(evt);
            }
        });
        Menu_Field.add(Item_DeleteField);

        Menu_Edit.add(Menu_Field);

        Menu_Record.setText("Registro");

        Item_PrintRecord.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_MASK));
        Item_PrintRecord.setText("Listar");
        Item_PrintRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Item_PrintRecordActionPerformed(evt);
            }
        });
        Menu_Record.add(Item_PrintRecord);

        Item_EditRecord.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.CTRL_MASK));
        Item_EditRecord.setText("Modificar");
        Item_EditRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Item_EditRecordActionPerformed(evt);
            }
        });
        Menu_Record.add(Item_EditRecord);

        Item_FindRecord.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.CTRL_MASK));
        Item_FindRecord.setText("Buscar");
        Item_FindRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Item_FindRecordActionPerformed(evt);
            }
        });
        Menu_Record.add(Item_FindRecord);

        Item_DeleteRecord.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_MASK));
        Item_DeleteRecord.setText("Borrar");
        Item_DeleteRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Item_DeleteRecordActionPerformed(evt);
            }
        });
        Menu_Record.add(Item_DeleteRecord);

        Menu_Edit.add(Menu_Record);

        Menu_Export.setText("Exportar");

        Item_Excel.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        Item_Excel.setText("Excel");
        Item_Excel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Item_ExcelActionPerformed(evt);
            }
        });
        Menu_Export.add(Item_Excel);

        Item_Xml.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
        Item_Xml.setText("Xml");
        Item_Xml.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Item_XmlActionPerformed(evt);
            }
        });
        Menu_Export.add(Item_Xml);

        Menu_Edit.add(Menu_Export);

        MenuBar.add(Menu_Edit);

        Menu_View.setBackground(new java.awt.Color(55, 41, 40));
        Menu_View.setBorder(null);
        Menu_View.setForeground(new java.awt.Color(255, 255, 255));
        Menu_View.setText("Vista  ");
        Menu_View.setAlignmentX(0.0F);
        Menu_View.setAlignmentY(0.0F);
        Menu_View.setContentAreaFilled(false);
        Menu_View.setDoubleBuffered(true);
        Menu_View.setFocusCycleRoot(true);
        Menu_View.setFocusPainted(true);
        Menu_View.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        Item_ChangeTable.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_MASK));
        Item_ChangeTable.setText("Cambiar Tabla");
        Item_ChangeTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Item_ChangeTableActionPerformed(evt);
            }
        });
        Menu_View.add(Item_ChangeTable);

        MenuBar.add(Menu_View);

        Menu_Window.setBackground(new java.awt.Color(55, 41, 40));
        Menu_Window.setBorder(null);
        Menu_Window.setForeground(new java.awt.Color(255, 255, 255));
        Menu_Window.setText("Ventana  ");
        Menu_Window.setAlignmentX(0.0F);
        Menu_Window.setAlignmentY(0.0F);
        Menu_Window.setContentAreaFilled(false);
        Menu_Window.setDoubleBuffered(true);
        Menu_Window.setFocusCycleRoot(true);
        Menu_Window.setFocusPainted(true);
        Menu_Window.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        MenuBar.add(Menu_Window);

        Menu_Help.setBackground(new java.awt.Color(55, 41, 40));
        Menu_Help.setBorder(null);
        Menu_Help.setForeground(new java.awt.Color(255, 255, 255));
        Menu_Help.setText("Ayuda  ");
        Menu_Help.setAlignmentX(0.0F);
        Menu_Help.setAlignmentY(0.0F);
        Menu_Help.setContentAreaFilled(false);
        Menu_Help.setDoubleBuffered(true);
        Menu_Help.setFocusCycleRoot(true);
        Menu_Help.setFocusPainted(true);
        Menu_Help.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        MenuBar.add(Menu_Help);

        setJMenuBar(MenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 960, Short.MAX_VALUE)
                        .addComponent(toolBar1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 960, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(toolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 239, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(976, 348));
        setLocationRelativeTo(null);
    }// </editor-fold>                        


    private void Item_NewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Item_NewActionPerformed
        try {
            deskPanel.newTable();
            enableI(true);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_Item_NewActionPerformed

    private void Item_NewFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Item_NewFieldActionPerformed
        try {
            deskPanel.plus();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_Item_NewFieldActionPerformed

    private void Item_DeleteFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Item_DeleteFieldActionPerformed
        try {
            deskPanel.less();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_Item_DeleteFieldActionPerformed

    private void Item_ChangeTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Item_ChangeTableActionPerformed
        try {
            deskPanel.changeTable();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_Item_ChangeTableActionPerformed

    private void Item_CloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Item_CloseActionPerformed
        try {
            if (JOptionPane.showConfirmDialog(null, "¿Desea guardar?", "CERRAR", 2) == 0) {
                deskPanel.save();
            }
            deskPanel.close();
            enableI(false);
            tabBar1.change("");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No hay una tabla abierta", "ERROR", 2);
        }
    }//GEN-LAST:event_Item_CloseActionPerformed

    private void Item_ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Item_ExitActionPerformed
        try {
            System.exit(0);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_Item_ExitActionPerformed

    private void Item_SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Item_SaveActionPerformed
        try {
            try {
                deskPanel.refeshFields();
                deskPanel.gettSave().setDesk(deskPanel.isDesk());
                deskPanel.gettSave().setBackground(deskPanel.getTable_Background());
                deskPanel.gettSave().setForeground(deskPanel.getTable_Foreground());
                deskPanel.gettSave().setFields(deskPanel.getFields());
                deskPanel.gettSave().setJFC(deskPanel.getJFC());
                deskPanel.gettSave().run();
            } catch (Exception e) {
                deskPanel.save();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Tabla inexistente o nula", "ERROR", 0);
            //e.printStackTrace();
            //System.out.println("ERROR_ITEM_SAVE");
        }
    }//GEN-LAST:event_Item_SaveActionPerformed

    private void Item_ExcelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Item_ExcelActionPerformed
        //Prueba
        String nombreCampo = "Nombre";
        String dato = "Daniel";
        Excel_Manager writeExcel = new Excel_Manager();
        writeExcel.exportarCampo(nombreCampo, dato);
    }//GEN-LAST:event_Item_ExcelActionPerformed

    private void Item_XmlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Item_XmlActionPerformed
        // TODO add your handling code here:
        try {
            XML_Manager xml = new XML_Manager();
            xml.exportarCampo("1", "Edad", "int", "10");
        } catch (Exception e) {
        }
    }//GEN-LAST:event_Item_XmlActionPerformed

    private void Item_SaveAsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Item_SaveAsActionPerformed
        try {
            deskPanel.save();
        } catch (Exception e) {
            System.out.println("ERROR_SAVEAS");
        }
    }//GEN-LAST:event_Item_SaveAsActionPerformed

    private void Item_OpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Item_OpenActionPerformed
        try {
            deskPanel.open();
            enableI(true);
        } catch (Exception e) {
            //System.out.println("ERROR_ITEM_OPEN");
        }
    }//GEN-LAST:event_Item_OpenActionPerformed

    private void Item_PrintFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Item_PrintFieldActionPerformed
        try {
            deskPanel.print();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Archivo roto", "ERROR", 0);
        }
    }//GEN-LAST:event_Item_PrintFieldActionPerformed

    private void Item_PrintRecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Item_PrintRecordActionPerformed
        try {
            deskPanel.print();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Archivo roto", "ERROR", 0);
        }
    }//GEN-LAST:event_Item_PrintRecordActionPerformed

    private void Item_EditRecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Item_EditRecordActionPerformed
        principalNavi = false;
        enableI(true);
        frame_FEE.getjTabbedPane1().setSelectedIndex(0);
        frame_FEE.setVisible(true);
    }//GEN-LAST:event_Item_EditRecordActionPerformed

    private void Item_FindRecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Item_FindRecordActionPerformed
        principalNavi = false;
        enableI(true);
        frame_FEE.getjTabbedPane1().setSelectedIndex(0);
        frame_FEE.setVisible(true);
    }//GEN-LAST:event_Item_FindRecordActionPerformed

    private void Item_DeleteRecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Item_DeleteRecordActionPerformed
        principalNavi = false;
        enableI(true);
        frame_FEE.getjTabbedPane1().setSelectedIndex(1);
        frame_FEE.setVisible(true);
    }//GEN-LAST:event_Item_DeleteRecordActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Darcula".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Work_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Work_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Work_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Work_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Work_Menu().setVisible(true);
            }
        });
    }

    /**
     *
     * @param b
     */
    public void enableI(boolean b) {
        navigationPanel1.getButton_Find().setEnabled(b);
        frame_FEE.getNavigationPanel1().getButton_Find().setEnabled(b);
        Item_Close.setEnabled(b);
        Item_Save.setEnabled(b);
        Item_SaveAs.setEnabled(b);
        Menu_Edit.setEnabled(b);
        Menu_Export.setEnabled(b);
        Menu_View.setEnabled(b);
        if (b) {
            System.out.println(principalNavi);
            if (principalNavi) {
                deskPanel.setNaviPanel(navigationPanel1);
                navigationPanel1.dP = deskPanel;
                frame_FEE.getNavigationPanel1().flag = false;
            } else {
                DeskPanel dest = deskPanel;
                dest.setNaviPanel(frame_FEE.getNavigationPanel1());
                frame_FEE.getNavigationPanel1().dP = dest;
                navigationPanel1.flag = false;
            }
        }
    }

    public boolean principalNavi = true;

    private boolean init() {
        try {
            Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
            this.setSize((int) (screenSize.getWidth() * 0.85), (int) (screenSize.getHeight() * 0.85));
            this.setLocationRelativeTo(null);
            return true;
        } catch (Exception e) {
            System.out.println("ERROR_WALL");
            return false;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Item_ChangeTable;
    private javax.swing.JMenuItem Item_Close;
    private javax.swing.JMenuItem Item_DeleteField;
    private javax.swing.JMenuItem Item_DeleteRecord;
    private javax.swing.JMenuItem Item_EditRecord;
    private javax.swing.JMenuItem Item_Excel;
    private javax.swing.JMenuItem Item_Exit;
    private javax.swing.JMenuItem Item_FindRecord;
    private javax.swing.JMenuItem Item_New;
    private javax.swing.JMenuItem Item_NewField;
    private javax.swing.JMenuItem Item_Open;
    private javax.swing.JMenuItem Item_PrintField;
    private javax.swing.JMenuItem Item_PrintRecord;
    private javax.swing.JMenuItem Item_Save;
    private javax.swing.JMenuItem Item_SaveAs;
    private javax.swing.JMenuItem Item_Xml;
    javax.swing.JMenuBar MenuBar;
    private javax.swing.JMenu Menu_Edit;
    private javax.swing.JMenu Menu_Export;
    private javax.swing.JMenu Menu_Field;
    private javax.swing.JMenu Menu_File;
    private javax.swing.JMenu Menu_Help;
    private javax.swing.JMenu Menu_Record;
    private javax.swing.JMenu Menu_View;
    private javax.swing.JMenu Menu_Window;
    private javax.swing.JPanel jPanel1;
    private Principal.Menu.Elements.NavigationPanel navigationPanel1;
    private Principal.Menu.Elements.StatusBar statusBar1;
    private Principal.Menu.Elements.TabBar tabBar1;
    private Principal.Menu.Elements.ToolBar toolBar1;
    // End of variables declaration//GEN-END:variables
    private Principal.Menu.Elements.DeskPanel deskPanel;
    public Frame_FEE frame_FEE;

}
