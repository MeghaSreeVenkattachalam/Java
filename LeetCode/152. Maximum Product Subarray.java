Given an integer array nums, find a subarray that has the largest product, and return the product.

The test cases are generated so that the answer will fit in a 32-bit integer.

 

Example 1:

Input: nums = [2,3,-2,4]
Output: 6
Explanation: [2,3] has the largest product 6.
Example 2:

Input: nums = [-2,0,-1]
Output: 0
Explanation: The result cannot be 2, because [-2,-1] is not a subarray.
 

Constraints:

1 <= nums.length <= 2 * 104
-10 <= nums[i] <= 10
The product of any subarray of nums is guaranteed to fit in a 32-bit integer.


CODE:

class Solution {
    public int maxProduct(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }
        int minProd = nums[0];
        int maxProd = nums[0];
        int res = nums[0];
        for(int i=1;i<nums.length;i++){
            int current = nums[i];
            if(current<0){
                int temp = maxProd;
                maxProd = minProd;
                minProd = temp;
            }
            maxProd = Math.max(current,maxProd*current);
            minProd = Math.min(current,minProd*current);
            res = Math.max(res,maxProd);
        }
        return res;
    }
}

OUTPUT:

Runtime
2
ms
Beats
56.14%
