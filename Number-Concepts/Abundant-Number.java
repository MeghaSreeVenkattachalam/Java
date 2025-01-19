Check whether the number is an Abundant Number or not?
An Abundant Number is a number for which the sum of its proper divisors (excluding the number itself) is greater than the number.

CODE:

import java.util.*;
class Abundant_Number{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		int temp = num;
		int sum=0;
		
		for(int i=1; i<temp; i++){
			if(temp%i == 0){
				sum = sum+i;
			}
		}
		
		if(sum>num){
			System.out.printf("%d is an Abundant Number",num);
		}
		else{
			System.out.printf("%d is not an Abundant Number",num);
		}
	}
}


OUTPUT:
Enter the number:
12
12 is an Abundant Number

Enter the number:
8
8 is Not an Abundant Number
