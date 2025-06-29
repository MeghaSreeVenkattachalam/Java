Given an integer array of size n, find all elements that appear more than ⌊ n/3 ⌋ times.

 

Example 1:

Input: nums = [3,2,3]
Output: [3]
Example 2:

Input: nums = [1]
Output: [1]
Example 3:

Input: nums = [1,2]
Output: [1,2]
 

Constraints:

1 <= nums.length <= 5 * 104
-109 <= nums[i] <= 109

CODE:

class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int len = nums.length/3;
        Map<Integer,Integer> map = new TreeMap<>();
        List<Integer> list = new ArrayList<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
                if(entry.getValue()>len){
                    list.add(entry.getKey());
                }
            
        }
        return list;
    }
}

OUTPUT:

Runtime
27
ms
Beats
6.38%
