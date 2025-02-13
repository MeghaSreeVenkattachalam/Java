Decimal to Binary using Recursion

CODE:

import java.util.*;
class Decimal_To_Binary{
	public static String Binary(int num,String bin){
		if(num==0){
			return bin;
		}
		bin = num%2+bin;
		return Binary(num/2,bin);
	}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String bin ="";
		System.out.println(Binary(n,bin));
	}
}

OUTPUT:

10
1010

16
10000
