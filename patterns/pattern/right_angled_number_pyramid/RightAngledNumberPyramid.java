package right_angled_number_pyramid;

import java.util.Scanner;

public class RightAngledNumberPyramid {
	public static void main(String[] args) {
		int size;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the size of the Right Angled Number Pyramid : ");
		size = scanner.nextInt();
		printRightNumberPyramid(size);
		scanner.close();

	}

	static void printRightNumberPyramid(int size) {
		for (int row = 1; row <= size; row++) {
			for (int column = 1; column <= row; column++) {
				System.out.print(column + " ");
			}
			System.out.println();
		}
	}
}
