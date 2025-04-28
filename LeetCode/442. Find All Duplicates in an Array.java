Given an integer array nums of length n where all the integers of nums are in the range [1, n] and each integer appears at most twice, return an array of all the integers that appears twice.

You must write an algorithm that runs in O(n) time and uses only constant auxiliary space, excluding the space needed to store the output

 

Example 1:

Input: nums = [4,3,2,7,8,2,3,1]
Output: [2,3]
Example 2:

Input: nums = [1,1,2]
Output: [1]
Example 3:

Input: nums = [1]
Output: []
 

Constraints:

n == nums.length
1 <= n <= 105
1 <= nums[i] <= n
Each element in nums appears once or twice.

CODE:

class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int freq[] = new int[nums.length+1];
        for(int i:nums){
            freq[i]++;
        }
        for(int i=0;i<=nums.length;i++){
            if(freq[i]==2){
                list.add(i);
            }
        }
        return list;
    }
}

Runtime
3
ms
Beats
99.74%

//ANOTHER APPROACH USING COLLECTIONS-MAP

CODE:

class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> list = new ArrayList<>();
        Map<Integer,Integer> map  = new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(int i:nums){
            if(map.getOrDefault(i,0)==2){
                list.add(i);
                map.remove(i);
            }
        }
        return list;
    }
}

OUTPUT:

Runtime
32
ms
Beats
8.55
