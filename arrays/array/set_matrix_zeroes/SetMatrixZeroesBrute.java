package set_matrix_zeroes;

import java.util.Scanner;

public class SetMatrixZeroesBrute {
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
		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix[row].length; col++) {
				if (matrix[row][col] == 0) {
					markRow(matrix, row);
					markColumn(matrix, col);
				}
			}
		}
		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix[row].length; col++) {
				if (matrix[row][col] == -1) {
					matrix[row][col] = 0;
				}
			}
		}
	}

	public static void markRow(int[][] matrix, int row) {
		for (int index = 0; index < matrix[row].length; index++) {
			if (matrix[row][index] != 0) {
				matrix[row][index] = -1;
			}
		}

	}

	public static void markColumn(int[][] matrix, int col) {
		for (int index = 0; index < matrix.length; index++) {
			if (matrix[index][col] != 0) {
				matrix[index][col] = -1;
			}
		}
	}
}
