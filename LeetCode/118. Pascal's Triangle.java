Given an integer numRows, return the first numRows of Pascal's triangle.

In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:


 

Example 1:

Input: numRows = 5
Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
Example 2:

Input: numRows = 1
Output: [[1]]
 

Constraints:

1 <= numRows <= 30

CODE:

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        for(int i=0;i<numRows;i++){
            List<Integer> row = new ArrayList<>();
            long num = 1;
            row.add((int)num);
            for(int j=1;j<=i;j++){
                num = num*(i-j+1)/j;
                row.add((int)num);
            }
            list.add(row);
        }
        return list;
    }
}

OUTPUT:

Runtime
0
ms
Beats
100.00%
