You are given a sorted unique integer array nums.

A range [a,b] is the set of all integers from a to b (inclusive).

Return the smallest sorted list of ranges that cover all the numbers in the array exactly. That is, each element of nums is covered by exactly one of the ranges, and there is no integer x such that x is in one of the ranges but not in nums.

Each range [a,b] in the list should be output as:

"a->b" if a != b
"a" if a == b
 

Example 1:

Input: nums = [0,1,2,4,5,7]
Output: ["0->2","4->5","7"]
Explanation: The ranges are:
[0,2] --> "0->2"
[4,5] --> "4->5"
[7,7] --> "7"
Example 2:

Input: nums = [0,2,3,4,6,8,9]
Output: ["0","2->4","6","8->9"]
Explanation: The ranges are:
[0,0] --> "0"
[2,4] --> "2->4"
[6,6] --> "6"
[8,9] --> "8->9"
 

Constraints:

0 <= nums.length <= 20
-231 <= nums[i] <= 231 - 1
All the values of nums are unique.
nums is sorted in ascending order.

CODE:

class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> list=new ArrayList<>();
        if (nums == null || nums.length == 0) return list;
        int start=nums[0];
        int end=nums[0];
        for(int i=1;i<nums.length;i++){
            StringBuilder s=new StringBuilder();
            if(!(nums[i]-nums[i-1]==1)){
                end=nums[i-1];
                if(start!=end)
                list.add(s.append(start).append("->").append(end).toString());
                else
                list.add(s.append(start).toString());
                start=nums[i];
            }
           
        }
        if (start != nums[nums.length - 1]) {
            list.add(start + "->" + nums[nums.length - 1]);
        } else {
            list.add(String.valueOf(start));
        }

        return list;
    }
}

OUTPUT:

Runtime
4
ms
Beats
86.22%
