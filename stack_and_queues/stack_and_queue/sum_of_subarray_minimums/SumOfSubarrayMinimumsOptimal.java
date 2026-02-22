package sum_of_subarray_minimums;

import java.util.Scanner;
import java.util.Stack;

public class SumOfSubarrayMinimumsOptimal {
	public static int sumSubarrayMins(int[] arr) {
		long sum = 0;
		long mod = (int) 1e9 + 7;
		int[] nse = nextSmallerElement(arr);
		int[] pse = previousSmallerElement(arr);
		for (int index = 0; index < arr.length; index++) {
			long left = index - pse[index];
			long right = nse[index] - index;
			sum = (sum + (left * right * arr[index]) % mod) % mod;
		}
		return (int) sum;
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
		System.out.println("Enter the size of the array : ");
		int size = scanner.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter the elements into the arr : ");
		for (int index = 0; index < size; index++) {
			arr[index] = scanner.nextInt();
		}
		int sumOfSubarrayMinimums = sumSubarrayMins(arr);
		System.out.println("Number of units of water : " + sumOfSubarrayMinimums);
		scanner.close();
	}

}
