Problem Statement:
Given an array of integers, write a program to insert an element X at index K.

Input format :
The first line represents the number of elements in the array.

The second line represents the elements in the array.

The third line represents element X to be inserted.

The fourth line represents the index K, where the element is to be inserted.

Output format :
The output prints the array after insertion.
Refer to the sample input and output for formatting specifications.

Sample test cases :
Input 1 :
5
10 20 30 40 50
15
1
Output 1 :
10 15 20 30 40 50 
Input 2 :
10
12 95 43 99 58 28 20 97 37 19
5
3
Output 2 :
12 95 43 5 99 58 28 20 97 37 19 

CODE:

import java.util.*;
class Insert_Element{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of the array: ");
		int n = sc.nextInt();
		System.out.print("Enter array values: ");
		int arr[] = new int[n];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the element to be insert: ");
		int element = sc.nextInt();
		System.out.println("Enter the index of the element: ");
		int index = sc.nextInt();
		
		for(int i=0;i<n;i++){
			if(i!=index){
				System.out.print(arr[i]+" ");
			}
			else{
				System.out.print(element+" ");
				System.out.print(arr[i]+" ");
			}
		}
	}
}

OUTPUT:
Enter size of the array:
5
Enter array values: 1 2 3 5 6
Enter the element to be insert:
4
Enter the index of the element:
3
1 2 3 4 5 6
