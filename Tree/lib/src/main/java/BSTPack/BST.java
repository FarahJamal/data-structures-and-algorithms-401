package BSTPack;

import Node.Node;

public class BST <F extends Comparable<F>>{

    Node<F> top;

    public BST() {
        top = null;
    }
    public void Add(F data) {
        if (isEmpty())
            top = new Node<F>(data);
        else
            add(data, top);
    }

    public Node<F> getTop() {
        return top;
    }

    public void setTop(Node<F> top) {
        this.top = top;
    }

    private void add(F data, Node<F> root) {

        if (data.compareTo(root.getData()) > 0)
            if (root.getRight() != null)
                add(data, root.getRight());
            else
                root.setRight(new Node<F>(data));
        if (data.compareTo(root.getData()) < 0)
            if (root.getLeft() != null)
                add(data, root.getLeft());
            else
                root.setLeft(new Node<F>(data));
    }

    public boolean contains(F data){
        if(isEmpty())
            return false;
        return contains(data, top);
    }

    private boolean contains(F data, Node<F> root){

        if(root == null)
            return false;
        if(data.compareTo(root.getData()) == 0)
            return true;
        else if(data.compareTo(root.getData()) > 0)
            return contains(data, root.getRight());
        else
            return contains(data, root.getLeft());
    }

    public boolean isEmpty() {
        return top == null;
    }

    public F max() throws Exception{
        if(isEmpty()){
            System.out.println("empty tree");
            throw new Exception("empty tree!");
        }
        else{
            return findMaxHelper(top);

        }
    }
    public F findMaxHelper(Node<F>bstRoot){
        if(bstRoot.getRight() != null)
            return findMaxHelper(bstRoot.getRight());
        else
            return bstRoot.getData();
    }

}