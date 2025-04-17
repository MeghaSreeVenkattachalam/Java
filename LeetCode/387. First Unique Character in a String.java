Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.

 

Example 1:

Input: s = "leetcode"

Output: 0

Explanation:

The character 'l' at index 0 is the first character that does not occur at any other index.

Example 2:

Input: s = "loveleetcode"

Output: 2

Example 3:

Input: s = "aabb"

Output: -1

 

Constraints:

1 <= s.length <= 105
s consists of only lowercase English letters.

CODE:

class Solution {
    public int firstUniqChar(String s) {
        int freq[] = new int[26];
        for(char ch:s.toCharArray()){
            freq[ch-'a']++;
        }
        for(int i=0;i<s.length();i++)
        {
            if(freq[s.charAt(i)-'a']==1) return i;
        }
        return -1;
    }
}

OUTPUT:

6
ms
Beats
83.05%

//ANOTHER APPROACH:

CODE:

class Solution {
    public int firstUniqChar(String s) {
        Map<Character,Integer> map = new LinkedHashMap<>();
        for(char ch:s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        int i=0;
        for(char ch:s.toCharArray()){
            if(map.get(ch)==1){
                return i;
               
            }
            i++;
        }
        return -1;
    }
}

OUTPUT:

Runtime
33
ms
Beats
26.60
