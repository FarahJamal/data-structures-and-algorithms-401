package Insertion.Sort;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InsertionSortArrayTest {
    @Test
    void insertion(){
        InsertionSortArray insertionSortArray=new InsertionSortArray();
        assertEquals("[4, 8, 15, 16, 23, 42]",insertionSortArray.sort(new int[]{8,4,23,42,16,15}));
    }
}