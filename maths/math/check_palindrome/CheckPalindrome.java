package check_palindrome;

import java.util.Scanner;

public class CheckPalindrome {
	public static void main(String[] args) {
		int inputNumber;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your input number to check palindrome : ");
		inputNumber = scanner.nextInt();
		boolean isPalindrome = checkPalindrome(inputNumber);
		System.out.println("Is the given input number palindrome  : " + isPalindrome);
		scanner.close();
	}

	private static boolean checkPalindrome(int inputNumber) {
		int number = inputNumber;
		int reversedNumber = 0;
		int remainder = 0;
		while (number != 0) {
			remainder = number % 10;
			reversedNumber = reversedNumber * 10 + remainder;
			number = number / 10;
		}
		if (inputNumber == reversedNumber)
			return true;
		return false;
	}
}
