You are given a string num representing a large integer. An integer is good if it meets the following conditions:

It is a substring of num with length 3.
It consists of only one unique digit.
Return the maximum good integer as a string or an empty string "" if no such integer exists.

Note:

A substring is a contiguous sequence of characters within a string.
There may be leading zeroes in num or a good integer.
 

Example 1:

Input: num = "6777133339"
Output: "777"
Explanation: There are two distinct good integers: "777" and "333".
"777" is the largest, so we return "777".
Example 2:

Input: num = "2300019"
Output: "000"
Explanation: "000" is the only good integer.
Example 3:

Input: num = "42352338"
Output: ""
Explanation: No substring of length 3 consists of only one unique digit. Therefore, there are no good integers.
 

Constraints:

3 <= num.length <= 1000
num only consists of digits.

CODE:

public class Solution {
    public String largestGoodInteger(String num) {
        String max = "";
        for(int i=0;i<=num.length()-3;i++){
            String sub = num.substring(i,i+3);
            if(sub.charAt(0)==sub.charAt(1) && sub.charAt(1)==sub.charAt(2)){
                if(max.equals("") || sub.compareTo(max)>0){
                    max = sub;
                }
            }
        }
        return max;
    }
}

OUTPUT:

Runtime
3
ms
Beats
51.20%
