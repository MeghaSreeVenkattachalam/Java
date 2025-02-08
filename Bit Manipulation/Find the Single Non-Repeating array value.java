Find the Single Non-Repeating array value?

import java.util.*;
class Non_Repeating_One_Element{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter array values: ");
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		
		int result = 0;
		for(int i:arr){
			result = result^i;
		}
		System.out.print("The Single Non-Repeating array value is "+result);
	}
}


OUTPUT:
Enter the size of the array:
5
Enter array values:
1 2 1 3 2
The Single Non-Repeating array value is 3
