Next power of 2

CODE:

import java.util.*;
class Next_Power_Of_2{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int power = 1;
		while(power<=n){
		power = power<<1;
		}
		System.out.print("The next power of " +n+" is "+power);
	}
}

OUTPUT:
4
The next power of 4 is 8

8
The next power of 8 is 16
