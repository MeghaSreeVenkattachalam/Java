Find the missing remaining numbers from 1-9 from the given input integer

CODE:

import java.util.*;
class Missing_Numbers{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int arr[] = new int[10];
		arr[0] = 1;
		while(n>0){
			int index = n%10;
			arr[index]=index;
			n=n/10;
		}
		for(int i=0;i<=10;i++){
			if(i==arr[i]){
				//System.out.println(arr[i]+" ");
				continue;
			}else{
				System.out.println(i);
			}
		}
	}
}
/*
OUTPUT:

123
0
4
5
6
7
8
9
*/
