/*
Problem: Check if an Array is Sorted

Description:
In this problem, we are given an array of integers.
Our task is to check whether the array is sorted in ascending order.

An array is considered sorted if every element is less than or equal to the next element.

Example:

Input:
arr = [1, 2, 3, 4, 5]

Explanation:
1 <= 2
2 <= 3
3 <= 4
4 <= 5

Since all elements follow ascending order, the array is sorted.

Output:
Array is Sorted

--------------------------------------------------

Approach:

1. Traverse the array from the first element.
2. Compare each element with the next element.
3. If the current element is greater than the next element,
   then the array is not sorted.
4. If the loop finishes without finding such a case,
   then the array is sorted.

--------------------------------------------------

Time Complexity:
O(n)

Reason:
We traverse the array once.

--------------------------------------------------

Space Complexity:
O(1)

Reason:
We are not using any extra space.

--------------------------------------------------
*/

public class CheckSortedArray {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};

        boolean isSorted = true;

        for(int i = 0; i < arr.length - 1; i++) {

            if(arr[i] > arr[i + 1]) {
                isSorted = false;
                break;
            }

        }

        if(isSorted)
            System.out.println("Array is Sorted");
        else
            System.out.println("Array is Not Sorted");

    }
}
