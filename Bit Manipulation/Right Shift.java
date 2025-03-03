/*
This question was given in the final_Assessment where I didn't do that.
The Decimal value needs to converted into the Binary and then toggle the Binary value and 
Output the respective Decimal value as the output
sample test cases
1. Input = 10 --> Output = 5
2. Input = 5 --> Output = 2
*/

import java.util.*;
class Right_Shift{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.print(n>>1);
	}
}
