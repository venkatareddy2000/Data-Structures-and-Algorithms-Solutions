package half_diamond_star;

import java.util.Scanner;

public class HalfDiamondStar {
	public static void main(String[] args) {
		int size;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the size of the Half Diamond Star : ");
		size = scanner.nextInt();
		printHalfDiamondStar(size);
		scanner.close();

	}

	static void printHalfDiamondStar(int size) {
		for (int row = 1; row <= size; row++) {
			for (int column = 1; column <= row; column++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for (int row = size - 1; row >= 1; row--) {
			for (int column = 1; column <= row; column++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
