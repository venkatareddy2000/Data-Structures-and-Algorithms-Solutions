package count_digits;

import java.util.Scanner;

public class CountDigitsOptimal {
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
		if (number == 0) {
			count = 1;
		} else {
			count = (int) Math.log10(number) + 1;
		}
		return count;
	}
}
