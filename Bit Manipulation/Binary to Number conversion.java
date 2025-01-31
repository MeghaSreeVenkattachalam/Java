Converting Binary to a Number

/*
import java.util.*;
class Binary_Number{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the binary value: ");
		String str = sc.nextLine();
		char[] arr = str.toCharArray();
		int num = 0;
		int sum = 0;
		int pow = 0;//the power value
		for(int i=arr.length-1;i>=0;i--){
			if(arr[i] == '1'){
				num = (int)(Math.pow(2,pow));
				sum += num;
			}
			pow++;
		}
		System.out.println("The Number is "+sum);
	}
}
*/
import java.util.*;
class Binary_Number{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the binary value: ");
		String str = sc.nextLine();
		char[] arr = str.toCharArray();
		int num = 0;
		int sum = 0;
		int pow = 0;//the index value in an character array
		for(int i=arr.length-1;i>=0;i--){
			if(arr[pow] == '1'){
				num = (int)(Math.pow(2,i));
				sum += num;
			}
			pow++;
		}
		System.out.println("The Number is "+sum);
	}
}

OUTPUT:

Enter the binary value:
1010
The Number is 10

Enter the binary value:
10000
The Number is 16
