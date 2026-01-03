package diamond_star;

import java.util.Scanner;

public class DiamondStar {
	public static void main(String[] args) {
		int size;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the size of the Diamond Star : ");
		size = scanner.nextInt();
		printDiamondStar(size);
		scanner.close();

	}

	static void printDiamondStar(int size) {
		for (int row = 0; row < size; row++) {
			for (int space = 0; space < size - row - 1; space++) {
				System.out.print(" ");
			}
			for (int star = 0; star < row * 2 + 1; star++) {
				System.out.print("*");
			}
			System.out.println();
		}
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
