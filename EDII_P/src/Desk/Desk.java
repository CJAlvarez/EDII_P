package Desk;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;


/**
 *
 * @author Salgado
 */
public class Desk {
    private ArrayList<Object> listaObjetos = new ArrayList();
    private File archivo = null;

    public Desk(String path) {
        archivo = new File(path);
    }
    public void setObject(Object p){
        this.listaObjetos.add(p);
    }

    public ArrayList<Object> getListaObjetos() {
        return listaObjetos;
    }

    public void setListaObjetos(ArrayList<Object> listaObjetos) {
        this.listaObjetos = listaObjetos;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
    
    public void guardarArchivo(){
        try {
            archivo = new File("Objetos.binary");
            if (!archivo.exists()) {
                FileOutputStream output = new FileOutputStream(archivo);
                ObjectOutputStream object = new ObjectOutputStream(output);
                for (Object o : listaObjetos) {
                    object.writeObject(o);
                }
                object.flush();
                object.close();
                output.close();
            }else{
                FileInputStream entrada = new FileInputStream( archivo );
                ObjectInputStream objeto = new ObjectInputStream( entrada );
                Object temp;
                ArrayList< Object > objetos = new ArrayList();
                try {
                    while((temp = objeto.readObject()) != null){
                        listaObjetos.add(temp);
                    }
                } catch (Exception e) {
                }
                objeto.close();
                entrada.close();
                for (Object o : objetos) {
                    listaObjetos.add(o);
                }
                FileOutputStream output = new FileOutputStream( archivo );
                ObjectOutputStream objeto2 = new ObjectOutputStream( output );
                for (Object o : objetos) {
                    objeto2.writeObject(o);
                }
                objeto2.flush();
                objeto2.close();
            }
        } catch (Exception e) {
        }
    }
    public void abrirArchivo(){
        try {
            archivo = new File("Objetos.binary");
            FileInputStream input = new FileInputStream(archivo);
            ObjectInputStream objeto = new ObjectInputStream(input);
            Object temp;
            try {
                while((temp = objeto.readObject()) != null){
                    listaObjetos.add(temp);
                }
            } catch (Exception e) {
            }
            objeto.close();
            input.close();
        } catch (Exception e) {
        }
       
    }

    @Override
    public String toString() {
        return "Desk{" + "ListaObjetos: " + listaObjetos + '}';
    }
    
    
}
