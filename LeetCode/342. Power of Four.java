Given an integer n, return true if it is a power of four. Otherwise, return false.
An integer n is a power of four, if there exists an integer x such that n == 4x.

Example 1:
Input: n = 16
Output: true

Example 2:
Input: n = 5
Output: false

Example 3:
Input: n = 1
Output: true

Constraints:
-231 <= n <= 231 - 1

CODE:

class Solution {
    public boolean isPowerOfFour(int n) {
        return (n>0) && (n& (n-1)) == 0 && (n-1)%3 == 0;
    }
}

OUTPUT:
Runtime
0
ms
Beats
100.00%


/*
Check whether it is a power of 4 or not?

class Solution {
    public boolean isPowerOfFour(int n) {
        return (n>0) && (n & (n-1)) == 0 && (n-1)%3 == 0;
    }
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    System.out.print(isPowerOfFour(n));
  }
}
*/
