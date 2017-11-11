package Struct;

import java.io.Serializable;

/**
 *
 * @author CJ
 */
public class Nodo<T extends Object> implements Cloneable, Serializable {

    private String tag;
    private T content;
    private Nodo<T> next;
    private Nodo<T> previous;

    public Nodo(String tag, T content, Nodo<T> next, Nodo<T> previous) {
        this.tag = tag;
        this.content = content;
        this.next = next;
        this.previous = previous;
    }

    public Nodo(String tag, T content) {
        this.tag = tag;
        this.content = content;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public T getContent() {
        return content;
    }

    public void setContent(T content) {
        this.content = content;
    }

    public Nodo<T> getNext() {
        return next;
    }

    public void setNext(Nodo<T> next) {
        this.next = next;
    }

    public Nodo<T> getPrevious() {
        return previous;
    }

    public void setPrevious(Nodo<T> previous) {
        this.previous = previous;
    }

}
