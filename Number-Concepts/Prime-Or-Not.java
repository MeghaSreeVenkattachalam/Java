Check whether the number is a prime or not?

CODE:

import java.util.*;
class Prime_Or_Not{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		
		if(isPrime(num)){
			System.out.printf("%d is a prime number",num);
		}
		else{
			System.out.printf("%d is not a prime number",num);
		}
	}
		
		public static boolean isPrime(int num){
		if(num<=1){
			return false;
		}
		for(int i=2;i<=Math.sqrt(num);i++){
			if(num%i==0){
				return false;
			}
		}
		return true;
		
	}
}


OUTPUT:
Enter the number:
1
1 is not a prime number

Enter the number:
563
563 is not divisible by both 7 and 11

Enter the number:
1
1 is not a prime number

Enter the number:
2
2 is a prime number

Enter the number:
7
7 is a prime number

Enter the number:
634
634 is not a prime number
