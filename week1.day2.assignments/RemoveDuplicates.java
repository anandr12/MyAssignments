package week1.day2.assignments;

public class RemoveDuplicates {

	public static void main(String[] args) {

		/*
		 * Pseudo code 

		 * a) Use the declared String text as input
			String text = "We learn java basics as part of java sessions in java week1";		
		 * b) Initialize an integer variable as count	  
		 * c) Split the String into array and iterate over it 
		 * d) Initialize another loop to check whether the word is there in the array
		 * e) if it is available then increase and count by 1. 
		 * f) if the count > 1 then replace the word as "" 

		 * g) Displaying the String without duplicate words	
		 */

		String inputText = "We learn java basics as part of java sessions in java week1";

		String[] inputTextArray = inputText.split(" ");
		
		String outputText = inputText;

		for (int stringIndex = 0; stringIndex < inputTextArray.length; stringIndex++) {
			int count = 0;
			for(int compareStringIndex = stringIndex+1; compareStringIndex < inputTextArray.length; compareStringIndex++ ) {
				if(inputTextArray[stringIndex].equals(inputTextArray[compareStringIndex])) {
					count++;
					break;
				}
			}
			if(count>0)
				outputText = outputText.replaceAll(inputTextArray[stringIndex], "");
		}
		System.out.println(outputText);
	}
}