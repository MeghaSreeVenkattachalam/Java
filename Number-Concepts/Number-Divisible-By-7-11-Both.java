Check if a number is divisible by 7,11 or both?

CODE:

import java.util.*;
class Divisible_by_7_11{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		if(num%7==0 && num%11==0){
			System.out.printf("%d is divisible by both 7 and 11",num);
		}
		else if(num%7==0){
			System.out.printf("%d is only divisible by 7",num);
		}
		else if(num%11==0){
			System.out.printf("%d is only divisible by 11",num);
		}
		else{
			System.out.printf("%d is not divisible by both 7 and 11",num);
		}
	}
}


OUTPUT:
Enter the number:
77
77 is divisible by both 7 and 11

Enter the number:
563
563 is not divisible by both 7 and 11

Enter the number:
11
11 is only divisible by 11
