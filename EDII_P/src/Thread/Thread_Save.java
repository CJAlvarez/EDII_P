package Thread;

import Record_Manager.Manager;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author CJ
 */
public class Thread_Save implements Runnable {

    private boolean exist;
    private boolean desk;
    private JTable foreground;
    private JTable background;
    private Object[] fields;
    private JFileChooser JFC;

    public Thread_Save(boolean desk, JTable foreground, JTable background, Object[] fields, JFileChooser JFC) {
        this.desk = desk;
        this.foreground = foreground;
        this.background = background;
        this.fields = fields;
        this.JFC = JFC;
    }

    public Thread_Save(boolean desk, JTable foreground, JTable background, Object[] fields) {
        this.desk = desk;
        this.foreground = foreground;
        this.background = background;
        this.fields = fields;
        this.JFC = new JFileChooser();
        JFC.showSaveDialog(null);
    }

    public JFileChooser getJFC() {
        return JFC;
    }

    public void setExist(boolean exist) {
        this.exist = exist;
    }

    public void setDesk(boolean desk) {
        this.desk = desk;
    }

    public void setForeground(JTable foreground) {
        this.foreground = foreground;
    }

    public void setBackground(JTable background) {
        this.background = background;
    }

    public void setFields(Object[] fields) {
        this.fields = fields;
    }

    public void setJFC(JFileChooser JFC) {
        this.JFC = JFC;
    }

    @Override
    public void run() {
        int size = (fields.length * 4);
        if (desk) {
            size += (foreground.getRowCount() * foreground.getColumnCount());
        } else {
            size += (background.getRowCount() * background.getColumnCount());
        }
        String[] toSave = new String[size];
        int pos = 0;
        if (desk) {
            // METADATA
            for (int i = 0; i < background.getRowCount(); i++) {
                for (int k = 0; k < background.getColumnCount(); k++) {
                    try {
                        toSave[pos] = (String) background.getValueAt(i, k);
                        pos++;
                    } catch (Exception e) {
                        System.out.println("E1");
                    }
                }
            }
            // REGISTROS
            for (int j = 0; j < foreground.getRowCount(); j++) {
                for (int k = 0; k < foreground.getColumnCount(); k++) {
                    try {
                        String field = "";
                        if (foreground.getValueAt(j, k) == null) {
                            field = "\\";
                            for (int i = 0; i < Integer.parseInt(background.getValueAt(k, 3).toString()); i++) {
                                field += " ";
                            }
                        } else {
                            field = foreground.getValueAt(j, k).toString() + "\\";
                            for (int i = foreground.getValueAt(j, k).toString().length(); i < Integer.parseInt(background.getValueAt(k, 3).toString()); i++) {
                                field += " ";
                            }
                        }
                        toSave[pos] = field;
                        pos++;
                    } catch (Exception e) {
                        System.out.println("E2");
                    }
                }
            }
        } else {
            // METADATA
            for (int i = 0; i < foreground.getRowCount(); i++) {
                for (int k = 0; k < foreground.getColumnCount(); k++) {
                    try {
                        toSave[pos] = (String) foreground.getValueAt(i, k);
                        pos++;
                    } catch (Exception e) {
                        System.out.println("E3");
                    }
                }
            }
            // REGISTROS
            for (int j = 0; j < background.getRowCount(); j++) {
                for (int k = 0; k < background.getColumnCount(); k++) {
                    try {
                        String field;
                        if (background.getValueAt(j, k) == null) {
                            field = "\\";
                            for (int i = 0; i < Integer.parseInt(foreground.getValueAt(k, 3).toString()); i++) {
                                field += " ";
                            }
                        } else {
                            field = background.getValueAt(j, k).toString() + "\\";
                            for (int i = background.getValueAt(j, k).toString().length(); i < Integer.parseInt(foreground.getValueAt(k, 3).toString()); i++) {
                                field += " ";
                            }
                        }
                        toSave[pos] = field;
                        pos++;
                    } catch (Exception e) {
                        System.out.println("E4");
                    }
                }
            }
        }
        try {
            FileWriter write;
            BufferedWriter bufferW;
            if (JFC.getSelectedFile().getPath().contains(".dbp")) {
                write = new FileWriter(JFC.getSelectedFile());
            } else {
                write = new FileWriter(JFC.getSelectedFile() + ".dbp");
            }
            bufferW = new BufferedWriter(write);
            bufferW.write(fields.length + "");
            bufferW.write("<");
            for (int i = 0; i < toSave.length; i++) {
                bufferW.write(toSave[i] + "<");
            }
            bufferW.close();
            write.close();
        } catch (Exception ex) {
            System.out.println("ERROR_THREAD_SAVE");
        }
        //System.out.println(Arrays.toString(toSave));
        //System.out.println("SAVE");
    }

}
