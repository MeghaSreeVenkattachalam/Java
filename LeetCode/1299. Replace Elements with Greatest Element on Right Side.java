Given an array arr, replace every element in that array with the greatest element among the elements to its right, and replace the last element with -1.

After doing so, return the array.

 

Example 1:

Input: arr = [17,18,5,4,6,1]
Output: [18,6,6,6,1,-1]
Explanation: 
- index 0 --> the greatest element to the right of index 0 is index 1 (18).
- index 1 --> the greatest element to the right of index 1 is index 4 (6).
- index 2 --> the greatest element to the right of index 2 is index 4 (6).
- index 3 --> the greatest element to the right of index 3 is index 4 (6).
- index 4 --> the greatest element to the right of index 4 is index 5 (1).
- index 5 --> there are no elements to the right of index 5, so we put -1.
Example 2:

Input: arr = [400]
Output: [-1]
Explanation: There are no elements to the right of index 0.
 

Constraints:

1 <= arr.length <= 104
1 <= arr[i] <= 105

CODE:

class Solution {
    public int[] replaceElements(int[] nums) {
        int arr[] = new int[nums.length];
        int max = nums[nums.length-1];
        arr[nums.length-1] = -1;
        for(int i=nums.length-2;i>=0;i--){
            arr[i]=max;
            if(nums[i]>max){
                max = nums[i];
            }
        }
        return arr;
    }
}

OUTPUT:

Runtime
1
ms
Beats
99.96%

//ANOTHER APPROACH

CODE:

class Solution {
    public int[] replaceElements(int[] nums) {
        int arr[] = new int[nums.length];
        for(int i=0;i<nums.length-1;i++){
            int max = Integer.MIN_VALUE;
            for(int j=i+1;j<nums.length;j++){
                if(nums[j]>max){
                    max = nums[j];
                }
            }
            arr[i] = max;
        }
        arr[nums.length-1]=-1;
        return arr;
    }
}

OUTPUT:

Runtime
1416
ms
Beats
5.11
