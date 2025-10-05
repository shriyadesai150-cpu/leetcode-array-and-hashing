'''
Group Anagrams
 
Given an array of strings strs, group all anagrams together into sublists. You may return the output in any order.

An anagram is a string that contains the exact same characters as another string, but the order of the characters can be different.

Example 1:

Input: strs = ["act","pots","tops","cat","stop","hat"]

Output: [["hat"],["act", "cat"],["stop", "pots", "tops"]]
Example 2:

Input: strs = ["x"]

Output: [["x"]]
Example 3:

Input: strs = [""]

Output: [[""]]
Constraints:

1 <= strs.length <= 1000.
0 <= strs[i].length <= 100
strs[i] is made up of lowercase English letters.
'''

from typing import List

class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        # TODO: Implement your solution here
        pass


if __name__ == "__main__":
    s = Solution()

    # Test cases
    print(s.groupAnagrams(["act", "pots", "tops", "cat", "stop", "hat"]))  # Expected: [["hat"], ["act", "cat"], ["stop", "pots", "tops"]]
    print(s.groupAnagrams(["x"]))                                          # Expected: [["x"]]
    print(s.groupAnagrams([""]))                                           # Expected: [[""]]
    print(s.groupAnagrams(["bat", "tab", "tap", "pat", "apt"]))            # Expected: grouped anagrams