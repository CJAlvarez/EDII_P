package Principal.Menu.Elements;

import Thread.Thread_Find;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JComboBox;

/**
 *
 * @author CJ
 */
public class NavigationPanel extends javax.swing.JPanel {

    public NavigationPanel() {
        initComponents();
        Button_Find.setEnabled(false);
        b = false;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        List_Find = new Principal.Menu.Elements.TabList();
        Bar_Find = new Principal.Menu.Elements.FilterBar();
        Box_Fields = new javax.swing.JComboBox<>();
        Button_Find = new javax.swing.JButton();

        setBackground(new java.awt.Color(120, 53, 71));
        setAutoscrolls(true);
        setFocusCycleRoot(true);
        setFocusTraversalPolicyProvider(true);
        setInheritsPopupMenu(true);

        Box_Fields.setBackground(new java.awt.Color(120, 53, 71));
        Box_Fields.setForeground(new java.awt.Color(255, 255, 255));
        Box_Fields.setBorder(null);
        Box_Fields.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        Button_Find.setBackground(new java.awt.Color(84, 49, 55));
        Button_Find.setForeground(new java.awt.Color(255, 255, 255));
        Button_Find.setText("Buscar");
        Button_Find.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Button_Find.setBorderPainted(false);
        Button_Find.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_FindActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Bar_Find, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Box_Fields, 0, 65, Short.MAX_VALUE))
                    .addComponent(List_Find, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(15, 15, 15))
            .addGroup(layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(Button_Find, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Bar_Find, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Box_Fields, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(List_Find, javax.swing.GroupLayout.DEFAULT_SIZE, 342, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Button_Find)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents
private boolean b;

    public void B_Acces() {
        Button_FindActionPerformed(null);
    }

    private void Button_FindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_FindActionPerformed
        try {
            List_Find.dP = dP;
        } catch (Exception e) {
        }
        if (!b) {
            try {
                List_Find.index.clear();
                thread_F = new Thread_Find(dP);
                t = new Thread(thread_F);
                t.start();
                b = true;
            } catch (Exception e) {
            }
        }
        if (dP != null) {
            List_Find.index.clear();
            thread_F.setGo(true);
        }
        flag = true;
    }//GEN-LAST:event_Button_FindActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Principal.Menu.Elements.FilterBar Bar_Find;
    private javax.swing.JComboBox<String> Box_Fields;
    private javax.swing.JButton Button_Find;
    private Principal.Menu.Elements.TabList List_Find;
    // End of variables declaration//GEN-END:variables

    public DeskPanel dP;
    private Thread_Find thread_F;
    private Thread t;
    public boolean flag;

    public FilterBar getBar_Find() {
        return Bar_Find;
    }

    public void setBar_Find(FilterBar Bar_Find) {
        this.Bar_Find = Bar_Find;
    }

    public JComboBox<String> getBox_Fields() {
        return Box_Fields;
    }

    public void setBox_Fields(JComboBox<String> Box_Fields) {
        this.Box_Fields = Box_Fields;
    }

    public TabList getList_Find() {
        return List_Find;
    }

    public void setList_Find(TabList List_Find) {
        this.List_Find = List_Find;
    }

    public JButton getButton_Find() {
        return Button_Find;
    }

    public void setButton_Find(JButton Button_Find) {
        this.Button_Find = Button_Find;
    }

    public boolean isB() {
        return b;
    }

    public void setB(boolean b) {
        this.b = b;
    }

    public DeskPanel getdP() {
        return dP;
    }

    public void setdP(DeskPanel dP) {
        this.dP = dP;
    }

    public Thread_Find getThread_F() {
        return thread_F;
    }

    public void setThread_F(Thread_Find thread_F) {
        this.thread_F = thread_F;
    }

    public Thread getT() {
        return t;
    }

    public void setT(Thread t) {
        this.t = t;
    }

}
