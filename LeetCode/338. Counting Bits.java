Given an integer n, return an array ans of length n + 1 such that for each i (0 <= i <= n), ans[i] is the number of 1's in the binary representation of i.

 

Example 1:

Input: n = 2
Output: [0,1,1]
Explanation:
0 --> 0
1 --> 1
2 --> 10
Example 2:

Input: n = 5
Output: [0,1,1,2,1,2]
Explanation:
0 --> 0
1 --> 1
2 --> 10
3 --> 11
4 --> 100
5 --> 101
 

Constraints:

0 <= n <= 105

CODE:

class Solution {
    public int[] countBits(int n) {
        int arr[] = new int[n+1];
        for(int i=0;i<=n;i++){
            String binary = Integer.toBinaryString(i);
            int count = 0;
            for(char ch:binary.toCharArray()){
                if(ch=='1'){
                    count++;
                }else{
                    continue;
                }
            }
            arr[i] = count;
        }
        return arr;
    }
}

OUTPUT:

Runtime
8
ms
Beats
14.09%
