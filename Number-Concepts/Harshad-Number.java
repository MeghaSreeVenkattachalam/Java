Check whether the number is the Harshad Number or not?
A Harshad Number (or Niven Number) is a number that is divisible by the sum of its digits.

CODE:

import java.util.*;
class Harshad_Number{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		int temp = n;
		int sum=0;
		
		while(temp>0){
			int last_digit = temp%10;
			sum=sum+last_digit;
			temp=temp/10;
		}
		if(n%sum == 0){
			System.out.printf("%d is the Harshad Number",n);
		}
		else{
			System.out.printf("%d is not the Harshad Number",n);
		}
	}
}
			
OUTPUT:
Enter the number:
21
21 is the Harshad Number

Enter the number:
23
23 is not the Harshad Number
