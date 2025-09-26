//Case conversion using bitwise operators
//Upper to Lower and Lower to Upper


import java.util.*;
class CaseConversion{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		final int x = 32;
		String res = "";
		for(char i : s.toCharArray()){
			if(Character.isLowerCase(i)){
				res += (char)(i & (~x));
			}else{
			res += (char)(i | x);
			}
		}
		System.out.println(res);
	}
}
				
