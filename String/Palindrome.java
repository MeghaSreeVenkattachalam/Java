Palindrome or not?

import java.util.*;
class Palindrome{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		if(str.equals(new StringBuilder(str).reverse().toString())){
			System.out.print("Palindrome");
		}else{
			System.out.print("Not a Palindrome");
		}
	}
}
