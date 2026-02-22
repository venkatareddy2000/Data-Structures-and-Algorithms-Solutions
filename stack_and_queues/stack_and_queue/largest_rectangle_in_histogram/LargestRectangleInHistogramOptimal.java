package largest_rectangle_in_histogram;

import java.util.Scanner;
import java.util.Stack;

public class LargestRectangleInHistogramOptimal {
	public static int maximalRectangle(char[][] matrix) {
		if (matrix.length == 0) {
			return 0;
		}
		int m = matrix[0].length;
		int[] height = new int[m];
		int maxArea = 0;
		for (char[] row : matrix) {
			for (int i = 0; i < m; i++) {
				if (row[i] == '1')
					height[i]++;
				else
					height[i] = 0;
			}
			maxArea = Math.max(maxArea, largestRectangleArea(height));
		}

		return maxArea;
	}

	public static int largestRectangleArea(int[] heights) {
		int maxArea = Integer.MIN_VALUE;
		int[] nse = nextSmallerElement(heights);
		int[] pse = previousSmallerElement(heights);
		for (int index = 0; index < heights.length; index++) {
			int width = nse[index] - pse[index] - 1;
			maxArea = Math.max(maxArea, width * heights[index]);
		}
		return maxArea;
	}

	private static int[] previousSmallerElement(int[] arr) {
		int[] pse = new int[arr.length];
		Stack<Integer> stack = new Stack<Integer>();
		for (int index = 0; index < arr.length; index++) {
			while (!stack.empty() && arr[stack.peek()] > arr[index]) {
				stack.pop();
			}
			pse[index] = stack.empty() ? -1 : stack.peek();
			stack.push(index);
		}
		return pse;
	}

	private static int[] nextSmallerElement(int[] arr) {
		int[] nse = new int[arr.length];
		Stack<Integer> stack = new Stack<Integer>();
		for (int index = arr.length - 1; index >= 0; index--) {
			while (!stack.empty() && arr[stack.peek()] >= arr[index]) {
				stack.pop();
			}
			nse[index] = stack.empty() ? arr.length : stack.peek();
			stack.push(index);

		}
		return nse;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of the row : ");
		int row = scanner.nextInt();
		System.out.println("Enter the size of the col : ");
		int col = scanner.nextInt();
		char[][] matrix = new char[row][col];
		System.out.println("Enter the elements into the height : ");
		for (int outerIndex = 0; outerIndex < row; outerIndex++) {
			for (int innerIndex = 0; innerIndex < col; innerIndex++) {
				matrix[outerIndex][innerIndex] = scanner.next().charAt(0);
			}
		}
		int largestRectangle = maximalRectangle(matrix);
		System.out.println("Largest rectangle in the histogram area : " + largestRectangle);
		scanner.close();
	}
}
