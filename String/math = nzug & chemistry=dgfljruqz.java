math==nzug , chemistry=dgfljruqz
for even index adding +1 and for odd index subtracting -1

CODE:

import java.util.*;
/*
class Math_NZUG{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
	
		int[] arr = new int[256];
		
		for(int i=0;i<str1.length();i++){
			arr[i] = str1.charAt(i);
		}
		
		for(int i=0;i<str1.length();i++){
			if(i%2==0)
			{
				 if(arr[i]==122||arr[i]==90){
					arr[i]=arr[i]-25;
					System.out.print((char)arr[i]);
				}
				else{
					arr[i]++;
				System.out.print((char)arr[i]);
				}	
			}else{
				if(arr[i]==97||arr[i]==65){
					arr[i]=arr[i]+25;
					System.out.print((char)arr[i]);
				}
				else{
					arr[i]--;
				System.out.print((char)arr[i]);
				}
			}
		}
		
	}
}
*/

class Math_NZUG{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		char ch[] = str.toCharArray();
		
		for(int i=0;i<str.length();i++){
			if(i%2!=0){
				if(ch[i]=='a'||ch[i]=='A'){
					ch[i] += 25;
					System.out.print(ch[i]);
				}
				else{
					ch[i] -= 1;
					System.out.print(ch[i]);
				}
			}
			else{
				if(ch[i]=='z'||ch[i]=='Z'){
					ch[i] -= 25 ;
					System.out.print(ch[i]);
				}
				else{
					ch[i] +=1;
					System.out.print(ch[i]);
				}
			}
		}
	}
}


OUTPUT:

math
nzug

chemistry
dgfljruqz

apple
boqkf
