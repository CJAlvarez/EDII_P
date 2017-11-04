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

    public int Write(char[] thing) throws IOException {
        try (FileWriter write_to = new FileWriter(path)) {
            BufferedWriter br = null;
            br = new BufferedWriter(write_to, size);
            br.write(String.valueOf(delimiter) + Arrays.toString(thing));
            br.close();
        } catch (Exception e) {
            System.out.println(e.getMessage() + "something went wrong");
            return 1;
        }
        return 0;

    }

    public String Read() {
        BufferedReader br = null;
        String readed;
        FileReader read_from;
        try {
            read_from = new FileReader(path);
            br = new BufferedReader(read_from, size);
            try {
                readed = br.readLine();
                br.close();
                read_from.close();
                return readed;
            } catch (IOException ex) {
                System.out.println(ex.getMessage() + "no more records found");

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
