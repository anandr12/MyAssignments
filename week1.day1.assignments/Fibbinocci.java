package week1.day1.assignments;

public class Fibbinocci {

	public static void main(String[] args) {
		
		int firstNum = 0;
		int secondNum = 1;
		int sum = 0;
		
		System.out.print(firstNum);
		for (int counter = 1; counter <= 12; counter++) {
			sum = firstNum + secondNum;
			secondNum=firstNum;
			firstNum=sum;
			System.out.print("\t" + sum);
		}
	}
}