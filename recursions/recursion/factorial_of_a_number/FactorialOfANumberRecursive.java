package factorial_of_a_number;

import java.util.Scanner;

public class FactorialOfANumberRecursive {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the input to find the factorial : ");
		int input = scanner.nextInt();
		int factorialResult = factorialOfANumberRecursive(input);
		System.out.println("The factorial of the given input is : " + factorialResult);
		scanner.close();
	}

	private static int factorialOfANumberRecursive(int input) {
		if (input == 0)
			return 1;
		else
			return input * factorialOfANumberRecursive(input - 1);
	}
}
