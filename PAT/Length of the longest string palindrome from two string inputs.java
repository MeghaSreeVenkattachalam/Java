Given two strings, S and T, of equal length, pick some characters from the first string and some from the second string, and then form a new string by rearranging the characters picked. Find the length of the longest string that you can make, which will be a palindrome.



Example



Sample Input:

aba

bab



Sample Output:

5



Explanation:

One of the possible ways to form a palindrome of length 5 is by picking "aba" from the first string and "bab" from the second string, which gives "ababa".

Input format :
The first line contains a string S as input

The next line contains the string T as input.

Output format :
The output prints an integer, which denotes the maximum length of the palindrome that can be obtained.



Refer to the sample output for format specifications.

Code constraints :
1<=|S| , |T|<=1000

Sample test cases :
Input 1 :
aba
bab
Output 1 :
5
Input 2 :
aacd
cbad
Output 2 :
7

CODE:

import java.util.*;
class Solution{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
String s = sc.nextLine();
String t = sc.nextLine();
Map<Character,Integer> map = new HashMap<>();
for(char c:s.toCharArray()){
map.put(c,map.getOrDefault(c,0)+1);
}
for(char c:t.toCharArray()){
map.put(c,map.getOrDefault(c,0)+1);
}
int len=0;
boolean isOdd = false;
for(int c:map.values()){
len += (c/2)*2;
if(c%2==1){
isOdd = true;
}
}
if(isOdd){
len+=1;
}
System.out.print(len);
}
}
