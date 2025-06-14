Given an integer array nums and an integer k, return the kth largest element in the array.

Note that it is the kth largest element in the sorted order, not the kth distinct element.

Can you solve it without sorting?

 

Example 1:

Input: nums = [3,2,1,5,6,4], k = 2
Output: 5
Example 2:

Input: nums = [3,2,3,1,2,4,5,5,6], k = 4
Output: 4
 

Constraints:

1 <= k <= nums.length <= 105
-104 <= nums[i] <= 104

CODE:

class Solution {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        //if(nums.length==2) return nums[nums.length-1];
        //int count = 1;
        //for(int i=nums.length-1;i>0;i--){
            //if(nums[i]>=nums[i-1] ){
            //    count++;
            //   if(count==k) return nums[i-1];
        //}
        return nums[nums.length-k];
    }
}

OUTPUT:

Runtime
22
ms
Beats
92.70%
