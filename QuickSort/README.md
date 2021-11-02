# Quick Sort Algorithm

![](https://i.ibb.co/B60BYCw/Whiteboard-14.png)

## walk through
![](https://i.pinimg.com/564x/fe/f8/08/fef8085a6420538e38f6ccfaba04d12f.jpg)
#### Problem Statement
`Consider the following array: 50, 23, 9, 18, 61, 32. We need to sort this array in the most efficient manner without using extra place (inplace sorting).
Solution`

##### Step 1:
Make any element as pivot: Decide any value to be the pivot from the list. For convenience of code, we often select the rightmost index as pivot or select any at random and swap with rightmost. Suppose for two values “Low” and “High” corresponding to the first index and last index respectively.
        In our case low is 0 and high is 5.
        Values at low and high are 50 and 32 and value at pivot is 32.
    Partition the array on the basis of pivot: Call for partitioning which rearranges the array in such a way that pivot (32) comes to its actual position (of the sorted array). And to the left of the pivot, the array has all the elements less than it, and to the right greater than it.
        In the partition function, we start from the first element and compare it with the pivot. Since 50 is greater than 32, we don’t make any change and move on to the next element 23.
        Compare again with the pivot. Since 23 is less than 32, we swap 50 and 23. The array becomes 23, 50, 9, 18, 61, 32
        We move on to the next element 9 which is again less than pivot (32) thus swapping it with 50 makes our array as 23, 9, 50, 18, 61, 32.
        Similarly, for next element 18 which is less than 32, the array becomes 23, 9, 18, 50, 61, 32. Now 61 is greater than pivot (32), hence no changes.
        Lastly, we swap our pivot with 50 so that it comes to the correct position.

Thus the pivot (32) comes at its actual position and all elements to its left are lesser, and all elements to the right are greater than itself.

#### Step 2: The main array after the first step becomes

23, 9, 18, 32, 61, 50

#### Step 3: Now the list is divided into two parts:

Sublist before pivot element
Sublist after pivot element

#### Step 4: Repeat the steps for the left and right sublists recursively. The final array thus becomes
9, 18, 23, 32, 50, 61.