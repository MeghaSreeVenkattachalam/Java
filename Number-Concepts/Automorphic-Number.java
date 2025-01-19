Check whether the number is an Automorphic number or not?
An Automorphic Number is a number whose square ends with the same digits as the number itself.

CODE:

import java.util.*;
class Automorphic{
public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number: ");
	int num = sc.nextInt();
	int temp = num;
	int sq = num*num;
	
	while(num>0){
		if(num%10 != sq%10)
		{
			System.out.printf("%d is Not an Automorphic Number",num);
			break;
		}
		num=num/10;
		sq= sq/10;
	}
	if(num==0)
	{
		System.out.printf("%d is an Automorphic Number",temp);
	}
}
}


OUTPUT:
Enter the number:
5
5 is an Automorphic Number

Enter the number:
34
34 is Not an Automorphic Number

Enter the number:
25
25 is Not an Automorphic Number
