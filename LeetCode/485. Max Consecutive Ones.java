Given a binary array nums, return the maximum number of consecutive 1's in the array.

Example 1:
Input: nums = [1,1,0,1,1,1]
Output: 3
Explanation: The first two digits or the last three digits are consecutive 1s. The maximum number of consecutive 1s is 3.
Example 2:
Input: nums = [1,0,1,1,0,1]
Output: 2
 
Constraints:
1 <= nums.length <= 105
nums[i] is either 0 or 1.

CODE:

class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count=0;
        int max=0;

        for(int val:nums){
            if(val==1){
                count++;
            }else{
                count = 0;
            }
            if(count>max){
                max=count;
            }
        }
        return max;

        /* code == 3ms

        for (int val : nums) {
            count = (val == 1) ? count + 1 : 0;
            max = Math.max(max, count);
        }
        return max;
        */
        
        /* code == 2ms

        for(int val:nums){
            if(val==1){
                count++;
            }else{
                max=Math.max(count,max);
                count=0;
            }
        }
        return Math.max(count,max);*/
        
        /* 
        code==2ms

        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                count++;
            }else{
                count = 0;
            }
            if(count>max){
                max=count;
            }
            //max = Math.max(count,max);
        }
        return max;*/
    }
}

OUTPUT:

Runtime
2
ms
Beats
93.74%
