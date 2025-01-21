Find the Right most digit?

CODE:

import java.util.*;
class Right_Most_Digit{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value: ");
		int num = sc.nextInt();
		
		while(num>=10){
			num = num%10;
		}
		System.out.println("The Right most digit is "+num);
	}
}


OUTPUT:
Enter the value: 687682
The Right most digit is 2
