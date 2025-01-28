Find the total number of vowels or count the vowels in the string?

CODE:

import java.util.*;
class Vowel_Count{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string: ");
		String str = sc.nextLine();
		//converted them into toLowerCase
		str = str.toLowerCase();
		int count=0;
		//converted them into toCharArray
		char ch[] =str.toCharArray();
		for(int i=0;i<str.length();i++){
			
			//if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'){
			
			if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u'){
				count++;
			}
		}
		System.out.println("The total number of vowels count is "+count);
	}
}

OUTPUT:
Apple is a healthy fruit
8
