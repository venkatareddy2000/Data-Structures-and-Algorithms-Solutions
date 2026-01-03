package increasing_letter_triangle;

import java.util.Scanner;

public class IncreasingLetterTriangle {
	public static void main(String[] args) {
		int size;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the size of the Increasing Letter Triangle : ");
		size = scanner.nextInt();
		printIncreasingLetterTriangle(size);
		scanner.close();

	}

	static void printIncreasingLetterTriangle(int size) {
		for (int row = 0; row < size; row++) {
			for (int column = 0; column <= row; column++) {
				System.out.print((char) (column + 'A') + " ");
			}
			System.out.println();
		}
	}
}
