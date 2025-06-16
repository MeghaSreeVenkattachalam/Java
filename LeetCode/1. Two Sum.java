Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:

Input: nums = [3,3], target = 6
Output: [0,1]
 

Constraints:

2 <= nums.length <= 104
-109 <= nums[i] <= 109
-109 <= target <= 109
Only one valid answer exists.


CODE:

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int val = target-nums[i];
            if(map.containsKey(val)){
                return new int[]{map.get(val),i};
            }
            map.put(nums[i],i);
        }
        return new int[]{-1,-1};
    }
}

OUTPUT:
Runtime
2
ms
Beats
98.89%


//ANOTHER APPROACH:
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        int[] arr= new int[2];
        int j=0;
        for (int i = 0; i < n - 1; i++) {
            j=i+1;
            while(j<n){
            if (nums[i] + nums[j] == target) {
                    //return new int[]{i, j};
                arr[0]=i;
                arr[1]=j;
            }
            j++;
            }
        }
        return arr;

        /*
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] + nums[j] == target) {
                    //return new int[]{i, j};
                    arr[0]=i;
                    arr[1]=j;
                }
            }
        }
        return arr;
        //return [i,j];new int[]{};
        */
    }
}

OUTPUT:

Runtime
49
ms
Beats
12.50%
 
