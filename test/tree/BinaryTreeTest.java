package tree;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Test
 */
public class BinaryTreeTest {
    private BinaryTree binaryTreeAdd;
    private BinaryTree binaryTreeIterate;
    @Before
    public void initialize() {
        binaryTreeAdd = new BinaryTree();

        binaryTreeIterate = new BinaryTree();
        binaryTreeIterate.add("first");
        binaryTreeIterate.add("second");
        binaryTreeIterate.add("third");
        binaryTreeIterate.add("fourth");
    }
    @Test
    public void testAdd() throws Exception {
       assertTrue(binaryTreeAdd.add("first"));
       assertNotNull(binaryTreeAdd);
       assertTrue(binaryTreeAdd.add("second"));
       assertFalse(binaryTreeAdd.add(null));
       assertFalse(binaryTreeAdd.add(""));
       assertTrue(binaryTreeAdd.add("third"));
       assertTrue(binaryTreeAdd.add("fourth"));
    }

}