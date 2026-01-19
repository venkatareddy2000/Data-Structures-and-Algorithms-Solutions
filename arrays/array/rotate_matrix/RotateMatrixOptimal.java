package rotate_matrix;

import java.util.Scanner;

public class RotateMatrixOptimal {
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
		rotate(matrix);
		System.out.println("Matrix after rotating to 90 degrees : ");
		for (int row = 0; row < rows; row++) {
			for (int column = 0; column < columns; column++) {
				System.out.print(matrix[row][column] + " ");
			}
			System.out.println();
		}
		scanner.close();
	}

	public static void rotate(int[][] matrix) {
		for (int row = 0; row < matrix.length; row++) {
			for (int col = row + 1; col < matrix[row].length; col++) {
				int temp = matrix[row][col];
				matrix[row][col] = matrix[col][row];
				matrix[col][row] = temp;
			}
		}
		for (int row = 0; row < matrix.length; row++) {
			int start = 0, end = matrix.length - 1;
			while (start <= end) {
				int temp = matrix[row][start];
				matrix[row][start] = matrix[row][end];
				matrix[row][end] = temp;
				start++;
				end--;
			}
		}
	}
}
