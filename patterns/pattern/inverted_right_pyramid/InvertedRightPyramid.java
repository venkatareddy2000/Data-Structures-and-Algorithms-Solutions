package inverted_right_pyramid;

import java.util.Scanner;

public class InvertedRightPyramid {
	public static void main(String[] args) {
		int size;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the size of the Inverted Right Pyramid : ");
		size = scanner.nextInt();
		printInvertedRightPyramid(size);
		scanner.close();

	}

	static void printInvertedRightPyramid(int size) {
		for (int row = size; row >= 1; row--) {
			for (int column = 1; column <= row; column++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
