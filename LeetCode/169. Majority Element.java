Given an array nums of size n, return the majority element.

The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

Example 1:
Input: nums = [3,2,3]
Output: 3
Example 2:
Input: nums = [2,2,1,1,1,2,2]
Output: 2

Constraints:
n == nums.length
1 <= n <= 5 * 104
-109 <= nums[i] <= 109
 
CODE:

class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }
}

OUTPUT:

Runtime
3
ms
Beats
57.63%

 //ANOTHER APPROACH: 

 CODE:

 class Solution {
    public int majorityElement(int[] nums) {
        int candidate = 0, count = 0;

        // Phase 1: Find a candidate
        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
        }

        // Phase 2: Verify the candidate
        count = 0;
        for (int num : nums) {
            if (num == candidate) {
                count++;
            }
        }

        return count > nums.length / 2 ? candidate : -1; // -1 if no majority element
    
        //Arrays.sort(nums);
        //return nums[nums.length/2];
    }
}

OUTPUT:

Runtime
1
ms
Beats
99.88%

 //ANOTHER APPROACH:

 CODE:

class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer,Integer> map = new TreeMap<>();
        int len = nums.length/2;
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
            if(map.get(i)>len) return i;
        }
        return -1;
    }
}

OUTPUT:

Runtime
18
ms
Beats
12.82
