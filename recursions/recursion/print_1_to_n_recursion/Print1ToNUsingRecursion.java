package print_1_to_n_recursion;

import java.util.Scanner;

public class Print1ToNUsingRecursion {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the maxNumber you want to print : ");
		int maxNumber = scanner.nextInt();
		int counter = 1;
		print1ToNUsingRecursion(counter, maxNumber);
		scanner.close();
	}

	private static void print1ToNUsingRecursion(int counter, int maxNumber) {
		if (counter > maxNumber)
			return;
		System.out.print(counter + " ");
		print1ToNUsingRecursion(counter + 1, maxNumber);
	}

}
