/*
Problem: Find Maximum Element in an Array

Description:
In this problem, we are given an array of integers.
Our task is to find the largest element present in the array.

An array stores multiple values in a single variable, and each value can be accessed using its index.

To find the maximum element, we compare each element of the array with the current maximum value.

Example:

Input:
arr = [3, 7, 2, 9, 5]

Explanation:
3 is the first element → assume it is the maximum

Compare with next elements:
7 > 3 → new max = 7
2 < 7 → ignore
9 > 7 → new max = 9
5 < 9 → ignore

Output:
Maximum Element: 9

--------------------------------------------------

Approach:

1. Assume the first element of the array is the maximum.
2. Traverse the array using a loop.
3. Compare each element with the current maximum.
4. If a larger element is found, update the maximum value.
5. After the loop finishes, the maximum variable will contain the largest element.

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

public class FindMaxElement {

    public static void main(String[] args) {

        int[] arr = {3, 7, 2, 9, 5};

        int max = arr[0];

        for(int i = 1; i < arr.length; i++) {

            if(arr[i] > max) {
                max = arr[i];
            }

        }

        System.out.println("Maximum Element: " + max);

    }

}
