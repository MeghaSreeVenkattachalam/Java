Swapping two numbers using Bitwise operators

import java.util.*;
class Swap_Using_Bitwise{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		//this is only working for 5 and 7
		/*
		int a1=a|b;
		int b1=a&b;
		*/
		
		a=a^b;
		b=a^b;
		a=a^b;
		System.out.println(a);
		System.out.println(b);
	}
}

