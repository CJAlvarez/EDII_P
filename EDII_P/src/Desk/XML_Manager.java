/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Desk;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.util.ArrayList;
import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamWriter;

/**
 *
 * @author danie
 */
public class XML_Manager {
    private ArrayList listFields = new ArrayList();
    private File archivoXML = new File("Test.xml");
    XMLOutputFactory xMLOutputFactory;
    XMLStreamWriter xMLStreamWriter;

    public XML_Manager() {
        xMLOutputFactory = XMLOutputFactory.newInstance();
    }
    public void exportarCampo(String key, String nombre, String tipo, String longitud){
        try {
            xMLStreamWriter = xMLOutputFactory.createXMLStreamWriter(new FileOutputStream("XMLCampos.xml"));
            
            xMLStreamWriter.writeStartDocument("utf-8", "1.0");
            xMLStreamWriter.writeComment("Describe los Campos");
            xMLStreamWriter.writeStartElement("Campos");
            
            xMLStreamWriter.writeStartElement("Campo");
            xMLStreamWriter.writeAttribute("tipo", tipo);
            xMLStreamWriter.writeCharacters(nombre);
            xMLStreamWriter.writeEndElement();
            
            xMLStreamWriter.writeEndElement();
            xMLStreamWriter.writeEndDocument();
            
            xMLStreamWriter.flush();
            xMLStreamWriter.close();
            
        } catch (Exception e) {
        }
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
