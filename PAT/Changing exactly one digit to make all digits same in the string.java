Mike set off with great zeal to the "Kracker Jack Fun Fair 2017". There were numerous activities at the fair, though Mike, being a math expert, liked to participate in the Number Challenge.

Mike was given a string of D numbers containing only digits 0's and 1's. His challenge was to make the number have all the same digits. For that, he should change exactly one digit, i.e., from 0 to 1 or from 1 to 0. If it is possible to make all digits equal (either all 0's or all 1's) by flipping exactly 1 digit, then he has to output "Yes", else print "No" (without quotes).

Write a program to help Mike overcome his challenge.

Input format :
The input consists of a string D of numbers made of only digits 1's and 0's.

Output format :
The output displays either a “Yes" or a "No", depending on whether it is possible to make it all 0s or 1s or not. 

Sample test cases :
Input 1 :
101
Output 1 :
Yes
Input 2 :
11
Output 2 :
No

CODE:

import java.util.*;
class Main{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
String s = sc.nextLine();
int one=0;
int zero=0;
for(char c:s.toCharArray()){
if(c=='0') {
zero++;
}else{
one++;
}
}
if(zero==1 || one==1){
System.out.print("Yes");
}else{
System.out.print("No");
}
}
}
