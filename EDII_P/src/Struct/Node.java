package Struct;

import java.io.Serializable;

/**
 *
 * @author CJ
 */
public class Node implements Serializable {

    public Page container;
    public int value;
    public int reference;
    public Page left;
    public Page right;


    public Node(Page container, int value) {
        this.container = container;
        this.value = value;
    }

    @Override
    public String toString() {
        return value + "<" + reference + "> L: " + left + " - R: " + right;
    }

}
