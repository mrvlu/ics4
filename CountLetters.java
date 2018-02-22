/**
 * Doing more with arrays
 * November 1st, 2012
 * YOUR NAME 
 * This CountLetters class handles user inputed word and will apply certain operation to the String such as find vowels and determine frequency 
 */
import java.util.Scanner;

public class CountLetters {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		String word;
		char [] wordLetters;  // arrays are non dynamic 
		char [] wordVowels = new char[6]; 
		String vowels = "AEIOUY";
		
		/* Prompt user for word */
		System.out.print("Enter a word: ");
		word=input.nextLine();
		
		/* Reminder and how to use String.contains(String) with a character */
		System.out.println(word.contains('p'+""));

		/* Convert word to char array */
		word = word.toUpperCase();
		wordLetters=word.toCharArray();
		/* cheap String method to create an array given a delimiter */
		String [] wordSplit = word.split("");
		// iterator
		for(String v : wordSplit)
		{
		    System.out.println(v);
		}
		
		for (int letter=0;letter<wordLetters.length;letter++){
			System.out.println(wordLetters[letter]);
			//1. Display the number of characters found in the word using wordLetters.
			
			//2. Store the vowels in wordVowels found in the word using wordLetters.
			
			//3. Display the number of letters only in the word using wordLetters.
			// Care must be taken to ignore other non alphanumeric characters. (hint: you will need to use ASCII values)
			
			//4. *challenging* Display the frequency of characters in wordLetters.
			// frequency: the number of times a character appears in the word
			
		}
		
		
		
	}

}
