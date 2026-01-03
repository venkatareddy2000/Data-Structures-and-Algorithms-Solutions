package hollow_rectangle;

import java.util.Scanner;

public class HollowRectangle {
	public static void main(String[] args) {
		int size;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the size of the Hollow Rectangle : ");
		size = scanner.nextInt();
		printHollowRectangle(size);
		scanner.close();

	}

	static void printHollowRectangle(int size) {
		for (int row = 1; row <= size; row++) {
			for (int column = 1; column <= size; column++) {
				if (row == 1 || column == 1 || row == size || column == size) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
