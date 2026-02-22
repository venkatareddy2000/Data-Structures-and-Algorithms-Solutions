package largest_rectangle_in_histogram;

import java.util.Scanner;

public class LargestRectangleInHistogramBrute {
	public static int largestRectangleArea(int[] heights) {
		int maxArea = Integer.MIN_VALUE;
		for (int index = 0; index < heights.length; index++) {
			int left = index;
			while (left >= 0 && heights[left] >= heights[index]) {
				left--;
			}
			int right = index;
			while (right < heights.length && heights[right] >= heights[index]) {
				right++;
			}
			int width = right - left - 1;
			maxArea = Math.max(maxArea, width * heights[index]);
		}
		return maxArea;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of the array : ");
		int size = scanner.nextInt();
		int[] height = new int[size];
		System.out.println("Enter the elements into the height : ");
		for (int index = 0; index < size; index++) {
			height[index] = scanner.nextInt();
		}
		int largestRectangle = largestRectangleArea(height);
		System.out.println("Largest rectangle in the histogram area : " + largestRectangle);
		scanner.close();
	}
}
