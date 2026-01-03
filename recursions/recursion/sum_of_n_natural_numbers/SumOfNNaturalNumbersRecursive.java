package sum_of_n_natural_numbers;

import java.util.Scanner;

public class SumOfNNaturalNumbersRecursive {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter a number to calculate the sum of natural numbers : ");
		int input = scanner.nextInt();
		int sumOfNNaturalNumbers = sumOfNNaturalNumbersRecursive(input);
		System.out.println("The sum of the natural numbers for the given input is : " + sumOfNNaturalNumbers);
		scanner.close();

	}

	public static int sumOfNNaturalNumbersRecursive(int input) {
		if (input == 1)
			return 1;
		return input + sumOfNNaturalNumbersRecursive(input - 1);
	}
}
