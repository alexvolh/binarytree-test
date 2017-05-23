package tree;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 *
 */
public class IteratorBinaryTree implements Iterator {
    private Node root;
    private Node next;
    private boolean finishLeft;
    private String rootData;

    public IteratorBinaryTree(Node root) {
        this.root = root;
        next = root;
        rootData = root.getData();
        finishLeft = false;
    }

    @Override
    public boolean hasNext() {
        return (next != null);
    }

    @Override
    public String next() {
        String data = "null";
        if (next.left != null) {
            data = next.left.getData();
            next = next.left;
        } else if (next.right != null) { //вернуться в root
            next = next.right;
            if (next.left != null) {
                data = next.left.getData();
                next = next.right;
            }
        }
/*

*/
        return data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
