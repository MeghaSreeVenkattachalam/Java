Given an array arr of positive integers sorted in a strictly increasing order, and an integer k.

Return the kth positive integer that is missing from this array.

 

Example 1:

Input: arr = [2,3,4,7,11], k = 5
Output: 9
Explanation: The missing positive integers are [1,5,6,8,9,10,12,13,...]. The 5th missing positive integer is 9.
Example 2:

Input: arr = [1,2,3,4], k = 2
Output: 6
Explanation: The missing positive integers are [5,6,7,...]. The 2nd missing positive integer is 6.
 

Constraints:

1 <= arr.length <= 1000
1 <= arr[i] <= 1000
1 <= k <= 1000
arr[i] < arr[j] for 1 <= i < j <= arr.length

CODE:

class Solution {
    public int findKthPositive(int[] arr, int k) {
        int missing = 0;
        int val = 1;
        int index = 0;
        while(missing<k){
            if(index>=0 && index<arr.length && arr[index]==val){
                index++;
            }else{
                missing++;
                if(missing==k){
                    return val;
                }
            }
            val++;
        }
        return -1;
    }
}

OUTPUT:

Runtime
1
ms
Beats
22.97%
