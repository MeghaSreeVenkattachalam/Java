Problem Statement:
An automobile company manufactures both a two wheeler (TW) and a four wheeler (FW). A company manager wants to make the production of both types of vehicle according to the given data below:
1st data, Total number of vehicle (two-wheeler + four-wheeler) = V
2nd data, Total number of wheels = W
The task is to find how many two-wheelers as well as four-wheelers need to manufacture as per the given data.

Example:
Input:
200 -> Value of V
540 -> Value of W

Output:
TW =130 FW=70

Explanation:
130+70 = 200 vehicles
(70*4) + (130*2) = 540 wheels

Input format :
The input consists of two positive integers separated by a new line, representing the total number of vehicles (V) and the total number of wheels (W).
Output format :
The output prints two integers separated by a space, representing the number of two-wheelers (TW) and four-wheelers (FW) to manufacture. Print "INVALID INPUT" if the inputs do not meet the constraints.
Refer to the sample output for formatting specifications.

Code constraints :
20 ≤ V ≤ 109
50 ≤ W ≤ 109
W % 2 = 0
V < W

Sample test cases :
Input 1 :
200
540
Output 1 :
TW= 130 FW= 70
Input 2 :
2000
100
Output 2 :
INVALID INPUT

import java.util.*;
class Two_Four_Wheelers{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int V = sc.nextInt();
		int W = sc.nextInt();
		
		int pow = (int)Math.pow(10,9);
        
        if((V>=20 && V<=pow) && (W>=50 && W<=pow) && W%2==0 && V<W){
        int TW = (4*V - W)/2;
		int FW = V-TW;
        System.out.print("TW= "+TW+" FW= "+FW);
        }else{
            System.out.print("INVALID INPUT");
        }
    }
}
