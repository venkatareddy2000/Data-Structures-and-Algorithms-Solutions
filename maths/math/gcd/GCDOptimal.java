package gcd;

import java.util.Scanner;

public class GCDOptimal {
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
		if (firstNumber == 0)
			return secondNumber;
		else if (secondNumber == 0)
			return firstNumber;
		else {
			int largest = Math.max(firstNumber, secondNumber);
			int smallest = Math.min(firstNumber, secondNumber);
			return gcd(largest - smallest, smallest);
		}
	}
}
