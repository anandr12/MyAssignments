package week1.day2.assignments;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {

		/*
		 * Pseudo Code

		 * Declare String Input as Follow

		 * String test = "changeme";

		 * a) Convert the String to character array

		 * b) Traverse through each character (using loop)

		 * c)find the odd index within the loop (use mod operator)

		 * d)within the loop, change the character to uppercase, if the index is odd else don't change

		 */
		String test="changeme";

		char[] testCharArray = test.toCharArray();

		for (int charIndex = 0; charIndex < testCharArray.length; charIndex++) {
			if(charIndex%2!=0)
				testCharArray[charIndex] = Character.toUpperCase(testCharArray[charIndex]);
			System.out.print(testCharArray[charIndex]);
		}
	}
}