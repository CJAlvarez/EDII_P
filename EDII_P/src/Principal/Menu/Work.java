/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal.Menu;

import java.awt.Dimension;
import java.awt.Toolkit;

/**
 *
 * @author USER PC
 */
public class Work extends javax.swing.JFrame {

    /**
     * Creates new form Works
     */
    public Work() {
        initComponents();
        init();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        toolBar1 = new Principal.Menu.Elements.ToolBar();
        navigationPanel1 = new Principal.Menu.Elements.NavigationPanel();
        tabBar1 = new Principal.Menu.Elements.TabBar();
        deskPanel1 = new Principal.Menu.Elements.DeskPanel();
        statusBar1 = new Principal.Menu.Elements.StatusBar();
        MenuBar = new javax.swing.JMenuBar();
        Menu_File = new javax.swing.JMenu();
        Menu_Edit = new javax.swing.JMenu();
        Menu_View = new javax.swing.JMenu();
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
        jPanel1.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                jPanel1formComponentResized(evt);
            }
        });

        javax.swing.GroupLayout toolBar1Layout = new javax.swing.GroupLayout(toolBar1);
        toolBar1.setLayout(toolBar1Layout);
        toolBar1Layout.setHorizontalGroup(
            toolBar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        toolBar1Layout.setVerticalGroup(
            toolBar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 63, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout tabBar1Layout = new javax.swing.GroupLayout(tabBar1);
        tabBar1.setLayout(tabBar1Layout);
        tabBar1Layout.setHorizontalGroup(
            tabBar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 465, Short.MAX_VALUE)
        );
        tabBar1Layout.setVerticalGroup(
            tabBar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 29, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout deskPanel1Layout = new javax.swing.GroupLayout(deskPanel1);
        deskPanel1.setLayout(deskPanel1Layout);
        deskPanel1Layout.setHorizontalGroup(
            deskPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        deskPanel1Layout.setVerticalGroup(
            deskPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(navigationPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tabBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(deskPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addComponent(toolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(statusBar1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(toolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(tabBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(deskPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(navigationPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 582, Short.MAX_VALUE))
                .addGap(0, 0, 0)
                .addComponent(statusBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        MenuBar.setBackground(new java.awt.Color(55, 41, 40));
        MenuBar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        MenuBar.setForeground(new java.awt.Color(55, 41, 40));
        MenuBar.setToolTipText("");
        MenuBar.setAlignmentX(0.0F);
        MenuBar.setAlignmentY(0.0F);
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
        Menu_File.setOpaque(false);
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
        Menu_Edit.setOpaque(false);
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
        Menu_View.setOpaque(false);
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
        Menu_Window.setOpaque(false);
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
        Menu_Help.setOpaque(false);
        MenuBar.add(Menu_Help);

        setJMenuBar(MenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 681, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 681, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(716, 745));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel1formComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jPanel1formComponentResized
        //menuBar.setSize(this.getWidth(), 30);
        // dimension = this.getSize();
    }//GEN-LAST:event_jPanel1formComponentResized

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
            java.util.logging.Logger.getLogger(Work.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Work.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Work.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Work.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Work().setVisible(true);
            }
        });
    }

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
    private javax.swing.JMenuBar MenuBar;
    private javax.swing.JMenu Menu_Edit;
    private javax.swing.JMenu Menu_File;
    private javax.swing.JMenu Menu_Help;
    private javax.swing.JMenu Menu_View;
    private javax.swing.JMenu Menu_Window;
    private Principal.Menu.Elements.DeskPanel deskPanel1;
    private javax.swing.JPanel jPanel1;
    private Principal.Menu.Elements.NavigationPanel navigationPanel1;
    private Principal.Menu.Elements.StatusBar statusBar1;
    private Principal.Menu.Elements.TabBar tabBar1;
    private Principal.Menu.Elements.ToolBar toolBar1;
    // End of variables declaration//GEN-END:variables
}
