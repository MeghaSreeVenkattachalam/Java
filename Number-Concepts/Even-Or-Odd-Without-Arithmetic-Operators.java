Find whether the number is an Even or Odd without using arithmetic operators?

CODE:

import java.util.*;
class Even_Odd_Without_Arithmetic_Operators{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		
		if((num&1)==0){
			System.out.printf("%d is an Even number",num);
		}
		else{
			System.out.printf("%d is a Odd number",num);
		}
	}
}

OUTPUT:
Enter the number:
50
50 is an Even number

Enter the number:
121
121 is a Odd number
