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
import java.util.Scanner;
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
    String path;
    int size;

    public Manager() {
    }

    public Manager(char delimiter, String path, int size) throws IOException {
        this.delimiter = delimiter;
        this.path = path;
        this.size = size;
        write = new FileWriter(this.path);
        bufferW = new BufferedWriter(write, size);
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
        // DEFINICIÓN
        ArrayList<String> facts = new ArrayList();
        String current = "";
        Scanner scan = null;
        try {
            read = new FileReader(path);
            scan = new Scanner(read);
        } catch (Exception e) {
            System.out.println("ERROR_MANAGER_READ_DEFINICIÓN");
        }
        // LECTURA
        try {
            // Leer cantidad de campos
            int fieldAmount = scan.nextInt();
            scan.useDelimiter(scan.next().charAt(0) + "");
            for (int i = 0; i < fieldAmount; i++) {
                
            }
            /*
            while ((current = bufferR.readLine()) != null) {
                facts.add(current);
            }*/
            bufferR.close();
            read.close();
            scan.close();
            return facts;

        } catch (Exception ex) {
            System.out.println("ERROR_MANAGER_READ_LECTURA");
            return null;
        }
    }

    public boolean close() throws IOException {
        bufferW.close();
        write.close();
        read.close();
        bufferR.close();
        return true;
    }

    public char getDelimiter() {
        return delimiter;
    }

    public void setDelimiter(char delimiter) {
        this.delimiter = delimiter;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void reset() throws IOException {
        write = new FileWriter(path);
        bufferW = new BufferedWriter(write, size);
        //read = new FileReader(path);
        //bufferR = new BufferedReader(read, size);   
    }
}
