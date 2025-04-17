Given two strings s and t, return true if t is an anagram of s, and false otherwise.

 

Example 1:

Input: s = "anagram", t = "nagaram"

Output: true

Example 2:

Input: s = "rat", t = "car"

Output: false

 

Constraints:

1 <= s.length, t.length <= 5 * 104
s and t consist of lowercase English letters.

CODE:

class Solution {
    public boolean isAnagram(String s, String t) {
        
        if(s.length()!=t.length()){
            return false;
        }
        char c1[] = s.toCharArray();
        char c2[] = t.toCharArray();

        Arrays.sort(c1);
        Arrays.sort(c2);

        s=new String(c1);
        t=new String(c2);

        if(s.equals(t)){
            return true;
        }else{
            return false;
        }
    }
}

OUTPUT:
Runtime
3
ms
Beats
90.37%

//ANOTHER APPROACH:

CODE:

class Solution {
    public boolean isAnagram(String s, String t) {
        
        if(s.length()!=t.length()){
            return false;
        }
        
        Map<Character,Integer> map1 = new TreeMap<>();
        Map<Character,Integer> map2 = new TreeMap<>();
        for(char ch:s.toCharArray()){
            map1.put(ch,map1.getOrDefault(ch,0)+1);
        }
        for(char ch:t.toCharArray()){
            map2.put(ch,map2.getOrDefault(ch,0)+1);
        }

        if(map1.equals(map2)){
            return true;
        }else{
            return false;
        }
    }
}

OUTPUT:

Runtime
20
ms
Beats
12.36%
