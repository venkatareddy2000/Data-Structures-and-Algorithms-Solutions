package fibonacci_number;

import java.util.Scanner;

public class FibonacciNumberOptimal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number to calculate the fibonacci number : ");
		int input = scanner.nextInt();
		int fibonacciNumber = fibonacciNumberOptimal(input);
		System.out.println("The fibonacci number for the given input is : " + fibonacciNumber);
		scanner.close();
	}

	private static int fibonacciNumberOptimal(int input) {
		if (input <= 1)
			return input;
		return fibonacciNumberOptimal(input - 1) + fibonacciNumberOptimal(input - 2);
	}
}
