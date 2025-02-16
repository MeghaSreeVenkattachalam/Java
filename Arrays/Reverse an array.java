Reverse an Array

CODE:

import java.util.*;
class Reverse_Array{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter the size: ");
		int n = sc.nextInt();
		
		System.out.println("Enter the array values: ");
		int arr[] = new int[n];
		for(int i=0;i<n;i++){
			arr[i] = sc.nextInt();
		}
		System.out.println("The Reverse array is ");
		//Reversing an array
		for(int i=n-1;i>=0;i--){
			System.out.print(arr[i]+" ");
		}
	}
}


OUTPUT:
Enter the size:
4
Enter the array values:
1 2 3 4
The Reverse array is
4 3 2 1

Reversing an array in the same can also look at this:

public static void reverseArray(int arr[]) {
       int left = 0;
       int right = arr.length-1;
       while(left<right){
           int temp = arr[left];
           arr[left] = arr[right];
           arr[right] = temp;
           
           left++;
           right--;
       }
    }
