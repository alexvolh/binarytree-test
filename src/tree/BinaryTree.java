package tree;

import java.util.*;

/**
 * Binary tree
 */
public class BinaryTree implements Set {
    private Node root;

    public BinaryTree() {
        this.root = null;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator iterator() {
        return new IteratorBinaryTree(root);
    }

    public void inOrderRight(Node root) {
        if (root == null) {
            return;
        }
        System.out.println(root.getData());
        inOrderRight(root.getRight());
    }

    public void inOrderLeft(Node root) {
        if (root == null) {
            return;
        }
        System.out.println(root.getData());
        inOrderRight(root.getLeft());
    }
    public void display(Node root) {
        if (root != null) {
            display(root.left);
            System.out.print(" " + root.getData());
            display(root.right);
        }
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public boolean add(Object o) {
        String insertString = (String) o;
        if (insertString == null || insertString.isEmpty()) {
            return false;
        }

        Node newNode = new Node(insertString);

        if (root == null) {
            root = newNode;
            System.out.println(insertString + " inserted root!\n");
            return true;
        } else {
            Node current = root;
            Node parent;

            while (true) {
                parent = current;
                if (insertString.compareToIgnoreCase(current.getData()) < 0) {
                    current = current.getLeft();
                    if (current == null) {
                        parent.setLeft(newNode);
                        System.out.println(insertString + " left inserted!\n");
                        return true;
                    }
                } else {
                    current = current.getRight();
                    if (current == null) {
                        parent.setRight(newNode);
                        System.out.println(insertString + " right inserted!\n");
                        return true;
                    }
                }
            }
        }
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean addAll(Collection c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public boolean removeAll(Collection c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection c) {
        return false;
    }

    @Override
    public boolean containsAll(Collection c) {
        return false;
    }

    @Override
    public Object[] toArray(Object[] a) {
        return new Object[0];
    }

    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }
}
