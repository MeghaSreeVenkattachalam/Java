Check whether it is a Strong Number or Not?
A Strong Number is a special number where the sum of the factorials of its digits equals the number itself. 

CODE:

import java.util.*;
class Strong_Number{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		int sum = 0;
		int temp = num;
		
		while(temp>0){
			int last_digit = temp%10;
			
			//factorial
			int fact = 1;
			int i = 1;
			while(i<=last_digit){
				fact = fact*i;
				i++;
			}
			
			sum=sum+fact;
			temp=temp/10;
		}
		if(sum==num){
			System.out.printf("%d is a Strong Number",num);
		}
		else{
			System.out.printf("%d is a not a Strong Number",num);
		}
	}
}


OUTPUT:
Enter the number:
145
145 is a Strong Number

Enter the number:
543
543 is a not a Strong Number
