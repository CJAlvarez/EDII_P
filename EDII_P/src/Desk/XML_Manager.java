/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Desk;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;

/**
 *
 * @author danie
 */
public class XML_Manager {
    private ArrayList listFields = new ArrayList();
    private File archivoXML = new File("Campos.xml");

    public XML_Manager() {
    }
    public void setField(Object field){
        this.listFields.add(field);
    }

    public ArrayList getListFields() {
        return listFields;
    }

    public void setListFields(ArrayList listFields) {
        this.listFields = listFields;
    }

    public File getArchivoXML() {
        return archivoXML;
    }

    public void setArchivoXML(File archivoXML) {
        this.archivoXML = archivoXML;
    }
    
    public void guardarArchivo(){
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivoXML,false);
            bw = new BufferedWriter(fw);
            bw.write("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
            bw.flush();
        } catch (Exception e) {
        }finally{
            try {
                bw.close();
                fw.close();
            } catch (Exception e) {
            }
        }
    }
    
    @Override
    public String toString() {
        return "XML_Manager{" + "listFields=" + listFields + ", archivoXML=" + archivoXML + '}';
    }
    
}