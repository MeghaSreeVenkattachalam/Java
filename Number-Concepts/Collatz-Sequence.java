Print the Collatz_Sequence
The Collatz sequence (also known as the 3n + 1 conjecture) is a sequence of numbers defined as follows:

Start with any positive integer n.
If n is even, divide it by 2 to get n/2.
If n is odd, multiply it by 3 and add 1 to get 3n+1.
Repeat the process with the new value of n.
The conjecture suggests that no matter what value of n you start with, the sequence will eventually reach 1.


CODE:

import java.util.*;
class Collatz_Sequence{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		
		System.out.print(n);
		do{
		
			
			if(n%2 == 0){
				n=n/2;
				System.out.print(" ->"+n);
				
							}
			else{
				n = 3*n + 1;
				System.out.print(" ->"+n);
				
				
			}
			
			
		}while(n!=1);
		
		
		
		/** System.out.print(n);
		while(n!=1){
			
			if(n%2 == 0){
				n=n/2;
				System.out.print(" ->"+n);
				
							}
			else{
				n = 3*n + 1;
				System.out.print(" ->"+n);
				
				
			}
			
			
		} */
	}
}


OUTPUT:
Enter the number:
643
643 ->1930 ->965 ->2896 ->1448 ->724 ->362 ->181 ->544 ->272 ->136 ->68 ->34 ->17 ->52 ->26 ->13 ->40 ->20 ->10 ->5 ->16 ->8 ->4 ->2 ->1

Enter the number:
8
8 ->4 ->2 ->1
