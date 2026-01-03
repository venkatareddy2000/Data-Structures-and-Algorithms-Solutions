package inverted_number_pyramid;

import java.util.Scanner;

public class InvertedNumberPyramid {
	public static void main(String[] args) {
		int size;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the size of the Inverted Number Pyramid : ");
		size = scanner.nextInt();
		printInvertedNumberPyramid(size);
		scanner.close();

	}

	static void printInvertedNumberPyramid(int size) {
		for (int row = size; row >= 1; row--) {
			for (int column = 1; column <= row; column++) {
				System.out.print(column + " ");
			}
			System.out.println();
		}
	}
}
