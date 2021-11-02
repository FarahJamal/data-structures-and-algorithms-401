package QuickSort;

import java.util.Arrays;

public class QS {
    public static String quickSort(int[] arr, int left, int right)
    {
        if (left < right)
        {
            int pi = partition(arr, left, right);
            quickSort(arr, left, pi - 1);
            quickSort(arr, pi + 1, right);
            System.out.println("inside quick sort method: "+Arrays.toString(arr));
        }
        return Arrays.toString(arr);
    }


    public static int partition(int[] arr, int left, int right)
    {

        int pivot = arr[right];

        int low = (left - 1);

        for(int j = left; j <= right - 1; j++)
        {

            if (arr[j] <= pivot)
            {
                low++;
                swap(arr, low, j);
            }
        }
        swap(arr, low + 1, right);
        System.out.println("inside partition method: "+Arrays.toString(arr));

        return (low + 1);
    }



   public static void swap(int[] arr, int i, int low)
    {
        int temp = arr[i];
        arr[i] = arr[low];
        arr[low] = temp;
    }

}
