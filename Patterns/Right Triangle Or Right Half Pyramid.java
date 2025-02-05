import java.util.*;
class Right_triangle{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		//Right-triangle
		for (int i=0; i<n;i++){
			for(int j=0; j<=i; j++){
				System.out.print("*");
			}
			System.out.println();
		
		}
	}
}

OUTPUT:

5
*
**
***
****
*****
