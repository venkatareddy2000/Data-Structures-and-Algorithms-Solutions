package sum_of_n_natural_numbers;

import java.util.Scanner;

public class SumOfNNaturalNumbersFormula {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter a number to calculate the sum of natural numbers : ");
		int input = scanner.nextInt();
		int sumOfNNaturalNumbers = sumOfNNaturalNumbersFormula(input);
		System.out.println("The sum of the natural numbers for the given input is : " + sumOfNNaturalNumbers);
		scanner.close();

	}

	public static int sumOfNNaturalNumbersFormula(int input) {
		int sum = ((input) * (input + 1)) / 2;
		return sum;
	}
}
