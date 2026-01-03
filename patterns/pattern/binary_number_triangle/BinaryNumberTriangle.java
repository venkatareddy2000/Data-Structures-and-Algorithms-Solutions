package binary_number_triangle;

import java.util.Scanner;

public class BinaryNumberTriangle {
	public static void main(String[] args) {
		int size;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the size of the Binary Number Triangle : ");
		size = scanner.nextInt();
		printBinaryNumberTriangle(size);
		scanner.close();

	}

	static void printBinaryNumberTriangle(int size) {
		int start = 1;
		for (int row = 1; row <= size; row++) {
			if (row % 2 == 0) {
				start = 0;
			} else {
				start = 1;
			}
			for (int column = 1; column <= row; column++) {
				System.out.print(start + " ");
				start = 1 - start;
			}
			System.out.println();
		}
	}
}
