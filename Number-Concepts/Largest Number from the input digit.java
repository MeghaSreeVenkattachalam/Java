Find the Largest number from the given input digit?

CODE:

import java.util.*;
class Largest_Number{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		int max = 0;
		
		while(n>0){
			int rem = n%10;
			max = Math.max(rem,max);
			n=n/10;
		}
		System.out.println("The Largest Number is "+max);
	}
}


OUTPUT:
Enter the number:
6987798
The Largest Number is 9

Enter the number:
34783
The Largest Number is 8
