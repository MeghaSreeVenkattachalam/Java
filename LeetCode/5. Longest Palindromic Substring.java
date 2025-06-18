Given a string s, return the longest palindromic substring in s.

 

Example 1:

Input: s = "babad"
Output: "bab"
Explanation: "aba" is also a valid answer.
Example 2:

Input: s = "cbbd"
Output: "bb"
 

Constraints:

1 <= s.length <= 1000
s consist of only digits and English letters.

CODE:

class Solution {
    boolean ispal(String sub){
            int left = 0;
            int right = sub.length()-1;
            while(left<right){
                if(sub.charAt(left)!=sub.charAt(right)){
                    return false;
                }
                left++;
                right--;
            }
            return true;
        }
    public String longestPalindrome(String s) {
        String longest = "";
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<=s.length();j++){
                String sub = s.substring(i,j);
                if(ispal(sub) && sub.length()>=longest.length()){
                    longest = sub;
                }
            }
        }
        return longest;
    }
}

OUTPUT:

Runtime
2529
ms
Beats
5.14%
