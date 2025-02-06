Swapping using bitwise X-OR 

import java.util.*;
class Swapping_Using_Bitwise{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		n = n^m;
		m = n^m;
		n = n^m;
		
		System.out.println("After Swapping: "+n+" "+m);
	}
}

		
		
