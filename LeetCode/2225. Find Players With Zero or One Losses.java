You are given an integer array matches where matches[i] = [winneri, loseri] indicates that the player winneri defeated player loseri in a match.

Return a list answer of size 2 where:

answer[0] is a list of all players that have not lost any matches.
answer[1] is a list of all players that have lost exactly one match.
The values in the two lists should be returned in increasing order.

Note:

You should only consider the players that have played at least one match.
The testcases will be generated such that no two matches will have the same outcome.
 

Example 1:

Input: matches = [[1,3],[2,3],[3,6],[5,6],[5,7],[4,5],[4,8],[4,9],[10,4],[10,9]]
Output: [[1,2,10],[4,5,7,8]]
Explanation:
Players 1, 2, and 10 have not lost any matches.
Players 4, 5, 7, and 8 each have lost one match.
Players 3, 6, and 9 each have lost two matches.
Thus, answer[0] = [1,2,10] and answer[1] = [4,5,7,8].
Example 2:

Input: matches = [[2,3],[1,3],[5,4],[6,4]]
Output: [[1,2,5,6],[]]
Explanation:
Players 1, 2, 5, and 6 have not lost any matches.
Players 3 and 4 each have lost two matches.
Thus, answer[0] = [1,2,5,6] and answer[1] = [].
 

Constraints:

1 <= matches.length <= 105
matches[i].length == 2
1 <= winneri, loseri <= 105
winneri != loseri
All matches[i] are unique.


CODE:

class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        int win[] = new int[100001];
        int lose[] = new int[100001];
        List<List<Integer>> list = new ArrayList<>();
        int k=0;
        for(int i=0;i<matches.length;i++){
        //we are not adding the values to the win array we are just counting their values
        //because by counting how many times a team wins is like a index based
        //By using index we are just incrementing their counts in the win array or lose both array doing the same thing
            win[matches[i][0]]++;
            lose[matches[i][1]]++;
        }
        List<Integer> winned = new ArrayList<>();
        List<Integer> lossed = new ArrayList<>();
        for(int i=0;i<win.length;i++){
            if(win[i]>=1 && lose[i]==0) winned.add(i); //here why becoz we are just giving i means becoz in that 
            //we have counted their wins or loses but we need the data of who win or who lose not their count that's the reason behind this.
            if(lose[i]==1) lossed.add(i);
        }
        list.add(winned);
        list.add(lossed);
        return list;
    }
}

OUTPUT:

Runtime
28
ms
Beats
97.18%
