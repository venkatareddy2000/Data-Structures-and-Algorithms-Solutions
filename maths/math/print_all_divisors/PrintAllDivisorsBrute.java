package print_all_divisors;

import java.util.Scanner;

public class PrintAllDivisorsBrute {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the input number to find all divisors : ");
		int number = scanner.nextInt();
		printAllDivisors(number);
		scanner.close();
	}

	private static void printAllDivisors(int number) {
		System.out.print("All Divisors of the given input number : ");
		for (int index = 1; index <= number; index++) {
			if (number % index == 0) {
				System.out.print(index + " ");
			}
		}
	}
}
