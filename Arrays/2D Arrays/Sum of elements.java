//Sum of the elements in the 2D array.

import java.util.*;
class Sum{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows: ");
		int row = sc.nextInt();
		int arr[][] = new int[row][];
		int sum = 0;
		for(int i=0;i<row;i++){
			
			System.out.println("Enter the number of columns: ");
			int col = sc.nextInt();
			arr[i] = new int[col];
			
			for(int j=0;j<col;j++){
				arr[i][j] = sc.nextInt();
				sum += arr[i][j];
			}
		}
		
		System.out.println("The Sum of array elements is "+sum);
	}
}
