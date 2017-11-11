package Struct;

import java.io.Serializable;
import java.math.*;

/**
 *
 * @author CJ
 */
public class ListaD<T extends Object> implements Cloneable, Serializable {

    private Nodo<T> first;
    private Nodo<T> last;
    private Nodo<T> actual;
    private int size;
    // Posición relativa del nodo.
    private int cursor;

    public ListaD() {
        this.first = null;
        this.last = null;
        this.actual = null;
        this.size = 0;
        this.cursor = 0;
    }

    public void add(Nodo<T> node, int n) {
        size++;
    }

    public void putBeginning(Nodo<T> node) {
        node.setPrevious(null);
        node.setNext(first);
        first.setPrevious(node);
        first = node;
        size++;
        if (actual != null) {
            cursor++;
        }
    }

    public void putEnd(Nodo<T> node) {
        node.setNext(null);
        node.setPrevious(last);
        last.setNext(node);
        last = node;
        size++;
    }

    public boolean put(Nodo<T> node, int n) {
        if (n < 1 || n > size - 1) {
            return false;
        }
        // Desde el actual.
        int track = n - cursor;
        Nodo<T> current;
        if (Math.abs(track) <= (size / 2)) {
            current = actual;
            if (track < 0) {
                for (int i = Math.abs(track) - 1; i >= 0; i--) {
                    current = current.getPrevious();
                }
            } else {
                for (int i = 0; i < track; i++) {
                    current = current.getNext();
                }
            }
            node.setPrevious(current.getPrevious());
            current.getPrevious().setNext(node);
            node.setNext(current);
            current.setPrevious(node);
        } // Desde el inicio.
        else if ((size / 2) >= n) {
            current = first;
            for (int i = 0; i < (size / 2); i++) {
                current = current.getNext();
            }
            cursor++;
        } // Desde el final.
        else {

        }

        if (n >= cursor) {
            cursor++;
        }
        size++;
        return true;
    }

}
// TensorFLow
// Python
// Encok