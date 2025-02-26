Nela's Birthday and Colorful Balloons

Nella is an eight-year-old princess who will inherit the kingdom of Castlehaven. It is her birthday today and her Dad, the King of Castlehaven has arranged for a grand party. Nella loves colorful balloons and so her Dad planned to decorate the entire palace with balloons of the colors that Nella loved. So he asked her about her color preferences. 
The sophisticated princess that Nella is, she likes only two colors — amber and brass. Her Dad bought balloons, each of which was either amber or brass in color. You are provided this information in a string s consisting of characters 'a' and 'b' only, where 'a' denotes that the balloon is amber, where 'b' denotes it is brass colored. When Nella saw the balloons, she was furious with anger as she wanted all the balloons of the same color. 
In her rage, she painted some of the balloons with the opposite color (i.e., she painted some amber ones brass and vice versa) to make all balloons appear to be the same color. It took her a lot of time to do this, but you can probably show her the right way of doing so, thereby teaching her a lesson to remain calm in difficult situations, by finding out the minimum number of balloons needed to be painted in order to make all of them the same color.

Input format :
The input consists of a string, s.

Output format :
The output prints the minimum number of flips required.

Sample test cases :
Input 1 :
ab
Output 1 :
1
Input 2 :
baaba
Output 2 :
2

CODE:

import java.util.*;
class Solution{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char a ='a';
        char b = 'b';
        int ac = 0;
        int bc = 0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==a){
                ac++;
            }else{
                bc++;
            }
        }
        
        System.out.print(Math.min(ac,bc));
    }
}
