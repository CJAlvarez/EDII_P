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

    FileWriter write;
    BufferedWriter bufferW;
    FileReader read;
    BufferedReader bufferR;

    char delimiter;
    String pathW;
    String pathR;
    int size;

    public Manager() {
    }

    public Manager(char delimiter, String path, int size) throws IOException {
        this.delimiter = delimiter;
        this.pathW = path;
        this.pathR = path;
        this.size = size;
        write = new FileWriter(pathW);
        bufferW = new BufferedWriter(write, size);
        //read = new FileReader(pathR);
        //bufferR = new BufferedReader(read, size);

    }

    public int Write(String[] thing, int amount) throws IOException {
        try {
            bufferW.write(amount + "");
            bufferW.write(delimiter + "");
            for (int i = 0; i < thing.length; i++) {
                bufferW.write(thing[i] + delimiter);
            }
        } catch (Exception e) {
            System.out.println("ERROR_MANAGER_WRITE");
            return 1;
        }
        return 0;

    }

    public ArrayList<String> Read() {
        BufferedReader br = null;
        FileReader read_from;
        ArrayList<String> readed = new ArrayList();
        try {
            read_from = new FileReader(pathW);
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

    public boolean close() throws IOException {
        write.close();
        bufferW.close();
        //read.close();
        //bufferR.close();
        return true;
    }

    public char getDelimiter() {
        return delimiter;
    }

    public void setDelimiter(char delimiter) {
        this.delimiter = delimiter;
    }

    public String getPath() {
        return pathW;
    }

    public void setPath(String path) {
        this.pathW = path;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void reset() throws IOException {
        write = new FileWriter(pathW);
        bufferW = new BufferedWriter(write, size);
        //read = new FileReader(pathR);
        //bufferR = new BufferedReader(read, size);   
    }
}
