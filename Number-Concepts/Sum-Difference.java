Write a Java program to get 2 numbers from the user and calculate their sum and difference using '+' and '-' operators respectively. Print the corresponding sum and difference of the numbers as output in the console.
Input Format:
Fist input: an integer
Second input: an integer
Output Format:
First output will be the sum of two integers
Second output will be the difference of two integers

CODE:

import java.util.*;
class Sum_Difference{
	public static void main(String args[]){
		Scanner scn = new Scanner(System.in);
		int var1 = scn.nextInt();
		int var2 = scn.nextInt();
		int Sum = var1+var2;
		int Difference = var1-var2;
		System.out.println("First input:" +Sum);
		System.out.println("Second input:" +Math.abs(Difference));
	}
}

OUTPUT:

First input:
1
Second input:
54
Sum of two integer: 55
Difference of two integer: 53
