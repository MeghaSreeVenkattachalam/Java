import java.util.*;
class Rectangle_Pattern{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		//Rectangle
		for (int i=0; i<n;i++){
			for(int j=0; j<n; j++){
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}


OUTPUT:
5
*****
*****
*****
*****
*****
