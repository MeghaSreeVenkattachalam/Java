3. Write a Java program to swap two values without using the third variable.

Input format:
First input: an integer
Second input: an integer

Output Format:
Before Swapping
First input: an integer
Second input: an integer
After Swapping
First input : an integer
second input: an integer

CODE:

import java.util.*;
class Swapping_without_using_third_variable{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first integer: ");
		int a = sc.nextInt();
		System.out.println("Enter the Second integer: ");
		int b = sc.nextInt();
		System.out.println();
		//Before Swapping 
		System.out.println("Before Swapping: ");
		System.out.println("First Integer: "+a);
		System.out.println("Second Integer: "+b);
		System.out.println();
		//swapping without using third varible
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		//After Swapping
		System.out.println("After Swapping: ");
		System.out.println("First Integer: "+a);
		System.out.println("Second Integer: "+b);
	}
}

OUTPUT:

Enter the first integer:
45
Enter the Second integer:
56

Before Swapping:
First Integer: 45
Second Integer: 56

After Swapping:
First Integer: 56
Second Integer: 45
