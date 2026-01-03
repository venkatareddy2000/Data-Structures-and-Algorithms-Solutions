package star_pyramid;

import java.util.Scanner;

public class StarPyramid {
	public static void main(String[] args) {
		int size;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the size of the Star Pyramid : ");
		size = scanner.nextInt();
		printStarPyramid(size);
		scanner.close();

	}

	static void printStarPyramid(int size) {
		for (int row = 0; row < size; row++) {
			for (int space = 0; space < size - row - 1; space++) {
				System.out.print(" ");
			}
			for (int star = 0; star < row * 2 + 1; star++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
