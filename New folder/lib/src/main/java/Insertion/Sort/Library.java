/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package Insertion.Sort;

public class Library {
    public boolean someLibraryMethod() {
        return true;
    }

    public static void main(String[] args) {
        int arr[] = {12, 11, 13, 5, 6};
        InsertionSortArray ob = new InsertionSortArray();
        System.out.println(        ob.sort(arr));
        ob.printArray(arr);
    }
}
