Reverse a string 

CODE:

import java.util.*;
class Reversing_String{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string input: ");
		String str = sc.nextLine();
		System.out.print("The reverse of the string is ");
		for(int i=str.length()-1;i>=0;i--){
			System.out.print(str.charAt(i));
		}
	}
}


OUTPUT:
Enter the string input: Apple is a healthy fruit
The reverse of the string is tiurf yhtlaeh a si elppA
