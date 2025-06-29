Given an array nums of distinct integers, return all the possible permutations. You can return the answer in any order.

 

Example 1:

Input: nums = [1,2,3]
Output: [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
Example 2:

Input: nums = [0,1]
Output: [[0,1],[1,0]]
Example 3:

Input: nums = [1]
Output: [[1]]
 

Constraints:

1 <= nums.length <= 6
-10 <= nums[i] <= 10
All the integers of nums are unique.

CODE:

class Solution {
    public static void permutate(int[] arr,int fi,List<List<Integer>> list){
        if(fi==arr.length-1){
            List<Integer> curr = new ArrayList<>();
            for(int i:arr){
                curr.add(i);
            }
            list.add(curr);
            return;
        }
        for(int i=fi;i<arr.length;i++){
            swap(arr,i,fi);
            permutate(arr,fi+1,list);
            swap(arr,i,fi);
        }
    }
    public static void swap(int[]arr, int i, int fi){
        int temp = arr[i];
        arr[i] = arr[fi];
        arr[fi] = temp;
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        permutate(nums, 0,list);
        return list;
    }
}

OUTPUT:

Runtime
1
ms
Beats
93.14%
