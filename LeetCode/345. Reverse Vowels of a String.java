Given a string s, reverse only all the vowels in the string and return it.

The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.

 

Example 1:

Input: s = "IceCreAm"

Output: "AceCreIm"

Explanation:

The vowels in s are ['I', 'e', 'e', 'A']. On reversing the vowels, s becomes "AceCreIm".

Example 2:

Input: s = "leetcode"

Output: "leotcede"

 

Constraints:

1 <= s.length <= 3 * 105
s consist of printable ASCII characters.

CODE:

class Solution {
    public String reverseVowels(String s) {
        String str = "";
        char ch[] = s.toCharArray();
        int i=0;
        int j=s.length()-1;
        while(i<j){
            if(!(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u'||ch[i]=='A'||ch[i]=='E'||ch[i]=='I'||ch[i]=='O'||ch[i]=='U')){
                i++;
                continue;
                
            }
			if(!(ch[j]=='a'||ch[j]=='e'||ch[j]=='i'||ch[j]=='o'||ch[j]=='u'||ch[j]=='A'||ch[j]=='E'||ch[j]=='I'||ch[j]=='O'||ch[j]=='U')){ 
                j--;
                continue;
               
            }
    
            char temp = ch[i];
            ch[i] = ch[j];
            ch[j] = temp;
            
            i++;
            j--;
        }
        return String.valueOf(ch);
    }
}

OUTPUT:

Runtime
2
ms
Beats
98.63%
