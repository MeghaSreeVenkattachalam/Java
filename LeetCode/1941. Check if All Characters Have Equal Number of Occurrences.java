Given a string s, return true if s is a good string, or false otherwise.

A string s is good if all the characters that appear in s have the same number of occurrences (i.e., the same frequency).

 

Example 1:

Input: s = "abacbc"
Output: true
Explanation: The characters that appear in s are 'a', 'b', and 'c'. All characters occur 2 times in s.
Example 2:

Input: s = "aaabb"
Output: false
Explanation: The characters that appear in s are 'a' and 'b'.
'a' occurs 3 times while 'b' occurs 2 times, which is not the same number of times.
 

Constraints:

1 <= s.length <= 1000
s consists of lowercase English letters.

CODE:

class Solution {
    public boolean areOccurrencesEqual(String s) {
        int freq[] = new int[26];
        for(char ch:s.toCharArray()){
            freq[ch-'a']++;
        }
        int last = -1;
        for(int i:freq){
            if(i==0){
                continue;
            }
            else if (last==-1){
                last = i;
            }else if(last!=i){
                return false;
            }
        }
        return true;
    }
}

OUTPUT:

Runtime
1
ms
Beats
99.78%


//ANOTHER APPROACH:

CODE:

class Solution {
    public boolean areOccurrencesEqual(String s) {
        Map<Character,Integer> map = new HashMap<>();
        for(char ch:s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        int freq = -1;
        for(Map.Entry<Character,Integer> entry:map.entrySet()){
            int val = entry.getValue();
            if(freq == -1){
                freq = val;
            }else if(freq!=val){
                return false;
            }
        }
        return true;
    }
}

OUTPUT:

Runtime
7
ms
Beats
65.84
