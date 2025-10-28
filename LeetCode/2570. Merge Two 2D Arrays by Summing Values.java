You are given two 2D integer arrays nums1 and nums2.

nums1[i] = [idi, vali] indicate that the number with the id idi has a value equal to vali.
nums2[i] = [idi, vali] indicate that the number with the id idi has a value equal to vali.
Each array contains unique ids and is sorted in ascending order by id.

Merge the two arrays into one array that is sorted in ascending order by id, respecting the following conditions:

Only ids that appear in at least one of the two arrays should be included in the resulting array.
Each id should be included only once and its value should be the sum of the values of this id in the two arrays. If the id does not exist in one of the two arrays, then assume its value in that array to be 0.
Return the resulting array. The returned array must be sorted in ascending order by id.

 

Example 1:

Input: nums1 = [[1,2],[2,3],[4,5]], nums2 = [[1,4],[3,2],[4,1]]
Output: [[1,6],[2,3],[3,2],[4,6]]
Explanation: The resulting array contains the following:
- id = 1, the value of this id is 2 + 4 = 6.
- id = 2, the value of this id is 3.
- id = 3, the value of this id is 2.
- id = 4, the value of this id is 5 + 1 = 6.
Example 2:

Input: nums1 = [[2,4],[3,6],[5,5]], nums2 = [[1,3],[4,3]]
Output: [[1,3],[2,4],[3,6],[4,3],[5,5]]
Explanation: There are no common ids, so we just include each id with its value in the resulting list.
 

Constraints:

1 <= nums1.length, nums2.length <= 200
nums1[i].length == nums2[j].length == 2
1 <= idi, vali <= 1000
Both arrays contain unique ids.
Both arrays are in strictly ascending order by id.

CODE:

class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        List<List<Integer>> list = new ArrayList<>();

        // Step 1: Handle all keys in nums1
        for (int[] i : nums1) {
            int k1 = i[0];
            int v1 = i[1];
            int val = v1;  // default value
            boolean found = false;

            for (int[] j : nums2) {
                if (k1 == j[0]) {         // found common key
                    val += j[1];          // sum the values
                    found = true;
                    break;                // optimization: stop checking once found
                }
            }

            list.add(Arrays.asList(k1, val)); // add whether found or not
        }

        // Step 2: Add keys from nums2 that are not in nums1
        for (int[] j : nums2) {
            int k2 = j[0];
            int v2 = j[1];
            boolean found = false;

            for (int[] i : nums1) {
                if (k2 == i[0]) {
                    found = true;
                    break; // optimization: break early
                }
            }

            if (!found) {
                list.add(Arrays.asList(k2, v2));
            }
        }

        // Step 3: Sort by key (first element)
        list.sort((a, b) -> a.get(0) - b.get(0));

        // Step 4: Convert list -> 2D array
        int[][] res = new int[list.size()][2];
        for (int i = 0; i < list.size(); i++) {
            res[i][0] = list.get(i).get(0);
            res[i][1] = list.get(i).get(1);
        }

        return res;
    }
}

OUTPUT:

Runtime
4
ms
Beats
29.49%
