Given an integer n, count the total number of digit 1 appearing in all non-negative integers less than or equal to n.

 

Example 1:

Input: n = 13
Output: 6
Example 2:

Input: n = 0
Output: 0
 

Constraints:

0 <= n <= 109

CODE:

class Solution {
    public int countDigitOne(int n) {
        int count = 0;
        long place = 1; // Start from unit place

        while (place <= n) {
            long higher = n / (place * 10);    // Digits to the left
            long current = (n / place) % 10;   // Current digit
            long lower = n % place;            // Digits to the right

            if (current == 0) {
                count += higher * place;
            } else if (current == 1) {
                count += higher * place + lower + 1;
            } else {
                count += (higher + 1) * place;
            }

            place *= 10; // Move to next digit place
        }
        return count;
    }
}


OUTPUT:

Runtime
0
ms
Beats
100.00%
