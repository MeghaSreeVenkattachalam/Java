Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.

Assume the environment does not allow you to store 64-bit integers (signed or unsigned).

 

Example 1:

Input: x = 123
Output: 321
Example 2:

Input: x = -123
Output: -321
Example 3:

Input: x = 120
Output: 21
 

Constraints:

-231 <= x <= 231 - 1

CODE:

class Solution {
    public int reverse(int x) {

       //String str = Integer.toString(x); 

       
        long sum = 0;
        while(x!=0){
            int l = x%10;
            sum=(sum*10)+l;
            x=x/10;
        }
        return (sum<Integer.MIN_VALUE||sum>Integer.MAX_VALUE)?0:(int)sum;
            
        
        
    }
}

OUTPUT:

Runtime
1
ms
Beats
83.80%
