package alpha_ramp;

import java.util.Scanner;

public class AlphaRamp {
	public static void main(String[] args) {
		int size;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the size of the Alpha Ramp : ");
		size = scanner.nextInt();
		printAlphaRamp(size);
		scanner.close();

	}

	static void printAlphaRamp(int size) {
		for (int row = 0; row < size; row++) {
			for (char column = 0; column <= row; column++) {
				System.out.print((char) ('A' + row) + " ");
			}
			System.out.println();
		}
	}
}
