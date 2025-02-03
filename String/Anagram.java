Check whether the given strings are anagram or not?

An anagram is a word or phrase formed by rearranging the letters of another word or phrase, using all original letters exactly once. For example, listen and silent are anagrams.
Key Characteristics:
Same length: Both words or phrases must have the same number of letters.
Same letters, different order: The letters are rearranged to form a new meaningful word or phrase.
Case-insensitive: Anagrams ignore letter casing (uppercase/lowercase).
Spaces & punctuation may be ignored: In phrases, spaces and punctuation are often disregarded.
Examples:
Word Anagrams: evil → vile, cinema → iceman

  
import java.util.*;
class Anagram{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the 1st string: ");
		String str1 = sc.nextLine();
		System.out.print("Enter the 2nd string: ");
		String str2 = sc.nextLine();
		
		if(str1.length()==str2.length()){
		
		char ch1[] = str1.toCharArray();
		char ch2[] = str2.toCharArray();
		
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		str1 = String.valueOf(ch1);
		str2 = String.valueOf(ch2);
		
		if(str1.equals(str2)){
			System.out.print("It is an Anagram");
		}
		else{
			System.out.print("It is not an Anagram");
		}
		}
		else{
			 System.out.print("Not an Anagram");
		}
		
	}
}

OUTPUT:

Enter the 1st string: dog
Enter the 2nd string: god
It is an Anagram
