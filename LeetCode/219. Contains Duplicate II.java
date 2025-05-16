Given an integer array nums and an integer k, return true if there are two distinct indices i and j in the array such that nums[i] == nums[j] and abs(i - j) <= k.

 

Example 1:

Input: nums = [1,2,3,1], k = 3
Output: true
Example 2:

Input: nums = [1,0,1,1], k = 1
Output: true
Example 3:

Input: nums = [1,2,3,1,2,3], k = 2
Output: false
 

Constraints:

1 <= nums.length <= 105
-109 <= nums[i] <= 109
0 <= k <= 105

CODE:

import java.util.HashSet;

class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashSet<Integer> window = new HashSet<>();
        int i = 0;

        for (int j = 0; j < nums.length; j++) {
            if (window.contains(nums[j])) {
                return true; // duplicate found in window
            }

            window.add(nums[j]);

            // Keep window size <= k
            if (window.size() > k) {
                window.remove(nums[i]);
                i++;
            }
        }

        return false; // no duplicates within distance k
    }
}


OUTPUT:

Runtime
25
ms
Beats
22.57%  
