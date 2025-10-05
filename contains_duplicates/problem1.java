/**
Contains Duplicate
 
Given an integer array nums, return true if any value appears more than once in the array, otherwise return false.

Example 1:

Input: nums = [1, 2, 3, 3]

Output: true

Example 2:

Input: nums = [1, 2, 3, 4]

Output: false
*/

package contains_duplicates;

public class problem1 {
    public boolean hasDuplicate(int[] nums) {
        // TODO: Implement your solution here
        return false;
    }

    public static void main(String[] args) {
        problem1 s = new problem1();

        System.out.println(s.hasDuplicate(new int[] { 1, 2, 3, 3 })); // Expected: true
        System.out.println(s.hasDuplicate(new int[] { 1, 2, 3, 4 })); // Expected: false
        System.out.println(s.hasDuplicate(new int[] { 1, 1 })); // Expected: true
        System.out.println(s.hasDuplicate(new int[] {})); // Expected: false
    }
}