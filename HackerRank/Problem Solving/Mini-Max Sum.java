import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void miniMaxSum(List<Integer> arr) {
    // Write your code here
    int min = 0;
    int max = 0;
    for(int i=0;i<arr.size();i++){
        if(i<=arr.size()-2){
            min += arr.get(i);
        }
        if(i!=0 && i<=arr.size()-1){
            max += arr.get(i);
        }
    }
    /*
    List<Integer> res = new ArrayList<>();
    res.add(min);
    res.add(max);
    return res;*/
    System.out.println(min+" "+max);

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrTemp[i]);
            arr.add(arrItem);
        }

        Result.miniMaxSum(arr);

        bufferedReader.close();
    }
}


Sample Input

1 2 3 4 5
Sample Output

10 14
