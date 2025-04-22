You are given an integer n.

Each number from 1 to n is grouped according to the sum of its digits.

Return the number of groups that have the largest size.

 

Example 1:

Input: n = 13
Output: 4
Explanation: There are 9 groups in total, they are grouped according sum of its digits of numbers from 1 to 13:
[1,10], [2,11], [3,12], [4,13], [5], [6], [7], [8], [9].
There are 4 groups with largest size.
Example 2:

Input: n = 2
Output: 2
Explanation: There are 2 groups [1], [2] of size 1.
 

Constraints:

1 <= n <= 104

CODE:

class Solution {
    public int countLargestGroup(int n) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=1;i<=n;i++){
            int sum=0;
            int k = i;
            while(k!=0){
                sum += k%10;
                k /= 10;
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        int max = 0;
        for(int i:map.keySet()){
            if(map.get(i)>max){
                max = map.get(i);
            }
        }
        int count = 0;
        for(int i:map.keySet()){
            if(map.get(i)==max){
                count++;
            }
        }
        return count;
    }
}

OUTPUT:

Runtime
10
ms
Beats
45.79
