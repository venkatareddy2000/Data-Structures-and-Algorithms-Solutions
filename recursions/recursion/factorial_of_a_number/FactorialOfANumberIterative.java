package factorial_of_a_number;

import java.util.Scanner;

public class FactorialOfANumberIterative {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the input to find the factorial : ");
		int input = scanner.nextInt();
		int factorialResult = factorialOfANumberIterative(input);
		System.out.println("The factorial of the given input is : " + factorialResult);
		scanner.close();
	}

	private static int factorialOfANumberIterative(int input) {
		int factorial = 1;
		if (input == 0 || input == 1)
			return 1;
		else {
			for (int index = 1; index <= input; index++) {
				factorial = factorial * index;
			}
		}
		return factorial;
	}
}
