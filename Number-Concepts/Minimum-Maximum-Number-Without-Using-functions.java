Finding maximum and minimum numbers without using any loops,recursions,if-else,ternary operators and math functions?

CODE:

import java.util.*;
class Minimum_Maximum_Numbers{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first number: ");
		int num1 = sc.nextInt();
		System.out.println("Enter the second number: ");
		int num2 = sc.nextInt();
		
		//To find the maximum number
		int max = ((num1+num2)+Math.abs(num1-num2))/2;
		//To find the minimum number
		int min = ((num1+num2)-Math.abs(num1-num2))/2;
		
		System.out.println("The Maximum number is "+max);
		System.out.println("The Minimum number is "+min);
	}
}


OUTPUT:
Enter the first number:
123
Enter the second number:
75
The Maximum number is 123
The Minimum number is 75
