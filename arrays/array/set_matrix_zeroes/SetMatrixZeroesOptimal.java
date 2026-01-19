package set_matrix_zeroes;

import java.util.Scanner;

public class SetMatrixZeroesOptimal {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of rows in the array : ");
		int rows = scanner.nextInt();
		System.out.println("Enter the number of columns in the array : ");
		int columns = scanner.nextInt();
		int[][] matrix = new int[rows][columns];
		System.out.println("Enter the elements into the array : ");
		for (int row = 0; row < rows; row++) {
			for (int column = 0; column < columns; column++) {
				matrix[row][column] = scanner.nextInt();
			}
		}
		setZeroes(matrix);
		System.out.println("Matrix after setting to zero : ");
		for (int row = 0; row < rows; row++) {
			for (int column = 0; column < columns; column++) {
				System.out.print(matrix[row][column] + " ");
			}
			System.out.println();
		}
		scanner.close();
	}

	public static void setZeroes(int[][] matrix) {
		int col0 = 1;
		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix[row].length; col++) {
				if (matrix[row][col] == 0) {
					matrix[0][col] = 0;
					if (col != 0) {
						matrix[row][0] = 0;
					} else {
						col0 = 0;
					}
				}
			}
		}
		for (int row = 1; row < matrix.length; row++) {
			for (int col = 1; col < matrix[row].length; col++) {
				if (matrix[row][col] != 0) {
					if (matrix[0][col] == 0 || matrix[row][0] == 0) {
						matrix[row][col] = 0;
					}
				}
			}
		}
		if (matrix[0][0] == 0) {
			for (int col = 0; col < matrix[0].length; col++) {
				matrix[0][col] = 0;
			}
		}
		if (col0 == 0) {
			for (int row = 0; row < matrix.length; row++) {
				matrix[row][0] = 0;
			}
		}
	}
}
