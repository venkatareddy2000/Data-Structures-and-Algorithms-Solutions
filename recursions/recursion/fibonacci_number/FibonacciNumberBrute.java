package fibonacci_number;

import java.util.Arrays;
import java.util.Scanner;

public class FibonacciNumberBrute {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number to calculate the fibonacci series : ");
		int input = scanner.nextInt();
		int[] fibonacciSeries = fibonacciNumberBrute(input);
		System.out.println(Arrays.toString(fibonacciSeries));
		scanner.close();
	}

	private static int[] fibonacciNumberBrute(int input) {
		int[] result = new int[input + 1];
		int firstNumber = 0;
		int secondNumber = 1;
		int index = 2;
		int nextFibonacciNumber = 0;
		if (input == 0) {
			result[0] = firstNumber;
		} else if (input == 1) {
			result[0] = firstNumber;
			result[1] = secondNumber;
		} else {
			result[0] = firstNumber;
			result[1] = secondNumber;
			while (index <= input) {
				nextFibonacciNumber = firstNumber + secondNumber;
				result[index] = nextFibonacciNumber;
				firstNumber = secondNumber;
				secondNumber = nextFibonacciNumber;
				index++;
			}
		}
		return result;
	}
}
