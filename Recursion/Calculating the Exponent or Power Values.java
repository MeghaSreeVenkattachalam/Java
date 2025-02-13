Find the power values by taking base and power as input

import java.util.*;
class Power_Values{
	
	 static int power1(int base,int power){//,int sum){
		if(power==0){
			return 1;
		}
		//sum = sum*base;
		return base*power1(base,power-1);
	 }
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int base = sc.nextInt();
		int power = sc.nextInt();
		//int sum = 1;
		System.out.println(power1(base,power));
	}
}


OUTPUT:

2 2
4

2 3 
8

4 2
16
