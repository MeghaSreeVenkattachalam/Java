Problem Statement:
Ravi wants to find the number of odd elements and even elements in an array. Help him to find the same. Write a program to find the number of odd and even elements in an array.

Input format :
The first line of the input consists of the size of array 'n' as an integer value.
The next line of input consists of the array of n elements separated by a space 'e'.

Output format :
The output should display the number of even and odd numbers as

Number of even numbers : <<even>>
Number of odd numbers : <<odd>>
Refer to the sample output for the formatting specifications

Code constraints :
In this scenario, the test cases fall under the following constraints:
1 ≤ n ≤ 20
0 ≤ e ≤ 100

Sample test cases :
Input 1 :
5
23 68 45 92 71
Output 1 :
Number of even numbers : 2
Number of odd numbers : 3

CODE:

import java.util.*;
class No_of_Even_Odd{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array: ");
		int n = sc.nextInt();
		System.out.print("Enter array values: ");
		int arr[] = new int[n];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		
		int odd=0;
		int even=0;
		for(int i=0;i<n;i++){
			if(arr[i]%2==0){
				even++;
			}else{
				odd++;
			}
		}
		System.out.println("Number of even numbers: "+even);
		System.out.println("Number of odd numbers: "+odd);
	}
}

OUTPUT:
Enter size of array:
5
Enter array values: 1 2 3 4 5
Number of even numbers: 2
Number of odd numbers: 3
