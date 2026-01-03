package symmetric_void;

import java.util.Scanner;

public class SymmetricVoid {
	public static void main(String[] args) {
		int size;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the size of the Symmetric Void : ");
		size = scanner.nextInt();
		printSymmetricVoid(size);
		scanner.close();

	}

	static void printSymmetricVoid(int size) {
		for (int row = size; row >= 1; row--) {
			for (int column = 1; column <= row; column++) {
				System.out.print("*");
			}
			for (int spaces = 1; spaces <= 2 * (size - row); spaces++) {
				System.out.print(" ");
			}
			for (int column = 1; column <= row; column++) {
				System.out.print("*");
			}
			System.out.println();

		}
		for (int row = 1; row <= size; row++) {
			for (int column = 1; column <= row; column++) {
				System.out.print("*");
			}
			for (int spaces = 1; spaces <= 2 * (size - row); spaces++) {
				System.out.print(" ");
			}
			for (int column = 1; column <= row; column++) {
				System.out.print("*");
			}
			System.out.println();

		}
	}
}
