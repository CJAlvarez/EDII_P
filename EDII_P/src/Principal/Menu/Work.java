package Principal.Menu;

import java.awt.Dimension;
import java.awt.Toolkit;

/**
 *
 * @author CJ*
 */
public class Work extends javax.swing.JPanel {

    /**
     * Creates new form Simple
     */
    public Work() {
        
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuBar1 = new Principal.Menu.Elements.MenuBar();
        toolBar1 = new Principal.Menu.Elements.ToolBar();
        navigationPanel1 = new Principal.Menu.Elements.NavigationPanel();
        tabBar1 = new Principal.Menu.Elements.TabBar();
        deskPanel1 = new Principal.Menu.Elements.DeskPanel();
        statusBar1 = new Principal.Menu.Elements.StatusBar();

        setBackground(new java.awt.Color(153, 153, 255));
        setAutoscrolls(true);
        setDebugGraphicsOptions(javax.swing.DebugGraphics.BUFFERED_OPTION);
        setFocusCycleRoot(true);
        setFocusTraversalPolicyProvider(true);
        setName(""); // NOI18N
        setPreferredSize(new java.awt.Dimension(120, 12));
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                formComponentResized(evt);
            }
        });

        menuBar1.setBorder(null);
        menuBar1.setDoubleBuffered(true);
        menuBar1.setMinimumSize(new java.awt.Dimension(0, 0));

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
            .addGap(0, 580, Short.MAX_VALUE)
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(navigationPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tabBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, 0)
                        .addComponent(deskPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addComponent(menuBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(toolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(statusBar1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(menuBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(toolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tabBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(deskPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(navigationPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 341, Short.MAX_VALUE))
                .addGap(0, 0, 0)
                .addComponent(statusBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentResized
        //menuBar.setSize(this.getWidth(), 30);
        dimension = this.getSize();
    }//GEN-LAST:event_formComponentResized

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Principal.Menu.Elements.DeskPanel deskPanel1;
    private Principal.Menu.Elements.MenuBar menuBar1;
    private Principal.Menu.Elements.NavigationPanel navigationPanel1;
    private Principal.Menu.Elements.StatusBar statusBar1;
    private Principal.Menu.Elements.TabBar tabBar1;
    private Principal.Menu.Elements.ToolBar toolBar1;
    // End of variables declaration//GEN-END:variables

    Dimension dimension;
}
