You are given an m x n binary matrix grid. An island is a group of 1's (representing land) connected 4-directionally (horizontal or vertical.) You may assume all four edges of the grid are surrounded by water.

The area of an island is the number of cells with a value 1 in the island.

Return the maximum area of an island in grid. If there is no island, return 0.

 

Example 1:


Input: grid = [[0,0,1,0,0,0,0,1,0,0,0,0,0],[0,0,0,0,0,0,0,1,1,1,0,0,0],[0,1,1,0,1,0,0,0,0,0,0,0,0],[0,1,0,0,1,1,0,0,1,0,1,0,0],[0,1,0,0,1,1,0,0,1,1,1,0,0],[0,0,0,0,0,0,0,0,0,0,1,0,0],[0,0,0,0,0,0,0,1,1,1,0,0,0],[0,0,0,0,0,0,0,1,1,0,0,0,0]]
Output: 6
Explanation: The answer is not 11, because the island must be connected 4-directionally.
Example 2:

Input: grid = [[0,0,0,0,0,0,0,0]]
Output: 0
 

Constraints:

m == grid.length
n == grid[i].length
1 <= m, n <= 50
grid[i][j] is either 0 or 1.

CODE:

 //USING BFS
 
class Solution {
    private int bfs(int[][] grid, int startRow, int startCol){
        int rows = grid.length;
        int cols = grid[0].length;

        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{startRow,startCol});
        int area = 1;
        grid[startRow][startCol] = 0;

        while(!queue.isEmpty()){
            int[] cell = queue.poll();
            int row = cell[0];
            int col = cell[1];

            //up
            if(row-1>=0 && grid[row-1][col]==1){
                grid[row-1][col]=0;
                queue.add(new int[]{row-1,col});
                area++;
            }

            //down
            if(row+1<rows && grid[row+1][col]==1){
                grid[row+1][col]=0;
                queue.add(new int[]{row+1,col});
                area++;
            }

            //left
            if(col-1>=0 && grid[row][col-1]==1){
                grid[row][col-1]=0;
                queue.add(new int[]{row,col-1});
                area++;
            }

            //right
            if(col+1<cols && grid[row][col+1]==1){
                grid[row][col+1]=0;
                queue.add(new int[]{row,col+1});
                area++;
            }
        }
        return area;
    }
    public int maxAreaOfIsland(int[][] grid) {
        if(grid==null || grid.length==0){
            return 0;
        }
        int maxArea = 0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                if(grid[i][j]==1){
                    int area = bfs(grid,i,j);
                    maxArea = Math.max(area,maxArea);
                }
            }
        }
        return maxArea;
    }
}

OUTPUT:

Runtime
3
ms
Beats
29.94%


//USING DFS

 class Solution {
    private int dfs(int[][] grid, int row, int col){
        if(row<0 || row>=grid.length || col<0 || col>=grid[0].length || grid[row][col]==0){
            return 0;
        }
        grid[row][col]=0;
        int area = 1;
        //up
        area+=dfs(grid,row-1,col);
        //down 
        area+=dfs(grid,row+1,col);
        //left
        area+=dfs(grid,row,col-1);
        //right
        area+=dfs(grid,row,col+1);
        
        return area;
    }
    public int maxAreaOfIsland(int[][] grid) {
        if(grid==null || grid.length==0){
            return 0;
        }

        int max = 0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                if(grid[i][j]==1){
                    int area = dfs(grid,i,j);
                    max = Math.max(area,max);
                }
            }
        }
        return max;
    }
}

OUTPUT:

Runtime
1
ms
Beats
100.00%
