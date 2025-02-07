Problem Statement
Jack and Jill are playing a string game. Jack has given Jill two strings A and B. Jill has to derive a string C from A, by deleting elements from string A, such that string C does not contain any element of string B. Jill needs help to do this task. She wants a program to do this as she is lazy. Given strings A and B as input, give string C as Output.

Example:
Input:
tiger ->Input string A
ti ->Input string B
output:
ger ->output string C

Explanation:
After removing “t” and “I” from “tiger”. We are left with “ger”. So the answer is “ger”.

Input format :
The first line consists of the string, representing the string A.
The second line consists of the string, representing the string B.

Output format :
The output displays a string C, which is the result of the string B taken out from A as per the logic.
Refer to the sample output for the formatting specifications.

Code constraints :
0 < length of A < 100
0 < length of B < length of A
A and B contains only lowercase letters

Sample test cases :
Input 1 :
tiger
ti
Output 1 :
ger

import java.util.*;
class String_Tiger_PAT{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();
		
		//for(char ch: str2.toCharArray()){
			str1 = str1.replace(str2,"");
		//}
		System.out.print(str1);
	}
}



OUTPUT:
tiger
ti
ger
