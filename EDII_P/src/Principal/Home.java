package Principal;

/**
 *
 * @author CJ
 */
public class Home extends javax.swing.JPanel {

    /**
     * Creates new form Simple
     */
    public Home() {
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

        browsePanel1 = new Principal.Menu.Elements.BrowsePanel();
        searchBar1 = new Principal.Menu.Elements.SearchBar();
        optionPanel1 = new Principal.Menu.Elements.OptionPanel();

        browsePanel1.setBackground(new java.awt.Color(51, 255, 51));

        javax.swing.GroupLayout browsePanel1Layout = new javax.swing.GroupLayout(browsePanel1);
        browsePanel1.setLayout(browsePanel1Layout);
        browsePanel1Layout.setHorizontalGroup(
            browsePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 180, Short.MAX_VALUE)
        );
        browsePanel1Layout.setVerticalGroup(
            browsePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 440, Short.MAX_VALUE)
        );

        searchBar1.setBackground(new java.awt.Color(204, 0, 51));

        javax.swing.GroupLayout searchBar1Layout = new javax.swing.GroupLayout(searchBar1);
        searchBar1.setLayout(searchBar1Layout);
        searchBar1Layout.setHorizontalGroup(
            searchBar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );
        searchBar1Layout.setVerticalGroup(
            searchBar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 190, Short.MAX_VALUE)
        );

        optionPanel1.setBackground(new java.awt.Color(51, 51, 255));

        javax.swing.GroupLayout optionPanel1Layout = new javax.swing.GroupLayout(optionPanel1);
        optionPanel1.setLayout(optionPanel1Layout);
        optionPanel1Layout.setHorizontalGroup(
            optionPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );
        optionPanel1Layout.setVerticalGroup(
            optionPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 220, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(browsePanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(optionPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(browsePanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(optionPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(searchBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Principal.Menu.Elements.BrowsePanel browsePanel1;
    private Principal.Menu.Elements.OptionPanel optionPanel1;
    private Principal.Menu.Elements.SearchBar searchBar1;
    // End of variables declaration//GEN-END:variables
}
