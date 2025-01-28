Find the total number of consonent characters or count the consonents in a string?

CODE:

import java.util.*;
class Consonent_Counts{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string input: ");
		String str = sc.nextLine();
		str = str.trim();
		int count=0;
		//converted them into toCharArray
		char ch[] =str.toCharArray();
		for(int i=0;i<str.length();i++){
			
			//if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'){
			
			if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u'||ch[i]=='A'||ch[i]=='E'||ch[i]=='I'||ch[i]=='O'||ch[i]=='U'||ch[i]==' '){
				continue;
			}
			else{
				count++;
				
			}
			
		}
		System.out.println("The consonents count of the given input is "+count);
	}
}

OUPUT:
Enter the string input: Apple is a healthy fruit
The consonents count of the given input is 12
