package tree;

import javax.swing.text.html.HTMLDocument;
import java.util.Iterator;

/**
 * Main
 */
public class Main {
    public static void main(String[] args) {
        BinaryTree binaryTree =  new BinaryTree();
        binaryTree.add("first");
        binaryTree.add("fourth");
        binaryTree.add("second");
        binaryTree.add("third");
        binaryTree.add("ali");
        binaryTree.add("abby");
        binaryTree.add("zaar");
        binaryTree.add("yahoo");
        binaryTree.add("heenry");

//        binaryTree.display(binaryTree.getRoot());

        Iterator iterator = binaryTree.iterator();
        System.out.println(iterator.next());
        System.out.println(iterator.next());
        System.out.println(iterator.next());
        System.out.println(iterator.next());
    }
}
