package week1.day2.assignments;

public class Palindrome {

	public static void main(String[] args) {

		//Build a logic to find the given string is palindrome or not
	     
		/*
		 * Pseudo Code
		
		 * a) Declare A String value as"madam"
		 
		 * b) Declare another String rev value as ""
		 * c) Iterate over the String in reverse order
		 * d) Add the char into rev
		 * e) Compare the original String with the reversed String, if it is same then print palinDrome 
		 
		 * Hint: Use .equals or .equalsIgnoreCase when you compare a String 
		 */
		
		String inputString = "madam";
		String reverseString = "";
		
		char[] inputCharArray = inputString.toCharArray();
		for (int charArrayIndex = inputCharArray.length-1; charArrayIndex >=0 ; charArrayIndex--) {
			reverseString=reverseString + inputCharArray[charArrayIndex];
		}
		if(inputString.equalsIgnoreCase(reverseString))
			System.out.println("Input string " + inputString + " is a Palindrome.");
		else
			System.out.println("Input string " + inputString + " is a not Palindrome.");
	}
}