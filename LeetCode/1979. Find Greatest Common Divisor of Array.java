Given an integer array nums, return the greatest common divisor of the smallest number and largest number in nums.

The greatest common divisor of two numbers is the largest positive integer that evenly divides both numbers.

 

Example 1:

Input: nums = [2,5,6,9,10]
Output: 2
Explanation:
The smallest number in nums is 2.
The largest number in nums is 10.
The greatest common divisor of 2 and 10 is 2.
Example 2:

Input: nums = [7,5,6,8,3]
Output: 1
Explanation:
The smallest number in nums is 3.
The largest number in nums is 8.
The greatest common divisor of 3 and 8 is 1.
Example 3:

Input: nums = [3,3]
Output: 3
Explanation:
The smallest number in nums is 3.
The largest number in nums is 3.
The greatest common divisor of 3 and 3 is 3.
 

Constraints:

2 <= nums.length <= 1000
1 <= nums[i] <= 1000

CODE:

class Solution {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        int min = nums[0];
        int max = nums[nums.length-1];
        int ans = 1;
        for(int i=min;i>=2;i--){
            if(min%i==0 && max%i==0){
                ans = i;
                break;
            }
        }
        return ans;
    }
}

OUTPUT:

Runtime
2
ms
Beats
43.54%

//ANOTHER APPROACH:

CODE:

class Solution {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        int min = nums[0];
        int max = nums[nums.length-1];
        int ans = 0;
        for(int i=1;i<=max;i++){
            if(min%i==0 && max%i==0){
                ans = i;
            }
        }
        return ans;
    }
}

OUTPUT:

Runtime
4
ms
Beats
5.04
