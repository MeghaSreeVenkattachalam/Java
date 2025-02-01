Remove duplicate characters in the String

CODE:

import java.util.Scanner;

public class RemoveDuplicateChars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        
        boolean seen[] = new boolean[256]; // To track seen characters
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (!seen[ch]) { // If character is not seen before
                result += ch; // Add to result
                seen[ch] = true; // Mark as seen
            }
        }

        System.out.println("String after removing duplicates: " + result);
        
        sc.close();
    }
}

OUTPUT:
Enter a string: banana
String after removing duplicates: ban

Enter a string: apple
String after removing duplicates: aple
