Given a circular integer array nums (i.e., the next element of nums[nums.length - 1] is nums[0]), return the next greater number for every element in nums.

The next greater number of a number x is the first greater number to its traversing-order next in the array, which means you could search circularly to find its next greater number. If it doesn't exist, return -1 for this number.

 

Example 1:

Input: nums = [1,2,1]
Output: [2,-1,2]
Explanation: The first 1's next greater number is 2; 
The number 2 can't find next greater number. 
The second 1's next greater number needs to search circularly, which is also 2.
Example 2:

Input: nums = [1,2,3,4,3]
Output: [2,3,4,-1,4]
 

Constraints:

1 <= nums.length <= 104
-109 <= nums[i] <= 109'

CODE:

class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int res[] = new int[nums.length];
        Stack<Integer> stack = new Stack<>();
        for(int i=nums.length-1;i>=0;i--){
            while(!stack.isEmpty() && stack.peek()<=nums[i]){
                stack.pop();
            }

            res[i] = stack.isEmpty()?-1:stack.peek();

            stack.push(nums[i]);
        }
        return res;
    }
}

OUTPUT:

Runtime
9
ms
Beats
92.77%

//ANOTHER APPROACH:

CODE:

class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int res[] = new int[nums.length];
        int i=0;
        while(i<nums.length){
            boolean found = false;
            for(int k=i+1;k<nums.length;k++){
                if(nums[k]>nums[i]){
                    found = true;
                    res[i] = nums[k];
                    break;
                }
            }
            if(!found && i>0){
                for(int j=0;j<i;j++){
                    if(nums[j]>nums[i]){
                        found = true;
                        res[i] = nums[j];
                        break;
                    }
                }
            }
            if(!found){
            res[i] = -1;
            }
            i++;
        }
        return res;
    }
}

OUTPUT:

Runtime
30
ms
Beats
12.93%
