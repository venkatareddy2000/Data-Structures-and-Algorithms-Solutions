package reverse_letter_triangle;

import java.util.Scanner;

public class ReverseLetterTriangle {
	public static void main(String[] args) {
		int size;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the size of the Reverse Letter Triangle : ");
		size = scanner.nextInt();
		printReverseLetterTriangle(size);
		scanner.close();

	}

	static void printReverseLetterTriangle(int size) {
		for (int row = size - 1; row >= 0; row--) {
			for (int column = 0; column <= row; column++) {
				System.out.print((char) ('A' + column) + " ");
			}
			System.out.println();
		}
	}
}
