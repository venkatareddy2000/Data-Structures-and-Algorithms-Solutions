package right_angled_triangle;

import java.util.Scanner;

public class RightAngledTriangle {
	public static void main(String[] args) {
		int size;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the size of the Right Angled Triangle : ");
		size = scanner.nextInt();
		printRightAngledTriangle(size);
		scanner.close();

	}

	static void printRightAngledTriangle(int size) {
		for (int row = 1; row <= size; row++) {
			for (int column = 1; column <= row; column++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
