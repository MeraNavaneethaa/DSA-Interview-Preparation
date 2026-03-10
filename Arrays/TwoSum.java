/*
Problem: Two Sum

Description:
Given an array of integers and a target number,
find two numbers in the array whose sum equals the target.

Example:
Input:
nums = [2, 7, 11, 15]
target = 9

Output:
Indices: 0 1
Because nums[0] + nums[1] = 2 + 7 = 9

--------------------------------------------------

Approach (Brute Force):
1. Traverse the array using two loops.
2. Pick the first element using the outer loop.
3. Compare it with every other element using the inner loop.
4. If their sum equals the target, print their indices.

This approach checks all possible pairs.

--------------------------------------------------

Time Complexity:
O(n²)
Because we are using two loops.

Space Complexity:
O(1)
No extra memory is used.

--------------------------------------------------
*/

public class TwoSum {

    public static void main(String[] args) {

        int[] nums = {2, 7, 11, 15};
        int target = 9;

        for (int i = 0; i < nums.length; i++) {

            for (int j = i + 1; j < nums.length; j++) {

                if (nums[i] + nums[j] == target) {

                    System.out.println("Indices: " + i + " " + j);

                }
            }

        }
    }
}
