package Principal;

import Record_Manager.Manager;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author CJ
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String file_name="ArchivoPrueba.txt";
        int longitud_buffer=200;
        char delim='|';
        
        
        String profile = "Daniel Salgado 11441181";
        Manager prueba = new Manager(delim, file_name, longitud_buffer);
      
        
        for (int i = 0; i < prueba.Read().size(); i++) {
            System.out.println(prueba.Read().get(i));
        }
          try {
            prueba.Write(new String[] {profile, profile});
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
