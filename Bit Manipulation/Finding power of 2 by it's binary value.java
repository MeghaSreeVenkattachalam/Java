Finding power of 2 by it's binary value
/*

import java.util.*;
class Power_OF_2{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the input: "); 
		int n = sc.nextInt();
		String str = Integer.toBinaryString(n);
		int count=0;
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)=='1'){
				count++;
			}
		}
		//if it is a power of 2 then there will be only one 1
		
		if(count==1){
			System.out.print("Power of 2");
		}
		else{
			System.out.print("Not a power of 2");
		}
	}
}
*/

import java.util.*;
class Power_OF_2{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the input: "); 
		int n = sc.nextInt();
		if((n & (n-1))==0){
			System.out.print("Power of 2");
		}
		else{
			System.out.print("Not a Power of 2");
		}
		
	}
}		
