package QuickSort;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QSTest {

    @Test
    void quickSort() {
        int[] arr = { 10, 7, 8, 9, 1, 5 };
        int n = arr.length;
        QS quickSort=new QS();
        assertEquals("[1, 5, 7, 8, 9, 10]",quickSort.quickSort(arr,0,n-1));
    }

}