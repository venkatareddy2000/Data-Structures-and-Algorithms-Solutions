package sum_of_n_natural_numbers;

import java.util.Scanner;

public class SumOfNNaturalNumbersBrute {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter a number to calculate the sum of natural numbers : ");
		int input = scanner.nextInt();
		int sumOfNNaturalNumbers = sumOfNNaturalNumbersBrute(input);
		System.out.println("The sum of the natural numbers for the given input is : " + sumOfNNaturalNumbers);
		scanner.close();

	}

	public static int sumOfNNaturalNumbersBrute(int input) {
		int sum = 0;
		for (int index = 1; index <= input; index++) {
			sum = sum + index;
		}
		return sum;
	}
}
