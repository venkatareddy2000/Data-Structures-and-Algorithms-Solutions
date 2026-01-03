package inverted_star_pyramid;

import java.util.Scanner;

public class InvertedStarPyramid {
	public static void main(String[] args) {
		int size;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the size of the Inverted Star Pyramid : ");
		size = scanner.nextInt();
		printInvertedStarPyramid(size);
		scanner.close();

	}

	static void printInvertedStarPyramid(int size) {
		for (int row = size; row > 0; row--) {
			for (int space = 0; space < size - row; space++) {
				System.out.print(" ");
			}
			for (int star = 0; star < row * 2 - 1; star++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
