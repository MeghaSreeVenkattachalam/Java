Latha loves to play with words. She participated in a competition in which she has to arrange the characters in the string in alphabetical order within a short period. Write a program to obtain a string and display them in ascending order.

Input format :
The input consists of a string.

Output format :
The output displays the string in alphabetical order.

Sample test cases :
Input 1 :
computer
Output 1 :
cemoprtu

CODE:
import java.util.*;
class Latha{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char ch[] = str.toCharArray();
        Arrays.sort(ch);
        for(int i=0;i<ch.length;i++){
            System.out.print(ch[i]);
        }
    }
}
