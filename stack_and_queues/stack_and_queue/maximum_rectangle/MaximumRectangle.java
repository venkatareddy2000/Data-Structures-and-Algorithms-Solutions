package maximum_rectangle;

import java.util.Stack;

public class MaximumRectangle {
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
}
