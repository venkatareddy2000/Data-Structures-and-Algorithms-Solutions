package symmetric_butterfly;

import java.util.Scanner;

public class SymmetricButterfly {
	public static void main(String[] args) {
		int size;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the size of the Symmetric Butterfly : ");
		size = scanner.nextInt();
		printSymmetricButterfly(size);
		scanner.close();

	}

	static void printSymmetricButterfly(int size) {
		for (int row = 1; row <= size; row++) {
			for (int column = 1; column <= row; column++) {
				System.out.print("*");
			}
			for (int spaces = 1; spaces <= (2 * size) - (row * 2); spaces++) {
				System.out.print(" ");
			}
			for (int column = 1; column <= row; column++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int row = size - 1; row >= 1; row--) {
			for (int column = 1; column <= row; column++) {
				System.out.print("*");
			}
			for (int spaces = 1; spaces <= (2 * size) - (row * 2); spaces++) {
				System.out.print(" ");
			}
			for (int column = 1; column <= row; column++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
