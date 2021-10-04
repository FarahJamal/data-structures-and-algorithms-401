package linked.list;
import java.util.Objects;

public class LinkedList {

     Node head;
     Node tail;
    private int size = 0;

    public int size() {
        return size;
    }



    public void insert(String value) {
        if (head == null) {
            head = new Node(value);
            size++;
        } else {
            Node newNode = new Node(value);
            newNode.setNext(head);
            head = newNode;
            size++;
        }
    }
    public boolean includes(String value) {

        if(size != 0){
            Node current = head;
            while(current != null){
                if(Objects.equals(current.getData(), value)){
                    return true;
                }
                current = current.getNext();
            }

        }

        return false;
    }
    // Appends a new node at the end. This method is defined inside LinkedList class
    // shown above
    public void append(String new_data) {
        Node new_node = new Node(new_data);
        if (head == null) {
            head = new Node(new_data);
            return;
        }
        new_node.next = null;
        Node last = head;
        while (last.next != null)
            last = last.next;
        last.next = new_node;
        return;
    }
//after
public void insertAfter(String ref,String data){


            Node current = head;
            while (current != null) {
                if (current.data==ref) {
                    Node newNode = new Node(data);
                    newNode.next = current.next;
                    current.next = newNode;
                    break;

                }
                current = current.next;
            }
            if(current==null){
                insert(data);
            }
        }








    public void insertBefore(String ref,String data){
        //Node current= insertBeforeNode.start;
        if(head !=null){
        if(ref== head.data){
            Node insertBeforeNode=new Node(data);
            insertBeforeNode.next = head;
            head = insertBeforeNode;

        }
        else {
            Node current = head;
            Node previousNode = current;
            while (current != null) {
                if (ref == current.data) {
                    Node newNode = new Node(data);
                    newNode.next = current;
                    previousNode.next = newNode;
                    break;
                    // 1-> 3 -> 4
                    // insertBefore(3,2);
                    // current -> 3 ,previousNode -> 1
                    // newNode = 2 -> null
                    // newNode.next = current 1 -> 3 2-> 3 - > 4
                    // previousNode.next = newNode 1 -> 2 -> 3 - > 4
                }
                previousNode = current;
                current = current.next;
            }
        }
        }
        else{
            System.out.println("the list is empty");
        }
    }

    // stretch goals solve
    public String remove(int index) throws IndexOutOfBoundsException {
        String deletedNode = "";
        if (head == null) {
            System.out.println("List is empty");
        } else {
            if (index > size || index < 0) {
                throw new IndexOutOfBoundsException("Index out of bounds");
            }

            // if deleting first node
            if (index == 0) {
                deletedNode = head.getData();
                head = head.getNext();
                size--;
                return deletedNode;
            }

            int counter = 0;

            Node previous = null;
            Node current = head;

            while (counter != index) {
                previous = current;
                current = current.getNext();
                counter++;
            }

            previous.setNext(current.getNext());
            current.setNext(null);
            deletedNode = current.getData();
            size--;
        }

        return deletedNode;
    }
    @Override
    public String toString() {
        StringBuilder stringPrint = new StringBuilder();
        if(size == 0){
            return "The list is empty";
        }else{

            Node current = head;
            while (current != null){
                stringPrint.append("{ ").append(current.getData()).append(" }").append(" --> ");
                current = current.getNext();
            }
            stringPrint.append("NULL");
        }
        return stringPrint.toString();
    }

}