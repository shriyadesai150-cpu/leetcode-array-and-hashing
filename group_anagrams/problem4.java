/**
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
*/

package group_anagrams;

import java.util.*;

public class problem4 {
    public List<List<String>> groupAnagrams(String[] strs) {
        // TODO: Implement your solution here
        return new ArrayList<>();
    }

    public static void main(String[] args) {
        problem4 sol = new problem4();

        // Test cases
        System.out.println(sol.groupAnagrams(new String[] { "act", "pots", "tops", "cat", "stop", "hat" }));
        System.out.println(sol.groupAnagrams(new String[] { "x" }));
        System.out.println(sol.groupAnagrams(new String[] { "" }));
        System.out.println(sol.groupAnagrams(new String[] { "bat", "tab", "tap", "pat", "apt" }));
    }
}
