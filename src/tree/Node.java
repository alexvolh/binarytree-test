package tree;

/**
 * Node of binary tree
 */
public class Node {
    Node right;
    Node left;

    private String data;

    public Node(String data) {
        this.data = data;
        right = null;
        left = null;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
