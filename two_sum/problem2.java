/**
Two Sum
 
Given an array of integers nums and an integer target, return the indices i and j such that nums[i] + nums[j] == target and i != j.

You may assume that every input has exactly one pair of indices i and j that satisfy the condition.

Return the answer with the smaller index first.

Example 1:

Input: 
nums = [3,4,5,6], target = 7

Output: [0,1]
Explanation: nums[0] + nums[1] == 7, so we return [0, 1].

Example 2:

Input: nums = [4,5,6], target = 10

Output: [0,2]
Example 3:

Input: nums = [5,5], target = 10

Output: [0,1]
Constraints:

2 <= nums.length <= 1000
-10,000,000 <= nums[i] <= 10,000,000
-10,000,000 <= target <= 10,000,000
*/

package two_sum;

import java.util.*;

public class problem2 {
    public int[] twoSum(int[] nums, int target) {
        // TODO: Implement your solution here
        return new int[] {};
    }

    public static void main(String[] args) {
        problem2 s = new problem2();

        // Test cases
        System.out.println(Arrays.toString(s.twoSum(new int[] { 3, 4, 5, 6 }, 7))); // Expected: [0, 1]
        System.out.println(Arrays.toString(s.twoSum(new int[] { 4, 5, 6 }, 10))); // Expected: [0, 2]
        System.out.println(Arrays.toString(s.twoSum(new int[] { 5, 5 }, 10))); // Expected: [0, 1]
        System.out.println(Arrays.toString(s.twoSum(new int[] { 1, 9, 2, 8 }, 10))); // Expected: [0, 1] or [2, 3]
    }
}
