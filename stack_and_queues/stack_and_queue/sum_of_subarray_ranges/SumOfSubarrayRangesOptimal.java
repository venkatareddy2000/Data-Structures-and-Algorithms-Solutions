package sum_of_subarray_ranges;

import java.util.Scanner;
import java.util.Stack;

public class SumOfSubarrayRangesOptimal {
	public static long subArrayRanges(int[] nums) {
		return sumofSubarrayMaximum(nums) - sumOfSubarrayMinimum(nums);
	}

	public static long sumOfSubarrayMinimum(int[] arr) {
		long sum = 0;
		int[] nse = nextSmallerElement(arr);
		int[] pse = previousSmallerElement(arr);
		for (int index = 0; index < arr.length; index++) {
			long left = index - pse[index];
			long right = nse[index] - index;
			sum = sum + (left * right * arr[index]);
		}
		return sum;
	}

	public static long sumofSubarrayMaximum(int[] arr) {
		long sum = 0;
		int[] nge = nextGreaterElement(arr);
		int[] pge = previousGreaterElement(arr);
		for (int index = 0; index < arr.length; index++) {
			long left = index - pge[index];
			long right = nge[index] - index;
			sum = sum + (left * right * arr[index]);
		}
		return sum;
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

	private static int[] previousGreaterElement(int[] arr) {
		int[] pge = new int[arr.length];
		Stack<Integer> stack = new Stack<Integer>();
		for (int index = 0; index < arr.length; index++) {
			while (!stack.empty() && arr[stack.peek()] < arr[index]) {
				stack.pop();
			}
			pge[index] = stack.empty() ? -1 : stack.peek();
			stack.push(index);
		}
		return pge;
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

	private static int[] nextGreaterElement(int[] arr) {
		int[] nge = new int[arr.length];
		Stack<Integer> stack = new Stack<Integer>();
		for (int index = arr.length - 1; index >= 0; index--) {
			while (!stack.empty() && arr[stack.peek()] <= arr[index]) {
				stack.pop();
			}
			nge[index] = stack.empty() ? arr.length : stack.peek();
			stack.push(index);

		}
		return nge;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of the array : ");
		int size = scanner.nextInt();
		int[] nums = new int[size];
		System.out.println("Enter the elements into the nums : ");
		for (int index = 0; index < size; index++) {
			nums[index] = scanner.nextInt();
		}
		long sumOfSubarrayMinimumsAndMaximums = subArrayRanges(nums);
		System.out.println("Sum of maximum and minimum subarrays : " + sumOfSubarrayMinimumsAndMaximums);
		scanner.close();
	}
}
