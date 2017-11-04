package Struct;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author CJ
 */
public class Stack <T extends Object>  implements  Cloneable, Serializable {
    private ArrayList<T> list;

    public Stack() {
        this.list = new ArrayList();
    }

    public ArrayList<T> getStack() {
        return list;
    }

    public void setStack(ArrayList<T> list) {
        this.list = list;
    }
    
    public void push(T object) {
        list.add(object);
    }
    
    public T pull() {
        if(list.size() > 0) {
            T temp = list.get(list.size() - 1);
            list.remove(list.size() - 1);
            return temp;
        }
        return null;
    }
    
    public T pop() {
        if(list.size() > 0)
            return list.get(list.size() - 1);
        return null;
    }
    
    public void clear() {
        this.list = new ArrayList();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }
    
    public int size() {
        return list.size();
    }
    @Override
    public String toString() {
        String s = "";
        for (int i = list.size() - 1; i >= 0; i--)
            s += list.get(i);
        clear();
        return s;
    }
    
    public String popString() {
        String s = "";
        for (int i = list.size() - 1; i >= 0; i--)
            s += list.get(i);
        return s;
    }
    
}
