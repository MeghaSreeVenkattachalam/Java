import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'staircase' function below.
     *
     * The function accepts INTEGER n as parameter.
     */

    public static void staircase(int n) {
    // Write your code here
    for(int i=0;i<n;i++){
        
        for(int j=0;j<n-i-1;j++){
            System.out.print(" ");
        }
        for(int k=0;k<=i;k++){
            System.out.print("#");
        }
         System.out.println();
    }

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        Result.staircase(n);

        bufferedReader.close();
    }
}


OUTPUT:

Sample Input

6 
Sample Output

     #
    ##
   ###
  ####
 #####
######
