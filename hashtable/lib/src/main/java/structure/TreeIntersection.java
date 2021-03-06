package structure;
import data.Node;

import java.util.ArrayList;
import java.util.Hashtable;

public class TreeIntersection {
    //Solution With Hashtable
    static Hashtable output;

    public static String tree_intersection(BinaryTree tree1, BinaryTree tree2){
        output = new Hashtable();
        inOrder(tree1.root);
        return checkTheCommonItems(tree2.root).toString();
    }

    public static void inOrder(Node root){
        try {
            if (root.left != null)
                inOrder(root.left);
            output.put(root.getData().toString(),1);
            if (root.right != null)
                inOrder(root.right);
        }catch (Exception ex){
            System.out.println(ex);
        }
    }

    public static ArrayList checkTheCommonItems(Node root){
        ArrayList arrayList = new ArrayList();
        try {
            if (root.left != null)
                arrayList.addAll(checkTheCommonItems(root.left));
            Object value =  output.get(root.getData().toString());
            if(value != null && (int) value != -1){
                arrayList.add(root.getData());
                output.put(root.getData(),-1);
            }
            if (root.right != null)
                arrayList.addAll(checkTheCommonItems(root.right));
        }catch (Exception ex){
            System.out.println(ex);
        }
        return arrayList;
    }
}