Check whether the given input is Friendly Pair or not?
A pair of two numbers is called a Friendly Pair if the ratio of the sum of divisors of each number to the number itself is the same for both numbers.

CODE:

import java.util.*;
class Friendly_pair{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first element: ");
		int n1 = sc.nextInt();
		System.out.println("Enter the second element: ");
		int n2 = sc.nextInt();
		int temp1 = n1;
		int temp2 = n2;
		int sum1=0;
		int sum2 = 0;
		
		for(int i=1; i<temp1; i++){
			if(temp1%i == 0){
				sum1 = sum1+i;
			}
		}
		
		for(int i=1; i<temp2; i++){
			if(temp2%i == 0){
				sum2 = sum2+i;
			}
		}
		
		if(sum1/n1 == sum2/n2){
			System.out.printf("%d and %d are Friendly pair.",n1,n2);
		}
		else{
			System.out.printf("%d and %d are not a Friendly pair.",n1,n2);
		}
	}
}


OUTPUT:		
Enter the first element:
6
Enter the second element:
28
6 and 28 are Friendly pair.

Enter the first element:
54
Enter the second element:
68
54 and 68 are not a Friendly pair.
