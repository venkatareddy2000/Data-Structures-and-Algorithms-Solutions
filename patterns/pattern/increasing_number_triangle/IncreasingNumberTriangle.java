package increasing_number_triangle;

import java.util.Scanner;

public class IncreasingNumberTriangle {
	public static void main(String[] args) {
		int size;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the size of the Increasing Number Triangle : ");
		size = scanner.nextInt();
		printIncreasingNumberTriangle(size);
		scanner.close();

	}

	static void printIncreasingNumberTriangle(int size) {
		int start = 1;
		for (int row = 1; row <= size; row++) {
			for (int column = 1; column <= row; column++) {
				System.out.print(start + " ");
				start++;
			}
			System.out.println();
		}
	}
}
