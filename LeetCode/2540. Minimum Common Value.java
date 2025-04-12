Given two integer arrays nums1 and nums2, sorted in non-decreasing order, return the minimum integer common to both arrays. If there is no common integer amongst nums1 and nums2, return -1.

Note that an integer is said to be common to nums1 and nums2 if both arrays have at least one occurrence of that integer.

 

Example 1:

Input: nums1 = [1,2,3], nums2 = [2,4]
Output: 2
Explanation: The smallest element common to both arrays is 2, so we return 2.
Example 2:

Input: nums1 = [1,2,3,6], nums2 = [2,3,4,5]
Output: 2
Explanation: There are two common elements in the array 2 and 3 out of which 2 is the smallest, so 2 is returned.
 

Constraints:

1 <= nums1.length, nums2.length <= 105
1 <= nums1[i], nums2[j] <= 109
Both nums1 and nums2 are sorted in non-decreasing order.

CODE:

class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i=0;
        int j=0;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]<nums2[j]){
                i++;
            }else if(nums1[i]>nums2[j]){
                j++;
            }else{
                return nums1[i];
            }
        }
        return -1;
    }
}

OUTPUT:

Runtime
3
ms
Beats
37.92%

//Aother approach

CODE:

class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        Set<Integer> list = new HashSet<>();
        for(int num:nums1){
            list.add(num);
        }
        List<Integer> res = new ArrayList<>();
        for(int num:nums2){
            if(list.contains(num)){
                res.add(num);
            }
        }
        Collections.sort(res);
        if (res.size()==0) return -1;
        return res.get(0);
    }
}

OUTPUT:

Runtime
19
ms
Beats
6.78%
