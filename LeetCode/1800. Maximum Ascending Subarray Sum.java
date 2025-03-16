Given an array of positive integers nums, return the maximum possible sum of an strictly increasing subarray in nums.
A subarray is defined as a contiguous sequence of numbers in an array.

Example 1:
Input: nums = [10,20,30,5,10,50]
Output: 65
Explanation: [5,10,50] is the ascending subarray with the maximum sum of 65.
Example 2:
Input: nums = [10,20,30,40,50]
Output: 150
Explanation: [10,20,30,40,50] is the ascending subarray with the maximum sum of 150.
Example 3:
Input: nums = [12,17,15,13,10,11,12]
Output: 33
Explanation: [10,11,12] is the ascending subarray with the maximum sum of 33.

Constraints:
1 <= nums.length <= 100
1 <= nums[i] <= 100

CODE:

class Solution {
    public int maxAscendingSum(int[] nums) {
        int maxSum = nums[0];
        int currSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                currSum += nums[i]; // Continue the ascending subarray
            } else {
                maxSum = Math.max(maxSum, currSum); // Update maxSum if needed
                currSum = nums[i]; // Start a new subarray
            }
        }
        return Math.max(maxSum, currSum); // Ensure we consider the last subarray
    }
}
/*class Solution {
    public int maxAscendingSum(int[] nums) {
        int max = nums[0];
        int curr = nums[0];

        for(int i=1;i<nums.length;i++){
            if(nums[i]>nums[i-1]){
                curr += nums[i];
            }else{
                max = Math.max(max,curr);
                curr += nums[i];
            }
        }
        return Math.max(max,curr);

        /*for(int i=1;i<nums.length;i++){
            if(nums[i]<min){
                min = i;
            }
        }
        int sum=0;
        for(int i=min;i<nums.length;i++){
            sum += nums[i];
        }
        return sum;
    }
} 

*/

OUTPUT:

Runtime
0
ms
Beats
100.00%
