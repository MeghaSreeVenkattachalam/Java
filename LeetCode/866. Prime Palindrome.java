Given an integer n, return the smallest prime palindrome greater than or equal to n.

An integer is prime if it has exactly two divisors: 1 and itself. Note that 1 is not a prime number.

For example, 2, 3, 5, 7, 11, and 13 are all primes.
An integer is a palindrome if it reads the same from left to right as it does from right to left.

For example, 101 and 12321 are palindromes.
The test cases are generated so that the answer always exists and is in the range [2, 2 * 108].

 

Example 1:

Input: n = 6
Output: 7
Example 2:

Input: n = 8
Output: 11
Example 3:

Input: n = 13
Output: 101
 

Constraints:

1 <= n <= 108

CODE:

class Solution {
    public static boolean isPrime(int n){
        if(n<2){
            return false;
        }
        if(n==2){
            return true;
        }
        if(n%2==0){
            return false;
        }
        for(int i=3;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static boolean isPalindrome(int n){
        if(n<=9){
            return true;
        }
        int val = n;
        int rev = 0;
        while(val!=0){
            rev = rev*10+val%10;
            val/=10;
        }
        return rev==n;
    } 
    public int primePalindrome(int n) {
        for(int i=n;;i++){
            if(i>10000000 && i<100000000){
                i = 100000000;
            }
            if(isPalindrome(i) && isPrime(i)){
                return i;
            }
        }
    }
}

OUTPUT:

Runtime
31
ms
Beats
61.88%
