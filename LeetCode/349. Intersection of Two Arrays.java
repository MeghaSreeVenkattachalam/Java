Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must be unique and you may return the result in any order.

 

Example 1:

Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2]
Example 2:

Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [9,4]
Explanation: [4,9] is also accepted.
 

Constraints:

1 <= nums1.length, nums2.length <= 1000
0 <= nums1[i], nums2[i] <= 1000

CODE:

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> list = new HashSet<>();
        for(int num:nums1){
            list.add(num);
        }
        Set<Integer> res = new HashSet<>();
        for(int num:nums2){
            if(list.contains(num)){
                res.add(num);
            }
        }
        int arr[] = new int[res.size()];
        int i=0;
        for(int num:res){
            arr[i++] = num;
        }
        return arr;
    }
}

OUTPUT:

Runtime
2
ms
Beats
96.15%
