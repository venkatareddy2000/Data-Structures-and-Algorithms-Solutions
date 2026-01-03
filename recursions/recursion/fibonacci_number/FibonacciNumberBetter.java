package fibonacci_number;

import java.util.Scanner;

public class FibonacciNumberBetter {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number to calculate the fibonacci series : ");
		int input = scanner.nextInt();
		fibonacciNumberBetter(input);
		scanner.close();
	}

	private static void fibonacciNumberBetter(int input) {
		int firstNumber = 0;
		int secondNumber = 1;
		int index = 2;
		int nextFibonacciNumber = 0;
		if (input == 0) {
			System.out.print("The fibonacci series for the given input : " + firstNumber);
		} else if (input == 1) {
			System.out.print("The fibonacci series for the given input : " + firstNumber + " " + secondNumber);
		} else {
			System.out.print("The fibonacci series for the given input : " + firstNumber + " " + secondNumber + " ");
			while (index <= input) {
				nextFibonacciNumber = firstNumber + secondNumber;
				System.out.print(nextFibonacciNumber + " ");
				firstNumber = secondNumber;
				secondNumber = nextFibonacciNumber;
				index++;
			}
		}
	}
}
