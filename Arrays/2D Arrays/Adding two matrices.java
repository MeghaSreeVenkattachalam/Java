Write a program to add two matrices.

Input format :
Input to get the number of rows and columns separated by a single space, followed by values of the r*c matrix in next n lines.

Output format :
The output prints the resultant matrix after addition.

Code constraints :
The values must be of integer type only.

Sample test cases :
Input 1 :
3 3
5 6 7
7 8 9
9 7 8
1 0 1
1 1 1
0 0 0
Output 1 :
6 6 8 
8 9 10 
9 7 8 
Input 2 :
2 2
5 -9
8 2
4 -2
-1 3
Output 2 :
9 -11 
7 5 

CODE:

import java.util.*;
class Solution{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int arr[][] = new int[row][col];
        int arr2[][] = new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr2[i][j] = sc.nextInt();
            }
        }
        
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(arr[i][j]+arr2[i][j]+" ");
            }
            System.out.println();
        }
    }
}
