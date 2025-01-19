Check if a number is a positive, negative or zero?

CODE:

import java.util.*;
class positive_negative_no{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		if(num>0){
			System.out.println("Positive");
		}
		else if(num < 0){
			System.out.println("Negative");
		}else{
			System.out.println("Zero");
		}
	}
}
			

OUTPUT:
Enter the number:
12
Positive

Enter the number:
-64
Negative

Enter the number:
0
Zero
