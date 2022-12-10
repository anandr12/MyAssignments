package week1.day2.assignments;

public class ReverseEvenWords {

	public static void main(String[] args) {

		//Build a logic to reverse the even position words (output: I ma a erawtfos tester)		

		/* Pseudo Code:

		 * Declare the input as Follow
	      		String test = "I am a software tester"; 
		a) split the words and have it in an array
		b) Traverse through each word (using loop)
		c) find the odd index within the loop (use mod operator)

		d)split the words and have it in an array

		e)print the even position words in reverse order using another loop (nested loop)
		f) Convert words to character array if the position is even else print the word as it is(concatenate space at the end).

		 */

		String inputString = "I am a software tester";

		String[] splitStrings = inputString.split(" ");


		for (int wordPosition = 1; wordPosition <= splitStrings.length; wordPosition++) {
			if (wordPosition%2==0) {
				char[] charArray = splitStrings[wordPosition-1].toCharArray();
				String reverseString = "";
				for (int charIndex = charArray.length-1; charIndex >=0 ; charIndex--) {
					reverseString=reverseString+charArray[charIndex];
				}
				System.out.print(reverseString + " ");
			} else {
				System.out.print(splitStrings[wordPosition-1] + " ");
			}
		}
	}
}