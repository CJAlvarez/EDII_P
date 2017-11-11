package Struct;

/**
 *
 * @author CJ
 */
public class Node {

    public int dato;
    public Node next;
    public Node ant;

    public Node(int a) {
        this.dato = a;
        this.next = null;
        this.ant = null;
    }
}
