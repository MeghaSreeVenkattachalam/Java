To find whether the given input is a digit or not?

CODE:

import java.util.*;
class Digit_Or_Not{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the digit: ");
		char ch = sc.next().charAt(0);
		//To find whether the given input is a digit or not
		//The input must be numbers from 0 - 9
		if(ch>=48 && ch<=57){
			System.out.printf("%s is a digit",ch);
		}
		else{
			System.out.printf("%s is not a digit",ch);
		}
	}
}


OUTPUT:
Enter the digit:
9
9 is a digit

Enter the digit:
23
2 is a digit

Enter the digit:
-
- is not a digit

