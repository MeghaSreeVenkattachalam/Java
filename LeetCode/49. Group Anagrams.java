Given an array of strings strs, group the anagrams together. You can return the answer in any order.

 

Example 1:

Input: strs = ["eat","tea","tan","ate","nat","bat"]

Output: [["bat"],["nat","tan"],["ate","eat","tea"]]

Explanation:

There is no string in strs that can be rearranged to form "bat".
The strings "nat" and "tan" are anagrams as they can be rearranged to form each other.
The strings "ate", "eat", and "tea" are anagrams as they can be rearranged to form each other.
Example 2:

Input: strs = [""]

Output: [[""]]

Example 3:

Input: strs = ["a"]

Output: [["a"]]

 

Constraints:

1 <= strs.length <= 104
0 <= strs[i].length <= 100
strs[i] consists of lowercase English letters.

CODE:

class Solution {

    public boolean anagram(String s,String t){
        if(s.length()!=t.length()) return false;
        else{
            int[] count=new int[26];
            for(int i=0;i<s.length();i++){
                count[s.charAt(i)-'a']++;
                count[t.charAt(i)-'a']--;
            }
            for(int c:count){
                if(c!=0) return false;
            }
            return true;
        }
    }
    
    public List<List<String>> groupAnagrams(String[] strs) {
         List<List<String>> res=new ArrayList<>();
    
        boolean[] vis=new boolean[strs.length];
        for(int i=0;i<strs.length;i++){
            List<String> ana=new ArrayList<>();
            if(vis[i]) continue;
            ana.add(strs[i]);
            vis[i]=true;
            for(int j=i+1;j<strs.length;j++){
                if(anagram(strs[i],strs[j]) && vis[j]==false){
                    ana.add(strs[j]);
                    vis[j]=true;
                }
            }
            res.add(ana);
        }
       return res;
    }
}

OUTPUT:

Runtime
507
ms
Beats
5.03%
