package spiral_matrix;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SpiralMatrix {
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
		List<Integer> spiralOrder = spiralOrder(matrix);
		System.out.println("The matrix elements in the spiral manner : " + spiralOrder);
		scanner.close();
	}

	private static List<Integer> spiralOrder(int[][] matrix) {
		List<Integer> arrayList = new ArrayList<Integer>();
		int top = 0, left = 0, right = matrix[0].length - 1, bottom = matrix.length - 1;
		while (top <= bottom && left <= right) {
			for (int index = left; index <= right; index++) {
				arrayList.add(matrix[top][index]);
			}
			top++;
			for (int index = top; index <= bottom; index++) {
				arrayList.add(matrix[index][right]);
			}
			right--;
			if (top <= bottom) {
				for (int index = right; index >= left; index--) {
					arrayList.add(matrix[bottom][index]);
				}
			}
			bottom--;
			if (left <= right) {
				for (int index = bottom; index >= top; index--) {
					arrayList.add(matrix[index][left]);
				}
			}
			left++;
		}
		return arrayList;
	}
}
