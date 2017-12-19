package Thread;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author CJ
 */
public class Thread_Open implements Runnable {

    private int key;
    private JTable foreground;
    private JTable background;
    private JFileChooser JFC;

    public Thread_Open(int key, JTable foreground, JTable background) {
        this.key = key;
        this.foreground = foreground;
        this.background = background;
        this.JFC = new JFileChooser();
        JFC.showOpenDialog(null);
    }

    public JFileChooser getJFC() {
        return JFC;
    }

    public int getKey() {
        return key;
    }

    @Override
    public void run() {
        // DEFINICIÓN
        int fAmount;
        FileReader read;
        Scanner scan;
        try {
            read = new FileReader(JFC.getSelectedFile());
            scan = new Scanner(read);

            // Lectura total
            String[] data = scan.nextLine().split("<");
            read.close();
            scan.close();

            // Cantidad de Campos
            fAmount = Integer.parseInt(data[0]);
            Object[] names = new Object[fAmount];

            // Diseño
            background.setModel(new DefaultTableModel(0, 3));
            DefaultTableModel backModel = (DefaultTableModel) background.getModel();
            backModel.setColumnIdentifiers(new Object[]{"Llave", "Campo", "Tipo", "Longitud"});
            int iNames = 0;
            for (int i = 1; i < (fAmount * 4) + 1; i += 4) {
                if ("si".equals(data[i].toLowerCase())) {
                    this.key = backModel.getRowCount();
                }
                backModel.addRow(new Object[]{data[i], data[i + 1], data[i + 2], data[i + 3]});
                names[iNames] = data[i + 1];
                iNames++;
            }
            background.setModel(backModel);

            // Datos
            foreground.setModel(new DefaultTableModel(0, 1));
            DefaultTableModel foreModel = (DefaultTableModel) foreground.getModel();
            foreModel.setColumnIdentifiers(names);
            for (int i = (fAmount * 4) + 1; i < data.length; i += fAmount) {
                Object[] line = new Object[fAmount];
                for (int j = 0; j < fAmount; j++) {
                    line[j] = data[i + j].substring(0, data[i + j].lastIndexOf("\\"));
                }
                foreModel.addRow(line);
            }
            foreground.setModel(foreModel);

        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Archivo inválido", "ERROR", 1);
        } catch (NumberFormatException e) {
            System.out.println("ERROR_OPEN");
        }
        //System.out.println("OPEN");
    }

}
