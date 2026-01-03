package right_angled_number_pyramid_II;

import java.util.Scanner;

public class RightAngledNumberPyramidII {
	public static void main(String[] args) {
		int size;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the size of the Right Angled Number Pyramid - II : ");
		size = scanner.nextInt();
		printRightNumberPyramidII(size);
		scanner.close();

	}

	static void printRightNumberPyramidII(int size) {
		for (int row = 1; row <= size; row++) {
			for (int column = 1; column <= row; column++) {
				System.out.print(row + " ");
			}
			System.out.println();
		}
	}
}
