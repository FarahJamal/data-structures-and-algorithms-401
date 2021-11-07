package structure;

import data.HashNode;

import java.util.*;

public class HashTable <F,J>{

    // bucket of hashnodes used to store linked list of
    // hashnodes in each bucket when collisions occur
    private ArrayList<HashNode<F, J>> bucketArray;

    // will hold the current size of our bucketArray
    private int numBuckets;

    // will hold the total number of hashnodes in the bucket array
    private int size;

    public HashTable() {
        bucketArray = new ArrayList<>();
        numBuckets = 10;
        size = 0;

        // create bucket array AKA simulate an actual array
        for (int index = 0; index < numBuckets; index++) {
            bucketArray.add(null);
        }
    }

    /**
     * hashes the key using the built in java hash function,
     * however you can build your own
     *
     * @param key any object
     * @return hashcode of the key
     */
    private int hashCode(F key) {
        return Objects.hashCode(key);
    }

    /**
     * Gets the index of where the value is located in the bucket array
     *
     * @param key any object
     * @return bucket index
     */
    private int getBucketIndex(F key) {
        int hashCode = hashCode(key);

        // this is to ensure the index is with in the bounds of the bucket array
        int index = hashCode % numBuckets;

        // hashCode can be negative (key.hashCode() can be -ve (negative))
        // so we need to make it positive
        index = index < 0 ? index * -1 : index;

        return index;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return getSize() == 0;
    }

    /**
     *
     * @param key
     * @param value
     */
    public void add(F key, J value) {

        // gets the head of a linked list for a given key
        int bucketIndex = getBucketIndex(key);
        int hashCode = hashCode(key);

        HashNode<F, J> head = bucketArray.get(bucketIndex);

        // check if key present
        while (head != null) {
            if (head.getKey().equals(key) && head.getHashCode() == hashCode) { // checks for duplicates
                // if there is a duplicate just overwrite
                head.value = value;
                return;
            }

            // adds to the chain of the linkedlist, by adding to the front
            head = head.getNext();
        }

        // insert the value in to the position
        size++;
        head = bucketArray.get(bucketIndex);
        HashNode<F, J> newNode = new HashNode<>(key, value, hashCode);
        newNode.next = head;
        bucketArray.set(bucketIndex, newNode);

        // if the load factor (number of hasnnodes) goes beyond the threshold
        // double the hashtble aka the bucket array
        if ((1.0 * size) / numBuckets >= 0.7) {
            ArrayList<HashNode<F, J>> temp = bucketArray;
            bucketArray = new ArrayList<>();
            numBuckets = 2 * numBuckets;
            size = 0;

            // increase bucket array size
            for (int index = 0; index < numBuckets; index++) {
                bucketArray.add(null);
            }

            // copy back in the original data to the increased bucket array
            for (HashNode<F, J> headNode : temp) {
                while (headNode != null) {
                    add(headNode.getKey(), headNode.value);
                    headNode = headNode.next;
                }
            }
        }
    }

    /**
     *
     * @param key
     * @return
     */
    public J remove(F key) {
        // Apply hash function to find index for given key
        int bucketIndex = getBucketIndex(key);
        int hashCode = hashCode(key);
        // Get head of chain
        HashNode<F, J> head = bucketArray.get(bucketIndex);

        // Search for key in its linked list
        HashNode<F, J> prev = null;
        while (head != null) {
            // If Key found
            if (head.getKey().equals(key) && hashCode == head.getHashCode())
                break;

            // Else keep moving in chain
            prev = head;
            head = head.next;
        }

        // If key was not there
        if (head == null)
            return null;

        // Reduce size
        size--;

        // Remove key
        if (prev != null)
            prev.next = head.next;
        else
            bucketArray.set(bucketIndex, head.next);

        return head.value;
    }

    /**
     *
     * @param key
     * @return
     */
    public J get(F key) {
        int bucketIndex = getBucketIndex(key);
        int hashCode = hashCode(key);

        HashNode<F, J> head = bucketArray.get(bucketIndex);

        // search the linnked list
        while (head != null) {
            if (head.getKey().equals(key) && head.getHashCode() == hashCode) {
                return head.value;
            }

            head = head.next;
        }

        // key not found
        return null;
    }

    /*********************************************************/

    public boolean contains(F key){
        F thingsInThere = (F) this.get(key);
        if(thingsInThere != null) return true;
        return false;
    }

    public int hash(String anything){
        String stringAnything = "" + anything;
        int hash = 0;
        for (int i = 0; i < stringAnything.length(); i++) {
            int number = stringAnything.charAt(i);
            hash += number;
            hash = hash * 10;
            hash = hash % 25;
        }
        hash = hash % this.bucketArray.size();
        return hash;
    }
/*********************************************************************************************************/
public String  repeatedWord(String text){
    String []allWords=text.split(" ");
    int counter =0;
    List<String>repeatedWords=new ArrayList<>();
    Map<String,Integer>repeatedzwordsWithCounter=new HashMap<>();
    for(int i=0;i<allWords.length;i++){
        for (int j=0;j<i;j++){
            if(allWords[i].equals(allWords[j].toLowerCase())){


if(!repeatedWords.contains(allWords[i].toLowerCase())){
    repeatedWords.add(allWords[i].toLowerCase());
    }

            }

        }
    }
    for(int x=0;x<repeatedWords.size();x++){
        counter=countOccurrences(text,repeatedWords.get(x));
        repeatedzwordsWithCounter.put(repeatedWords.get(x),counter);

    }
//    System.out.println(repeatedzwordsWithCounter);
    return repeatedzwordsWithCounter.toString();
}
    static int countOccurrences(String str, String word)
    {
        // split the string by spaces in a
        String a[] = str.split(" ");

        // search for pattern in a
        int count = 0;
        for (int i = 0; i < a.length; i++)
        {
            // if match found increase count
            if (word.equals(a[i]))
                count++;
        }

        return count;
    }

    @Override
    public String toString() {
        return "HashTable{" +
                "bucketArray=" + bucketArray +
                '}';
    }
}
