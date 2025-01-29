import java.util.*;
class Num_To_Binary{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number: ");
		int num = sc.nextInt();
		int sum = 0;
		int quotient = 0;
		String str = "";
		while(quotient!=1){
		int divisor = 2;
		int rem = num%divisor;
		str += rem;
		 quotient = num/divisor;
		
		num = quotient;
		}
		str += quotient;
		StringBuilder stb = new StringBuilder(str);
		str = stb.reverse().toString();
		System.out.print("The Binary value of the number is "+str);
	}
}
