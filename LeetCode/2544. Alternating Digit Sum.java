You are given a positive integer n. Each digit of n has a sign according to the following rules:
The most significant digit is assigned a positive sign.
Each other digit has an opposite sign to its adjacent digits.
Return the sum of all digits with their corresponding sign.

Example 1:
Input: n = 521
Output: 4
Explanation: (+5) + (-2) + (+1) = 4.
Example 2:
Input: n = 111
Output: 1
Explanation: (+1) + (-1) + (+1) = 1.
Example 3:
Input: n = 886996
Output: 0
Explanation: (+8) + (-8) + (+6) + (-9) + (+9) + (-6) = 0.
 
Constraints:
1 <= n <= 109

CODE:

class Solution {
    public int alternateDigitSum(int n) {
		int len=String.valueOf(n).length();
        int arr[] = new int[len];
        int j = len-1;
		while(n>0){
			int rem = n%10;
			arr[j--] = rem;
			n = n/10;
		}
        int even = 0;
        int odd = 0;
        int c = 0;
		for (int i = 0; i < len; i++) {
			if(c%2!=0){
				odd += arr[i];
			}else{
				even+=arr[i];
			}
            c++;
		}
        return even - odd;
        }
}

OUTPUT:
Runtime
0
ms
Beats
100.00%
