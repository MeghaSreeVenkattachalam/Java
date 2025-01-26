Sorting an array using built-in methods.

CODE:

import java.util.*;
class Sorting_Using_Function{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int n = sc.nextInt();
		System.out.print("Enter the array values: ");
		int arr[] = new int[n];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		System.out.print("The sorted array is: ");
		for(int i=0;i<n;i++){
			System.out.print(arr[i]+" ");
		}
	}
}

OUTPUT:
Enter the size of the array: 5
Enter the array values: 54 12 66 78 32
The sorted array is: 12 32 54 66 78
