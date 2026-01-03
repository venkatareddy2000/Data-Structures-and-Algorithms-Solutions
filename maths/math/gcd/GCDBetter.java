package gcd;

import java.util.Scanner;

public class GCDBetter {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your first input number to find the GCD : ");
		int firstNumber = scanner.nextInt();
		System.out.println("Enter your second input number to find the GCD : ");
		int secondNumber = scanner.nextInt();
		int result = gcd(firstNumber, secondNumber);
		System.out.println("The GCD of the given number is : " + result);
		scanner.close();
	}

	private static int gcd(int firstNumber, int secondNumber) {
		int smallestNumber = Math.min(firstNumber, secondNumber);
		int gcdOfTwoNumbers = 0;
		for (int index = smallestNumber; index >= 1; index--) {
			if (firstNumber % index == 0 && secondNumber % index == 0) {
				gcdOfTwoNumbers = index;
				return gcdOfTwoNumbers;
			}
		}
		return gcdOfTwoNumbers;
	}
}
