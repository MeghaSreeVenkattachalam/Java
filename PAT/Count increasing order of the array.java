Problem Statement
Given an integer array Arr of size N the task is to find the count of elements whose value is greater than all of its prior elements.
Note: 1st element of the array should be considered in the count of the result.

Example 1:
Input:
4
2 4 5 6
Output: 4
Explanation:
Since the array is in increasing order, all the array elements satisfy the condition.
Hence, the count of such elements is equal to the size of the array, i.e. equal to 4.

Example 2:
Input 
5
3 4 5 8 9
Output 
5

Explanation:
For the provided input array [3, 4, 5, 8, 9], the output will be 5 because:
3 is greater than all elements before it.
4 is greater than 3.
5 is greater than 4.
8 is greater than 5.
9 is greater than 8.
So, there are 5 elements in the array which are strictly greater than all elements before them. Hence, the output is 5.

Input format :
The first line of input consists of an integer N, which represents the size of the array Arr.
The second line of input consists of N space-separated integers representing the elements of the array Arr.

Output format :
The output represents a single integer which indicates the count of elements meeting the condition of being greater than all of their prior elements.
Refer to the sample output for formatting specifications.

Code constraints :
3 ≤ N ≤ 20.

1 ≤ Arr[i] ≤ 1000.

Sample test cases :
Input 1 :
4
2 4 5 6
Output 1 :
4
Input 2 :
5
3 4 5 8 9
Output 2 :
5
Input 3 :
4
5 6 1 8
Output 3 :
3


import java.util.*;
class Count_Array_Increasing_Order{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		
		int max = Integer.MIN_VALUE;
		int count = 0;
		for(int i=0;i<n;i++){
			if(arr[i]>max){
				max = arr[i];
				count++;
			}
		}
		System.out.print(count);
	}
}
