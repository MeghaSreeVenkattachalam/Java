Find only consonent characters or remove vowels in a string?

CODE:

import java.util.*;
class Consonent_Characters{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string input: ");
		String str = sc.nextLine();
		
		//converted them into toCharArray
		char ch[] =str.toCharArray();
		System.out.print("The consonents in the given input is: ");
		for(int i=0;i<str.length();i++){
			
			//if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'){
			
			if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u'||ch[i]=='A'||ch[i]=='E'||ch[i]=='I'||ch[i]=='O'||ch[i]=='U'){
				continue;
			}
			else{
				System.out.print(ch[i]);
			}
			//without else
				//give System.out.print(str.charAt(i));
		}
		
	}
}

OUTPUT:
Apple is a healthy fruit
The consonents in the given input is ppl s hlthy frt
