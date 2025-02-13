Reverse an integer using recursion

import java.util.*;
class Reverse_Integer_Recursion{
	
	 static int reverse(int n,int sum){
		if(n==0){
			return sum;
		}
		//int rem = n%10;
		sum = sum*10+n%10;
		return reverse(n/10,sum);
	 }
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;
		System.out.println(reverse(n,sum));
	}
}


OUTPUT:

1234
4321

8762
2678
