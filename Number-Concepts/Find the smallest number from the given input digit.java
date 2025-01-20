Find the smallest number from the given input digit?

CODE:

import java.util.*;
class Smallest_Number{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		int min = 9;
		
		while(n>0){
			int rem = n%10;
			min = Math.min(rem,min);
			n=n/10;
		}
		System.out.println("The Smallest Number is "+min);
	}
}

OUTPUT:
Enter the number:
6987798
The Smallest Number is 6

Enter the number:
34783
The Smallest Number is 3
