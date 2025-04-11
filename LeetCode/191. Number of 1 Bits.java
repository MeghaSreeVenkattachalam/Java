Given a positive integer n, write a function that returns the number of set bits in its binary representation (also known as the Hamming weight).

 

Example 1:

Input: n = 11

Output: 3

Explanation:

The input binary string 1011 has a total of three set bits.

Example 2:

Input: n = 128

Output: 1

Explanation:

The input binary string 10000000 has a total of one set bit.

Example 3:

Input: n = 2147483645

Output: 30

Explanation:

The input binary string 1111111111111111111111111111101 has a total of thirty set bits.

 

Constraints:

1 <= n <= 231 - 1
 

CODE:

class Solution {
    public int hammingWeight(int n) {
        //String str = Integer.toBinaryString(n);
        int count = 0;
        while(n!=0){
            n = n&(n-1);
            count++;
        }
        // for(int i=0;i<str.length();i++){
        //     if(str.charAt(i)!='0'){
        //         count++;
        //     }
        // }
        return count;
    }
}

OUTPUT:

Runtime
0
ms
Beats
100.00%
