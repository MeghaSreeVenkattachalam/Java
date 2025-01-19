Check whether the number is an Armstrong number or not?
An Armstrong Number (also known as a Narcissistic Number, Pluperfect Digital Invariant, or PPP Number) is a number where the sum of its digits raised to the power of the total number of digits equals the number itself.

CODE:

import java.util.*;
class Armstrong_no{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		int sum = 0;
		int count = 0;
		int temp = num;
		int a = num;
		
		//Finding no. of digits
		while(temp>0){
			temp = temp/10;
			count++;
		}
		
		/* count number of digits using for loop
		for(int i=num;i>0;i=i/10){
			count++;
		}
		*/
		
		while(a>0){
			int last_digit = a%10;
			int digit_pow = (int)Math.pow(last_digit,count);
			
			sum = sum+digit_pow;
			
			a = a/10;
			
		}
		 
		if(sum == num){
		System.out.printf("%d is an Armstrong number ",num);
		}
		else{
		System.out.printf("%d is not an Armstrong number",num);
		}
	}
}
		

OUTPUT:
Enter the number:
153
153 is an Armstrong number

Enter the number:
5465
5465 is not an Armstrong number
