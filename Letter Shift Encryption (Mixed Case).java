QUESTION:

A string S consisting of uppercase and lowercase English letters

An integer K representing the number of positions to shift

An integer D

D = 0 → shift forward

D = 1 → shift backward

🔹 Rules:

Lowercase letters remain lowercase

Uppercase letters remain uppercase

Wrapping should occur

z → a

A → Z

Non-alphabet characters (if any) remain unchanged

📌 SAMPLE INPUT
AbZy
2
0

📌 SAMPLE OUTPUT
CdBa

📌 SAMPLE INPUT 2
EpAm
3
1

📌 SAMPLE OUTPUT 2
BlXj

✅ COMPLETE JAVA CODE:

  
import java.util.Scanner;

public class LetterShiftCipher {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input
        String s = sc.nextLine();
        int k = sc.nextInt();
        int d = sc.nextInt(); // 0 = forward, 1 = backward

        String result = "";

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            // Lowercase letters
            if (ch >= 'a' && ch <= 'z') {
                int pos = ch - 'a';

                if (d == 0)
                    pos = (pos + k) % 26;
                else
                    pos = (pos - k + 26) % 26;

                ch = (char) (pos + 'a');
            }

            // Uppercase letters
            else if (ch >= 'A' && ch <= 'Z') {
                int pos = ch - 'A';

                if (d == 0)
                    pos = (pos + k) % 26;
                else
                    pos = (pos - k + 26) % 26;

                ch = (char) (pos + 'A');
            }

            // Append result
            result += ch;
        }

        System.out.println(result);
        sc.close();
    }
}
