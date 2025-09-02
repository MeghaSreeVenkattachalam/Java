Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".

 

Example 1:

Input: strs = ["flower","flow","flight"]
Output: "fl"
Example 2:

Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.
 

Constraints:

1 <= strs.length <= 200
0 <= strs[i].length <= 200
strs[i] consists of only lowercase English letters if it is non-empty.

CODE:

class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs==null || strs.length==0){
            return "";
        }
        Arrays.sort(strs);
        String first = strs[0];
        String last = strs[strs.length-1];
        int i=0;
        while(i<first.length() && i<last.length()){
            if(first.charAt(i)==last.charAt(i)){
                i++;
            }else{
                break;
            }
        }
        return first.substring(0,i);
    }
}

OUTPUT:

Runtime
1
ms
Beats
61.57%
