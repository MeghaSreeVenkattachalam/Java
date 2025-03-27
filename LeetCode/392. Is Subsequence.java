Given two strings s and t, return true if s is a subsequence of t, or false otherwise.

A subsequence of a string is a new string that is formed from the original string by deleting some (can be none) of the characters without disturbing the relative positions of the remaining characters. (i.e., "ace" is a subsequence of "abcde" while "aec" is not).

Example 1:
Input: s = "abc", t = "ahbgdc"
Output: true
Example 2:
Input: s = "axc", t = "ahbgdc"
Output: false

Constraints:

0 <= s.length <= 100
0 <= t.length <= 104
s and t consist only of lowercase English letters.

CODE:

class Solution {
    public boolean isSubsequence(String s, String t) {
        //int count=0;
        char arr1[] = s.toCharArray();
        char arr2[] = t.toCharArray();
        int i=0;
        int j=0;
        while(i<s.length() && j<t.length()){
            if(arr1[i]==arr2[j]){
                i++;
                //count++;
            }
            j++;
        }
        return i==s.length();
        /*if(count == s.length()){
            return true;
        }
        else{
            return false;
        }*/
    }
}

OUTPUT:

Runtime
1
ms
Beats
93.16%
