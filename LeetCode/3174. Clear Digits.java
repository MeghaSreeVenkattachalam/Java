You are given a string s.
Your task is to remove all digits by doing this operation repeatedly:
Delete the first digit and the closest non-digit character to its left.
Return the resulting string after removing all digits.
Note that the operation cannot be performed on a digit that does not have any non-digit character to its left.

Example 1:
Input: s = "abc"
Output: "abc"
Explanation:
There is no digit in the string.

Example 2:
Input: s = "cb34"
Output: ""
Explanation:
First, we apply the operation on s[2], and s becomes "c4".
Then we apply the operation on s[1], and s becomes "".

Constraints:
1 <= s.length <= 100
s consists only of lowercase English letters and digits.
The input is generated such that it is possible to delete all digits.

CODE:

public class Solution {
    public static String clearDigits(String s) {
         StringBuilder result = new StringBuilder();
        
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isDigit(ch)) {
                // Find and remove the closest non-digit character to the left
                for (int j = result.length() - 1; j >= 0; j--) {
                    if (!Character.isDigit(result.charAt(j))) {
                        result.deleteCharAt(j);
                        break;
                    }
                }
            } else {
                result.append(ch);
            }
        }
        
        return result.toString();
    }
}


OUTPUT:

Runtime
1
ms
Beats
100.00%


//ANOTHER APPROACH - USING STACK

CODE:

public class Solution {
    public static String clearDigits(String s) {
        Stack<Character> stack = new Stack<>();
        for(char ch:s.toCharArray()){
            if(Character.isDigit(ch)){
                while(!stack.isEmpty()){
                    char top = stack.peek();
                    if(!Character.isDigit(top)){
                        stack.pop();
                        break;
                    }
                }
            }else{
                stack.push(ch);
            }
        }
        StringBuilder res = new StringBuilder();
        for(char ch:stack){
            res.append(ch);
        }
        return res.toString();
    }
}


OUTPUT:

Runtime
3
ms
Beats
31.96%
