'''
Contains Duplicate
 
Given an integer array nums, return true if any value appears more than once in the array, otherwise return false.

Example 1:

Input: nums = [1, 2, 3, 3]

Output: true

Example 2:

Input: nums = [1, 2, 3, 4]

Output: false

'''

from typing import List

class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        # TODO: Implement your solution here
        pass


if __name__ == "__main__":
    s = Solution()
    print(s.hasDuplicate([1, 2, 3, 3]))  # Expected: True
    print(s.hasDuplicate([1, 2, 3, 4]))  # Expected: False
    print(s.hasDuplicate([1, 1]))        # Expected: True
    print(s.hasDuplicate([]))            # Expected: False