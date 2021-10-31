package BSTPack;


import Node.Node;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BinaryTree <T> {
    public Node root;
    int counter=0;
    // Root of the Binary Tree


    public BinaryTree() { root = null; }

    /* function to print level order traversal of tree*/
    public void printLevelOrder()
    {
        int h = height(root);
        int i;
        for (i = 1; i <= h; i++)
            printCurrentLevel(root, i);
    }

    /* Compute the "height" of a tree -- the number of
    nodes along the longest path from the root node
    down to the farthest leaf node.*/
    int height(Node root)
    {
        if (root == null)
            return 0;
        else {
            /* compute  height of each subtree */
            int lheight = height(root.getLeft());
            int rheight = height(root.getRight());

            /* use the larger one */
            if (lheight > rheight)
                return (lheight + 1);
            else
                return (rheight + 1);
        }
    }
    void printPostorder(Node node)
    {
        if (node == null)
            return;
        printPostorder(node.left);
        printPostorder(node.right);
        System.out.print(node.getData() + " ");
    }

    void printInorder(Node node)
    {
        if (node == null)
            return;

        printInorder(node.left);

        System.out.print(node.getData() + " ");

        printInorder(node.right);
    }
    String printPreorder(Node node)
    {
        if (node == null)
            return "";
        System.out.print(printPreorder(node.left));
        System.out.print(printPreorder(node.right));
        return (node.getData() + " ");

    }
//function for file/folder method
boolean fileFolder(BinaryTree<T>tree1, BinaryTree<T>tree2) {
    String arTree1 = tree1.printPreorder();
    String arTree2 = tree1.printPreorder();
 return true;
}

    // Wrappers over above recursive functions
    public void printPostorder() { printPostorder(root); }
    public void printInorder() { printInorder(root); }
    public String printPreorder() { return printPreorder(root); }
    public static boolean checkFile(String str)
    {

        String regex = "([^\\s]+(\\.(?i)(jpe?g|png|gif|bmp))$)";
        Pattern p = Pattern.compile(regex);

        if (str == null) {
            return false;
        }
        Matcher m = p.matcher(str);
        return m.matches();
    }

    public int getLeafCount()
    {
        return getLeafCount(root);
    }

    public int getLeafCount(Node node)
    {
        if (node == null)
            return 0;
        if (node.left == null && node.right == null)
            return 1;
        else{
            return getLeafCount(node.left) + getLeafCount(node.right);
        }

    }
    public boolean checkLeaves(BinaryTree <T> bst, BinaryTree <T> bst2) {

        if (getLeafCount(bst.root) == getLeafCount(bst2.root)) {
            return true;
        } else {
            return false;
        }
    }

    /* Print nodes at the current level */
   public void printCurrentLevel(Node root, int level)
    {
        if (root == null)
            return;
        if (level == 1)
            System.out.print(root.getData() + " ");
        else if (level > 1) {
            printCurrentLevel(root.getLeft(), level - 1);
            printCurrentLevel(root.getRight(), level - 1);
        }
    }
}
