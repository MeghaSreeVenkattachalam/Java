Given an m x n matrix, return all elements of the matrix in spiral order.

Example 1:

Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
Output: [1,2,3,6,9,8,7,4,5]
Example 2:

Input: matrix = [[1,2,3,4],[5,6,7,8],[9,10,11,12]]
Output: [1,2,3,4,8,12,11,10,9,5,6,7]
 
Constraints:

m == matrix.length
n == matrix[i].length
1 <= m, n <= 10
-100 <= matrix[i][j] <= 100

CODE:

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        int top = 0;
        int bottom = matrix.length-1;
        int right = matrix[0].length-1;
        int left = 0;
        while(top<=bottom && left<=right){
            //top fixed -- left->right
            for(int i=left;i<=right;i++){
                list.add(matrix[top][i]);
            }
            top++;
            //incrementing the top becoz it will repeat the same value
            //right fixed -- top->bottom
            for(int i=top;i<=bottom;i++){
                list.add(matrix[i][right]);
            }
            right--;
            //as like top
            //bottom fixed -- right->left
            // if condition is because both values should not repeats and extends to the end while spiral
            if(top<=bottom){
                for(int i=right;i>=left;i--){
                    list.add(matrix[bottom][i]);
                }
                bottom--;
            }
            //left fixed -- bottom->top
            if(left<=right){
                for(int i=bottom;i>=top;i--){
                    list.add(matrix[i][left]);
                }
                left++;
            }

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
