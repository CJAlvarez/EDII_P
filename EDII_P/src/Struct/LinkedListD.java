package Struct;

/**
 *
 * @author CJ
 */
public class LinkedListD {

    Node primero;
    Node ultimo;

    LinkedListD() {
        primero = null;
        ultimo = null;
    }

    public boolean estavacio() {
        if (primero == null) {
            return true;
        } else {
            return false;
        }
    }

    public LinkedListD alta(int dat) {
        if (estavacio()) {
            Node nuevo = new Node(dat);
            primero = nuevo;
            ultimo = nuevo;
        } else {
            Node nuevo = new Node(dat);
            ultimo.next = nuevo;
            nuevo.ant = ultimo;
            ultimo = nuevo;
        }
        return this;

    }

    public boolean delete(int num) {
        Node anterior = null;
        Node actual = primero;
        while (actual != ultimo) {
            if (actual.dato == num) {
                if (anterior == null) {
                    primero = actual.next;
                    primero.ant = null;
                } else {
                    anterior.next = actual.next;
                    Node temporal;
                    temporal = actual.next;
                    temporal.ant = anterior;
                }
                return true;
            }
            anterior = actual;
            actual = actual.next;
        }
        if (num == ultimo.dato) {
            ultimo = actual.ant;
            return true;
        }
        return false;
    }

    public void imprimir2() {
        Node actual;
        actual = ultimo;
        while (actual != primero) {
            System.out.println(actual.dato);
            actual = actual.ant;
        }
        System.out.println(actual.dato);

    }

    public void imprimir() {
        Node actual;
        actual = primero;
        while (actual != ultimo) {
            System.out.println(actual.dato);
            actual = actual.next;
        }
        System.out.println(actual.dato);

    }
}
