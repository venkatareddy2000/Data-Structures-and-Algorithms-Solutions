package print_1_to_n_recursion;

import java.util.Scanner;

public class Print1ToNUsingBacktracking {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the maxNumber you want to print : ");
		int maxNumber = scanner.nextInt();
		int counter = maxNumber;
		print1ToNUsingBacktracking(counter, maxNumber);
		scanner.close();
	}

	private static void print1ToNUsingBacktracking(int counter, int maxNumber) {
		if (counter < 1)
			return;
		print1ToNUsingBacktracking(counter - 1, maxNumber);
		System.out.print(counter + " ");
	}

}
