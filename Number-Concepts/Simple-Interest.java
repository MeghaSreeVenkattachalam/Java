Sara wished to build a new house but she didn't have a sufficient amount. So, she planning to borrow some money from the bank on simple interest. When she is borrowing some money from the bank, she has to pay back the original amount accompanied by certain amount of interest on the that amount. she wants to find the interest for borrowed money within a certain period. help her to find the simple interest.
Input format:
The first line containing an integer value denoting the borrowed amount(principal amount)
The second line containing an integer value denoting the period in years
The third line containing an float value denoting the rate of interest
Output format:
Print the simple interest in float with 2 decimal places.
  
CODE:

import java.util.*;
class Sara_simple_interest{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Principal amount: ");
		int principal_amt = sc.nextInt();
		System.out.print("Enter the number of years: ");
		int no_of_year = sc.nextInt();
		System.out.print("Enter the rate of interest: ");
		float rate_of_interest = sc.nextFloat();
		
		double result = (principal_amt * no_of_year * rate_of_interest)/100;
		System.out.printf("The Simple Interest is %.2f",result);
	}
}

OUTPUT:

Enter the Principal amount: 120000
Enter the number of years: 5
Enter the rate of interest: 3
The Simple Interest is 18000.00
