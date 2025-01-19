Check if a number is divisible by 5 and 10?

CODE:

import java.util.*;
class Divisible_by_5_10{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		if(num%5==0 && num%10==0){
			System.out.println("Divisible");
		}
		else{
			System.out.println("Not Divisible");
		}
	}
}


OUTPUT:
Enter the number:
50
Divisible

Enter the number:
353
Not Divisible
