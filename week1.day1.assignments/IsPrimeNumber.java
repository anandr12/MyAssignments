package week1.day1.assignments;

import java.util.Scanner;

public class IsPrimeNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter an number: ");
		int inputValue = sc.nextInt();
		int counter;
		for (counter = 2; counter < inputValue; counter++) {
			if(inputValue % counter == 0)
				break;
		}
		if(counter == inputValue)
			System.out.println("Number " + inputValue + " is a prime number.");
		else
			System.out.println("Number " + inputValue + " is a not prime number.");
	}
}