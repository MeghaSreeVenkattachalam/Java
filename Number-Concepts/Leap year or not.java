Problem Statement
Checking if a given year is a leap year or not.

Explanation:
To check whether a year is a leap or not.

Step 1:
We first divide the year by 4.
If it is not divisible by 4 then it is not a leap year.
If it is divisible by 4 leaving remainder 0.
Step 2:
We divide the year by 100
If it is not divisible by 100 then it is a leap year.
If it is divisible by 100 leaving the remainder 0.
Step 3:
We divide the year by 400
If it is not divisible by 400 then it is a leap year.
If it is divisible by 400 leaving the remainder 0.
Then it is a leap year 

Input format :
The input consists of the integers, representing the year in the format (YYYY).
Output format :
The output displays the following format:
If the input year is a leap year, prints "{year} is a leap year".
If the input year is not a leap year, prints "{year} is not a leap year".

Refer to the sample output for formatting specifications.

Code constraints :
1900 <= years <= 2050

Sample test cases :
Input 1 :
2000
Output 1 :
2000 is a leap year
Input 2 :
1998
Output 2 :
1998 is not a leap year

CODE:

import java.util.*;
class Leap{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if((num%4==0)||(num%100==0)||(num%400==0)){
            System.out.printf("%d is a leap year",num);
        }else{
            System.out.printf("%d is not a leap year",num);
        }
    }
}
