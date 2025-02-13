Sum of the digits using Recursion

CODE:

import java.util.*;
class Sum_Of_Digits{
	
	 static int sum(int n){
		if(n==0){
			return 0;
		}
		
		return n%10+sum(n/10);
	 }
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		System.out.println(sum(n));
	}
}

OUTPUT:

123
6

55
10
