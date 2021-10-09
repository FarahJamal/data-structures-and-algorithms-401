package linked.list;
import java.util.Objects;

public class LinkedList {

     Node head;
    private int size = 0;




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
    public String kthFromEnd(int k){
        if(size == 0)
            return "The list is empty";
        if(k > size - 1 || k < 0)
            return ("error in list");
        else{
            int numOfSteps = size - 1 - k;
            int counter = 0;
            Node current = head;

            while(counter < numOfSteps) {
                current = current.getNext();
                counter++;
            }

            return current.getData();
        }
    }
    public String zip(LinkedList list1, LinkedList list2) {
        LinkedList newList = new LinkedList();
        Node first = list1.head;
        Node second = list2.head;
        while (first != null || second != null) {
            if(second==null){
                newList.insert(first.data);
                first=first.next;
            }
            else if(first == null){
                newList.insert(second.data);
                second=second.next;
            }
            else{
                newList.insert(second.data);
                newList.insert(first.data);
                first=first.next;
                second=second.next;
            }

        }
        return newList.toString();
    }
    public void palindrome() {
        Node current = head;
        boolean flag = true;
        int mid = (size % 2 == 0) ? (size / 2) : ((size + 1) / 2);
        for (int i = 1; i < mid; i++) {
            current = current.next;
        }
        Node current2 = current.next;
        Node prev = null, next = null;
        while (current2 != null) {
            next = current2.next;
            current2.next = prev;
            prev = current2;
            current2 = next;
        }
        while (head != null && prev != null) {
            if (head.data != prev.data) {
                flag = false;
                break;
            }

            head = head.next;
            prev = prev.next;
        }
        if (flag) {
            System.out.println("TRUE");
        } else {
            System.out.println("FALSE");
        }
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