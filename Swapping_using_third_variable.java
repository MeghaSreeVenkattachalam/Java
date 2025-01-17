2. Write a java program to get a 2 numbers from the user and swap their values without any loss of data.
You can make use of additional variable for swapping. Print the corresponding swapped values of the two numbers as output in the console.
Input format
First input: an integer
Second input: an integer
Output format
Before Swapping
First input: an integer
Second input: an integer
after Swapping
First input : an integer
second input: an integer

CODE:


import java.util.*;
class Swapping_using_third_variable{
	public static void main(String args[]){
	//scanner
	Scanner scn = new Scanner(System.in);
	//Getting input from the user
	
	System.out.println("Enter the first integer:");
	int a = scn.nextInt();
	System.out.println("Enter the second integer:");
	int b = scn.nextInt();
	
	System.out.println();
	System.out.println("Before Swapping:");
	System.out.println("First Integer:"+a);
	System.out.println("Second Integer:"+b);
	
	int temp = a;
	 a = b;
     b = temp;
	System.out.println();
	System.out.println("After Swapping:");
	System.out.println("First Integer:"+a);
	System.out.println("Second Integer:"+b);
	}
	
}


OUTPUT:

Enter the first integer:
10
Enter the second integer:
20

Before Swapping:
First Integer:10
Second Integer:20

After Swapping:
First Integer:20
Second Integer:10
