package rotate_matrix;

import java.util.Scanner;

public class RotateMatrixBrute {
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
		int[][] rotate = rotate(matrix);
		System.out.println("Matrix after rotating to 90 degrees : ");
		for (int row = 0; row < rows; row++) {
			for (int column = 0; column < columns; column++) {
				System.out.print(rotate[row][column] + " ");
			}
			System.out.println();
		}
		scanner.close();
	}

	public static int[][] rotate(int[][] matrix) {
		int[][] result = new int[matrix.length][matrix[0].length];
		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix[row].length; col++) {
				result[col][matrix.length - row - 1] = matrix[row][col];
			}
		}
		return result;
	}
}
