Find the left-most digit?

CODE:

import java.util.*;
class LeftMost_Number{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		
		
		while(n>9){
			//int rem = n%10;
			n=n/10;
			}
			System.out.println("The left most digit is "+n);
		}
}
			
OUTPUT:
Enter the number: 54831
The left most digit is 5

Enter the number: 68712
The left most digit is 6
