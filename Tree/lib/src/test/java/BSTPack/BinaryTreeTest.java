package BSTPack;

import Node.Node;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinaryTreeTest {

    @Test
    public void findMaxBT(){
        BinaryTree<Integer> tree = new BinaryTree<>();

        tree.root = new Node(2);
        tree.root.left = new Node(7);
        tree.root.right = new Node(5);
        tree.root.left.right = new Node(6);
        tree.root.left.right.left = new Node(1);
        tree.root.left.right.right = new Node(11);
        tree.root.right.right = new Node(9);
        tree.root.right.right.left = new Node(4);

        try {
            assertEquals(11, tree.findMax(), "The method will return the max value");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}