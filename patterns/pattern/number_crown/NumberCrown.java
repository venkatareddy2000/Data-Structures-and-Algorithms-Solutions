package number_crown;

import java.util.Scanner;

public class NumberCrown {
	public static void main(String[] args) {
		int size;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the size of the Number Crown : ");
		size = scanner.nextInt();
		printNumberCrown(size);
		scanner.close();

	}

	static void printNumberCrown(int size) {
		for (int row = 1; row <= size; row++) {
			for (int column = 1; column <= row; column++) {
				System.out.print(column);
			}
			for (int space = 0; space < (size * 2) - (row * 2); space++) {
				System.out.print(" ");
			}
			for (int column = row; column >= 1; column--) {
				System.out.print(column);
			}
			System.out.println();
		}
	}
}
