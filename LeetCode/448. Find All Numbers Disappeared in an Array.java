Given an array nums of n integers where nums[i] is in the range [1, n], return an array of all the integers in the range [1, n] that do not appear in nums.

Example 1:
Input: nums = [4,3,2,7,8,2,3,1]
Output: [5,6]
Example 2:
Input: nums = [1,1]
Output: [2]
 
Constraints:
n == nums.length
1 <= n <= 105
1 <= nums[i] <= n

CODE:

class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int i=0;
        //Kailash thought us 
        while(i<nums.length){
            int temp = nums[i]; //temp = 4
            if(nums[i]!=0){ // 4!=0
            int val = nums[temp-1]; // val = nums[4-1] = nums[3] = 7
            if(nums[temp-1]!=0){ // 7!=0
            nums[i] = val; // nums[i] = 7; the place where 4 is before
            nums[temp-1]=0; // nums[4-1] it indicates the 4th position then make it as 0
            }else{             // and the value in the 4th position is now in the nums[i] place when the i indicates 0 or it is 0 means only the i moves
            i++;
            }  
            }else{
                i++; // yeah according to our condition it should not be 0 nums[i]= 0 means move
            }    
        }
        for(int k=0;k<nums.length;k++){
            if(nums[k]!=0){
                list.add(k+1);
            }
        }
        return list;
    }
}

OUTPUT:

Runtime
7
ms
Beats
51.51%
