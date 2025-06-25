Given a string s, find the length of the longest substring without duplicate characters.

 

Example 1:

Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.
Example 2:

Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
Example 3:

Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
 

Constraints:

0 <= s.length <= 5 * 104
s consists of English letters, digits, symbols and spaces.

CODE:

class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int k = 0;
        int max = 0;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            while(set.contains(ch)){
                set.remove(s.charAt(k));
                k++;
            }
            set.add(ch);
            max = Math.max(max,i-k+1);
        }
        return max;
    }
}

OUTPUT:

Runtime
7
ms
Beats
35.60%
