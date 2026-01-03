package alpha_triangle;

import java.util.Scanner;

public class AlphaTriangle {
	public static void main(String[] args) {
		int size;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the size of the Alpha Triangle : ");
		size = scanner.nextInt();
		printAlphaTriangle(size);
		scanner.close();

	}

	static void printAlphaTriangle(int size) {
		for (int row = size - 1; row >= 0; row--) {
			for (int column = row; column < size; column++) {
				System.out.print((char) ('A' + column) + " ");
			}
			System.out.println();
		}
	}
}
