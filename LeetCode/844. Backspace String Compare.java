Given two strings s and t, return true if they are equal when both are typed into empty text editors. '#' means a backspace character.

Note that after backspacing an empty text, the text will continue empty.

 

Example 1:

Input: s = "ab#c", t = "ad#c"
Output: true
Explanation: Both s and t become "ac".
Example 2:

Input: s = "ab##", t = "c#d#"
Output: true
Explanation: Both s and t become "".
Example 3:

Input: s = "a#c", t = "b"
Output: false
Explanation: s becomes "c" while t becomes "b".
 

Constraints:

1 <= s.length, t.length <= 200
s and t only contain lowercase letters and '#' characters.

CODE:

class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> stack1 = new Stack<>();
        Stack<Character> stack2 = new Stack<>();
        for(char ch:s.toCharArray()){
            if(!stack1.isEmpty() && ch=='#'){
                stack1.pop();
            }else{
                if(ch!='#'){
                stack1.push(ch);
                }
            }
        }
        for(char ch:t.toCharArray()){
            if(!stack2.isEmpty() && ch=='#'){
                stack2.pop();
            }else{
                if(ch!='#'){
                stack2.push(ch);
                }
            }
        }
        StringBuilder res1 = new StringBuilder();
        for(char ch:stack1){
            res1.append(ch);
        }
        StringBuilder res2 = new StringBuilder();
        for(char ch:stack2){
            res2.append(ch);
        }
        return (res1.toString()).equals(res2.toString());
    }
}

OUTPUT:

Runtime
2
ms
Beats
49.18%

