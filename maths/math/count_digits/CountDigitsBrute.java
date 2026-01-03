package count_digits;

import java.util.Scanner;

public class CountDigitsBrute {
	public static void main(String[] args) {
		int number;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your input number to find the number of digits : ");
		number = scanner.nextInt();
		int numberOfDigits = countDigits(number);
		System.out.println("Number of digits in the given input number is : " + numberOfDigits);
		scanner.close();
	}

	private static int countDigits(int number) {
		int count = 0;
		while (number != 0) {
			count++;
			number = number / 10;
		}
		return count;
	}
}
