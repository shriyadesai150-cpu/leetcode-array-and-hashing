'''
Valid Anagram
 
Given two strings s and t, return true if the two strings are anagrams of each other, otherwise return false.

An anagram is a string that contains the exact same characters as another string, but the order of the characters can be different.

Example 1:

Input: s = "racecar", t = "carrace"

Output: true
Example 2:

Input: s = "jar", t = "jam"

Output: false
Constraints:

s and t consist of lowercase English letters.
'''

class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        # TODO: Implement your solution here
        pass


if __name__ == "__main__":
    s = Solution()

    # Test cases
    print(s.isAnagram("racecar", "carrace"))  # Expected: True
    print(s.isAnagram("jar", "jam"))          # Expected: False
    print(s.isAnagram("listen", "silent"))    # Expected: True
    print(s.isAnagram("hello", "world"))      # Expected: False