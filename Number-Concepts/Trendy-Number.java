Check whether the number is a Trendy number or not?
The Trendy number means it should be the middle number of the given input and it should also be divisible by 3.
The input must be a three digit

CODE:

import java.util.*;
class Trendy_Number{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		
		while(num>99 && num<=999){
			
			int digit = (num%100)/10;
			
			if(digit%3 == 0){
				System.out.printf("%d is a trendy number",num);
				break;
			}
			else{
				System.out.printf("%d is not a trendy number",num);
				break;
			}
		}
		
		
	}
}

OUTPUT:
Enter the number:
999
999 is a trendy number

Enter the number:
123
123 is not a trendy number

Enter the number:
165
165 is a trendy number
