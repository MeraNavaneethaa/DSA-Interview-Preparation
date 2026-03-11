/*
Problem: Reverse an Array

Description:
In this problem, we are given an array of integers.
Our task is to reverse the elements of the array.

Reversing an array means the first element becomes the last element,
the second element becomes the second last element, and so on.

Example:

Input:
arr = [1, 2, 3, 4, 5]

Explanation:
Original array:
1 2 3 4 5

After reversing:
5 4 3 2 1

Output:
Reversed Array: 5 4 3 2 1

--------------------------------------------------

Approach:

1. Use two variables called start and end.
2. Start points to the first element of the array.
3. End points to the last element of the array.
4. Swap the elements at start and end.
5. Move start forward and end backward.
6. Repeat until start is less than end.

This way we reverse the array in-place.

--------------------------------------------------

Time Complexity:
O(n)

Reason:
We traverse half of the array once.

--------------------------------------------------

Space Complexity:
O(1)

Reason:
We reverse the array without using extra space.

--------------------------------------------------
*/

public class ReverseArray {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};

        int start = 0;
        int end = arr.length - 1;

        while(start < end) {

            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }

        System.out.print("Reversed Array: ");

        for(int num : arr) {
            System.out.print(num + " ");
        }

    }
}
