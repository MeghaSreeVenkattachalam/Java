Problem description
Mr. Jason has captured your friend and has put a collar around his neck. He has locked it with a given ‘locking key’. It can be opened now with an ‘unlocking key’. Your friend has seen the ‘locking key’ but he does not know about the ‘unlocking key’. Given the locking key, one can figure out the ‘Unlocking key’ which is the smallest (in magnitude) permutation of the digits of that number and it never starts with zero.
Help your friend to write an algorithm that takes the locking key as an input and outputs the unlocking key.

Example
Input
312

Output
123

Explanation
123 is the least possible permutation of the digits (3,1,2) in the given number.

Input format :
The input consists of an integer K, representing the locking key.

Output format :
Print an integer representing the unlocking key.

Code constraints :
-107 < K < 107

Note
There exists a possible answer for every input.

Sample test cases :
Input 1 :
312
Output 1 :
123
Input 2 :
111
Output 2 :
111

CODE:

import java.util.*;

public class UnlockingKey {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String k = sc.next();
        sc.close();
        
        char[] digits = k.toCharArray();
        Arrays.sort(digits);
        
        if (digits[0] == '0') {
            for (int i = 1; i < digits.length; i++) {
                if (digits[i] != '0') {
                    char temp = digits[0];
                    digits[0] = digits[i];
                    digits[i] = temp;
                    break;
                }
            }
        }
        
        System.out.println(new String(digits));
    }
}
