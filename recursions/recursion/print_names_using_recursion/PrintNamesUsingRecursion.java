package print_names_using_recursion;

import java.util.Scanner;

public class PrintNamesUsingRecursion {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter how many times you want to print the name : ");
		int timesToPrint = scanner.nextInt();
		int counter = 1;
		printNamesUsingRecursion(counter, timesToPrint);
		scanner.close();
	}

	private static void printNamesUsingRecursion(int counter, int timesToPrint) {
		if (counter > timesToPrint)
			return;
		System.out.println("Challa Venkata Reddy");
		printNamesUsingRecursion(counter + 1, timesToPrint);
	}

}
