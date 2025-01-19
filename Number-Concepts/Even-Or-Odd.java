Find whether the number is an Even or Odd?

CODE:

import java.util.*;
class Even_Odd{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		if(num%2==0){
			System.out.printf("%d is an Even number",num);
		}
		else{
			System.out.printf("%d is a Odd number",num);
		}
	}
}

OUTPUT:
Enter the number:
23
23 is a Odd number

Enter the number:
40
40 is an Even number
