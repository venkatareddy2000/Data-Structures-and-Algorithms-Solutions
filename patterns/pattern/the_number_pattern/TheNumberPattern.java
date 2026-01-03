package the_number_pattern;

import java.util.Scanner;

public class TheNumberPattern {
	public static void main(String[] args) {
		int size;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the size of the Number Pattern : ");
		size = scanner.nextInt();
		theNumberPattern(size);
		scanner.close();
	}

	static void theNumberPattern(int size) {
		for (int row = 0; row < (2 * size) - 1; row++) {
			for (int col = 0; col < (2 * size) - 1; col++) {
				int top = row;
				int left = col;
				int right = (2 * size - 2) - col;
				int bottom = (2 * size - 2) - row;
				int minimumDistance = Math.min(Math.min(top, left), Math.min(bottom, right));
				System.out.print(size - minimumDistance + " ");
			}
			System.out.println();
		}
	}
}
