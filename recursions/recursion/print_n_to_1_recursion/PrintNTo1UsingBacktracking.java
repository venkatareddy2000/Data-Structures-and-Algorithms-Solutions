package print_n_to_1_recursion;

import java.util.Scanner;

public class PrintNTo1UsingBacktracking {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the maxNumber you want to print : ");
		int maxNumber = scanner.nextInt();
		int counter = 1;
		printNTo1UsingBacktracking(counter, maxNumber);
		scanner.close();
	}

	private static void printNTo1UsingBacktracking(int counter, int maxNumber) {
		if (counter > maxNumber)
			return;
		printNTo1UsingBacktracking(counter + 1, maxNumber);
		System.out.print(counter + " ");
	}

}
