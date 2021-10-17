package Node;

public class Node <F>{
    F data;
    Node<F> left;
    Node<F> right;

    public Node(F data) {
        this.data = data;
    }

    public F getData() {
        return data;
    }

    public void setData(F data) {
        this.data = data;
    }

    public Node<F> getLeft() {
        return left;
    }

    public void setLeft(Node<F> left) {
        this.left = left;
    }

    public Node<F> getRight() {
        return right;
    }

    public void setRight(Node<F> right) {
        this.right = right;
    }
}
