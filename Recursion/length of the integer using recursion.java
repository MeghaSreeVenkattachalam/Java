Find the length of the integer using recursion

import java.util.*;
class String_Length{
	public static int count(int n,int count){
		if(n==0){
			return count;//return n;
		}
		count++;
		return count(n/10,count); //1+count(n/10);
	}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = 0;
		System.out.println(count(n,count));
	}
}

OUTPUT:

123456
6

549873224
9
