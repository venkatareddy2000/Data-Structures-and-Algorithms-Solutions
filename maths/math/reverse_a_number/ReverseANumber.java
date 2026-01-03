package reverse_a_number;

import java.util.Scanner;

public class ReverseANumber {
	public static void main(String[] args) {
		int number;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your input number to reverse : ");
		number = scanner.nextInt();
		int numberOfDigits = reverseNumber(number);
		System.out.println("Reversed Number is : " + numberOfDigits);
		scanner.close();
	}

	private static int reverseNumber(int number) {
		int reversedNumber = 0;
		int remainder = 0;
		while (number != 0) {
			remainder = number % 10;
			reversedNumber = reversedNumber * 10 + remainder;
			number = number / 10;
		}
		if (reversedNumber > Integer.MAX_VALUE) {
			return 0;
		}
		return reversedNumber;
	}
}
