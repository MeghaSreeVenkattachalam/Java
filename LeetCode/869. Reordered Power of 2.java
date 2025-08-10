You are given an integer n. We reorder the digits in any order (including the original order) such that the leading digit is not zero.

Return true if and only if we can do this so that the resulting number is a power of two.

 

Example 1:

Input: n = 1
Output: true
Example 2:

Input: n = 10
Output: false
 

Constraints:

1 <= n <= 109

CODE:

class Solution {
    public boolean reorderedPowerOf2(int n) {
        String target = sortedString(n);
        for (int i = 0; i < 31; i++) { // 0..30 covers all int powers of 2
            if (sortedString(1 << i).equals(target)) return true;
        }
        return false;
    }

    private String sortedString(int x) {
        char[] arr = String.valueOf(x).toCharArray();
        Arrays.sort(arr);
        return new String(arr);
    }
}

OUTPUT:

Runtime
1
ms
Beats
85.79%
