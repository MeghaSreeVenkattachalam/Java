Given an integer array nums, find three numbers whose product is maximum and return the maximum product.

 

Example 1:

Input: nums = [1,2,3]
Output: 6
Example 2:

Input: nums = [1,2,3,4]
Output: 24
Example 3:

Input: nums = [-1,-2,-3]
Output: -6
 

Constraints:

3 <= nums.length <= 104
-1000 <= nums[i] <= 1000

CODE:

import java.util.Arrays;

class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;

        // Option 1: Last three elements
        int prod1 = nums[n - 1] * nums[n - 2] * nums[n - 3];

        // Option 2: Two smallest and the largest
        int prod2 = nums[0] * nums[1] * nums[n - 1];

        return Math.max(prod1, prod2);
    }
}

OUTPUT:

Runtime
11
ms
Beats
81.72%
