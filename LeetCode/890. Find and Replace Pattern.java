Given a list of strings words and a string pattern, return a list of words[i] that match pattern. You may return the answer in any order.

A word matches the pattern if there exists a permutation of letters p so that after replacing every letter x in the pattern with p(x), we get the desired word.

Recall that a permutation of letters is a bijection from letters to letters: every letter maps to another letter, and no two letters map to the same letter.

 

Example 1:

Input: words = ["abc","deq","mee","aqq","dkd","ccc"], pattern = "abb"
Output: ["mee","aqq"]
Explanation: "mee" matches the pattern because there is a permutation {a -> m, b -> e, ...}. 
"ccc" does not match the pattern because {a -> c, b -> c, ...} is not a permutation, since a and b map to the same letter.
Example 2:

Input: words = ["a","b","c"], pattern = "a"
Output: ["a","b","c"]
 

Constraints:

1 <= pattern.length <= 20
1 <= words.length <= 50
words[i].length == pattern.length
pattern and words[i] are lowercase English letters.

CODE:

class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> list = new ArrayList<>();
        for(int i=0;i<words.length;i++)
        {
              Map<Character, Integer> map1 = new HashMap<>();
            Map<Character, Integer> map2 = new HashMap<>();
            String word=words[i];
            boolean b=true;
           for (int j = 0; j < word.length(); j++)
            {
                char c=word.charAt(j);
                char p=pattern.charAt(j);
               if (!map1.containsKey(c)) map1.put(c, j);
                if(!map2.containsKey(p)) map2.put(p,j);
                if(!map1.get(c).equals(map2.get(p)))
                {
                    b=false;
                    break;
                }
            }
if (b) list.add(word);        }
        return list;
        
        
    }
}

OUTPUT:

Runtime
3
ms
Beats
12.48%
