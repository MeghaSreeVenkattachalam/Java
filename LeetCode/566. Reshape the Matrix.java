In MATLAB, there is a handy function called reshape which can reshape an m x n matrix into a new one with a different size r x c keeping its original data.
You are given an m x n matrix mat and two integers r and c representing the number of rows and the number of columns of the wanted reshaped matrix.
The reshaped matrix should be filled with all the elements of the original matrix in the same row-traversing order as they were.
If the reshape operation with given parameters is possible and legal, output the new reshaped matrix; Otherwise, output the original matrix.

Example 1:
Input: mat = [[1,2],[3,4]], r = 1, c = 4
Output: [[1,2,3,4]]
Example 2:
Input: mat = [[1,2],[3,4]], r = 2, c = 4
Output: [[1,2],[3,4]]

Constraints:
m == mat.length
n == mat[i].length
1 <= m, n <= 100
-1000 <= mat[i][j] <= 1000
1 <= r, c <= 300

CODE:

class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        //they where given the row and column values for the new array.
        int n = r*c; //calculate number of elements int the new array.
        if(mat.length*mat[0].length!=n) return mat; //if number of elements equal not equal means then we can't process
        int new_arr[][] = new int[r][c];
            int a = 0;
            int b = 0;
            int index = 0;
            for(int i=0;i<mat.length;i++){
                for(int j=0;j<mat[i].length;j++){
                    /*if(b==c){
                        b=0;
                        a++;
                    }
                    new_arr[a][b] = mat[i][j]; //arr
                    b++;*/
                    new_arr[index/c][index%c] = mat[i][j];//check hint-4 i=index, n=c
                    index++;
                }
            }
        return new_arr;
    }
}

OUTPUT:

Runtime
0
ms
Beats
100.00%
