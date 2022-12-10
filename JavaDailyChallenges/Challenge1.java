package javachallenge;

public class Challenge1 {

	public static void main(String[] args) {

		String sentence = "luffy is still joyboy";
		
		String[] words = sentence.split(" ");
		
		System.out.println("The last word is \"" + words[words.length-1] + "\" with length " + words[words.length-1].length() + ".");
	}
}