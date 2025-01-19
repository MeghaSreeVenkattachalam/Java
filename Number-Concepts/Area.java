Sheela has three things in her bag. She wants to compute the area of 3 things but the 3 things are in different shapes. The three things are in a square shape, rectangular shape, and circular shape respectively. Write a program to help Sheela to calculate the area of the different shapes.
Input Format:
First input: a side of a square in integer
Second input: length of a rectangle in integer
Third input: breadth of a rectangle in integer
Fourth input: radius of a circle in float
Output Format: 
Forth variable with 2decimal values

CODE:

import java.util.*;
class Sheela_area_program{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the side of a square:");
		int side = sc.nextInt();
		System.out.println("Enter the length of a rectangle:");
		int length = sc.nextInt();
		System.out.println("Enter the breadth of a rectangle:");
		int breadth = sc.nextInt();
		System.out.println("Enter the radius of a circle:");
		float radius = sc.nextFloat();
		
		int square = side*side;
		int rectangle = length*breadth;
		double circle = 3.14*radius*radius;
		
		System.out.println("Area of a square:" +square);
		System.out.println("Area of a rectangle:" +rectangle);
		System.out.printf("Area of a circle: %.2f" ,circle);
	}
}

OUTPUT:

Enter the side of a square:
4
Enter the length of a rectangle:
5
Enter the breadth of a rectangle:
6
Enter the radius of a circle:
2
Area of a square:16
Area of a rectangle:30
Area of a circle: 12.56
