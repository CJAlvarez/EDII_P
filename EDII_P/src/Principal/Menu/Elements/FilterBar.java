/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal.Menu.Elements;

import Thread.Thread_Find;
import javax.swing.JTextField;

/**
 *
 * @author CJ
 */
public class FilterBar extends javax.swing.JPanel {

    /**
     * Creates new form SearchBar
     */
    public FilterBar() {
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

        textField_Find = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 176, 176));
        setAutoscrolls(true);
        setFocusCycleRoot(true);
        setFocusTraversalPolicyProvider(true);
        setInheritsPopupMenu(true);

        textField_Find.setBackground(new java.awt.Color(255, 176, 176));
        textField_Find.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        textField_Find.setForeground(new java.awt.Color(55, 41, 40));
        textField_Find.setText("Buscar...");
        textField_Find.setBorder(null);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(textField_Find, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(textField_Find, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    public JTextField getTextField_Find() {
        return textField_Find;
    }

    public void setTextField_Find(JTextField textField_Find) {
        this.textField_Find = textField_Find;
    }

    public Thread_Find thread_Tree;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField textField_Find;
    // End of variables declaration//GEN-END:variables
}
