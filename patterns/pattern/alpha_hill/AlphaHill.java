package alpha_hill;

import java.util.Scanner;

public class AlphaHill {
	public static void main(String[] args) {
		int size;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the size of the Alpha Hill : ");
		size = scanner.nextInt();
		printAlphaHill(size);
		scanner.close();

	}

	static void printAlphaHill(int size) {
		for (int row = 0; row < size; row++) {
			for (int space = 0; space < size - row - 1; space++) {
				System.out.print(" ");
			}
			for (int column = 0; column <= row; column++) {
				System.out.print((char) ('A' + column));
			}
			for (int column = row - 1; column >= 0; column--) {
				System.out.print((char) ('A' + column));
			}
			System.out.println();
		}
	}
}
