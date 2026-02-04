You are given an integer array deck where deck[i] represents the number written on the ith card.

Partition the cards into one or more groups such that:

Each group has exactly x cards where x > 1, and
All the cards in one group have the same integer written on them.
Return true if such partition is possible, or false otherwise.

 

Example 1:

Input: deck = [1,2,3,4,4,3,2,1]
Output: true
Explanation: Possible partition [1,1],[2,2],[3,3],[4,4].
Example 2:

Input: deck = [1,1,1,2,2,2,3,3]
Output: false
Explanation: No possible partition.
 

Constraints:

1 <= deck.length <= 104
0 <= deck[i] < 104
 


CODE:

class Solution {
    public static int gcd(int a,int b){
        if(b==0){
            return a;
        }
        return gcd(b,a%b);
    }
    public boolean hasGroupsSizeX(int[] deck) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i:deck){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int count = 0;

        for(int val: map.values()){
            count = gcd(count,val);
        }
        return count>=2;
    }
}

OUTPUT:

Runtime
11
ms
Beats
65.81%
