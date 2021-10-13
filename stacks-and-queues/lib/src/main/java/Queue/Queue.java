package Queue;

import Node.Node;

public class Queue<T> {

    private Node<T> front;
    private Node<T> back;
    private int count;
    public Queue() {
        front = back = null;
        count = 0;
    }

    public void enqueue(T data) {
        Node<T> node = new Node<>(data);
        if (isEmpty())
            front = node;
        else {
            back.setNext(node);
        }

        back = node;
        count++;
    }

    public T dequeue() throws Exception {
        T data;
        if(isEmpty())
            throw new Exception("Can't remove from empty Queue!");
        else{
            data = front.getData();
            front = front.getNext();
        }
        count--;
        return data;
    }

    public T peek() throws Exception {
        if(isEmpty())
            throw new Exception("Can't peek empty Queue!");
        else
            return front.getData();
    }

    public boolean isEmpty() {
        return front == null;
    }
    public int size(){
        return count;
    }


}