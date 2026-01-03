package print_n_to_1_recursion;

import java.util.Scanner;

public class PrintNTo1UsingRecursion {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the maxNumber you want to print : ");
		int maxNumber = scanner.nextInt();
		int counter = maxNumber;
		printNTo1UsingRecursion(counter, maxNumber);
		scanner.close();
	}

	private static void printNTo1UsingRecursion(int counter, int maxNumber) {
		if (counter < 1)
			return;
		System.out.print(counter + " ");
		printNTo1UsingRecursion(counter - 1, maxNumber);
	}

}
