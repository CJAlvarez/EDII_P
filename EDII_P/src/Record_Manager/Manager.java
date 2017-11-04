package Record_Manager;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Dennis
 */
public class Manager {

    char delimiter;
    String path;
    int size;

    public int Write(String[] thing) throws IOException {
        try (FileWriter write_to = new FileWriter(path)) {
            BufferedWriter br = null;
            br = new BufferedWriter(write_to, size);
            br.write(delimiter + "");
            for (int i = 0; i < thing.length; i++) {
                br.write(thing[i] + delimiter);
            }
            br.close();
            write_to.close();
        } catch (Exception e) {
            System.out.println(e.getMessage() + "something went wrong");
            return 1;
        }
        return 0;

    }

    public ArrayList<String> Read() {
        BufferedReader br = null;
        FileReader read_from;
        ArrayList<String> readed = new ArrayList();
        try {
            read_from = new FileReader(path);
            br = new BufferedReader(read_from, size);
            try {
                String temp;
                while ((temp = br.readLine()) != null) {
                    readed.add(temp);
                }
                br.close();
                read_from.close();
                return readed;
            } catch (IOException ex) {
                Logger.getLogger(Manager.class.getName()).log(Level.SEVERE, null, ex);
            }

        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage() + "file not found");
            return null;
        }

        return null;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Manager(char delimiter, String path, int size) {
        this.delimiter = delimiter;
        this.path = path;
        this.size = size;
    }

    public Manager() {
    }

}
