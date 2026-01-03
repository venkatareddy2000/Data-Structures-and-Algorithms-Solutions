package rectangular_star;

import java.util.Scanner;

public class RectangularStar {
	public static void main(String[] args) {
		int size;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the size of the Rectangular : ");
		size = scanner.nextInt();
		printRectangularStar(size);
		scanner.close();
	}

	static void printRectangularStar(int size) {
		for (int row = 1; row <= size; row++) {
			for (int column = 1; column <= size; column++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
