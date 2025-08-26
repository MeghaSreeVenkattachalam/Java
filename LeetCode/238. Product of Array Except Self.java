Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].

The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.

You must write an algorithm that runs in O(n) time and without using the division operation.

 

Example 1:

Input: nums = [1,2,3,4]
Output: [24,12,8,6]
Example 2:

Input: nums = [-1,1,0,-3,3]
Output: [0,0,9,0,0]
 

Constraints:

2 <= nums.length <= 105
-30 <= nums[i] <= 30
The input is generated such that answer[i] is guaranteed to fit in a 32-bit integer.


CODE:

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int mul = 1;
        for(int i=0;i<nums.length;i++){
            mul *= nums[i];
        }
        for(int i=0;i<nums.length;i++){
            
            if(nums[i]!=0){
                int val = nums[i];
                nums[i] = mul/val;
            }else if(nums[i]==0){
                int v = nums[i];
                for(int j=0;j<nums.length;j++){
                    if(nums[j]!=0 && nums[j]!=v){
                    mul *= nums[j];
                    }
                }
                nums[i] = mul;
            }
            // }else if(nums[i]<0){

            // }else{
            //     nums[i] = 0;
            // }
        }
        return nums;
    }
}

OUTPUT:

Runtime
1
ms
Beats
100.00%
