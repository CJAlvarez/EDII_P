package Struct;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author CJ
 */
public class Test {

    public static void main(String[] args) {
        try {
            BTree test = new BTree(4);
            //System.out.println("___________");
            for (int i = 0; i < 10; i++) {
                test.insert(new Node(null, i));
                //System.out.println(i);
            }
            //test.insert(new Node(null, 0));
            System.out.println(test.toString());
            System.out.println("___________");
            do {
                System.out.println("Ingrese Nodo: ");
                System.out.println(test.find(new java.util.Scanner(System.in).nextInt()).left.getAncestor());
            } while (new java.util.Scanner(System.in).nextInt() != 0);
        } catch (Exception ex) {
            Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
