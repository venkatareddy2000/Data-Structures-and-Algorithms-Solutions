package sum_of_subarray_minimums;

import java.util.Scanner;

public class SumOfSubarrayMinimumsBrute {
	public static int sumSubarrayMins(int[] arr) {
		int sum = 0;
		int mod = (int) 1e9 + 7;
		for (int outerIndex = 0; outerIndex < arr.length; outerIndex++) {
			int minimum = Integer.MAX_VALUE;
			for (int innerIndex = outerIndex; innerIndex < arr.length; innerIndex++) {
				if (arr[innerIndex] < minimum) {
					minimum = arr[innerIndex];
				}
				sum = (sum + minimum) % mod;
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of the array : ");
		int size = scanner.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter the elements into the height : ");
		for (int index = 0; index < size; index++) {
			arr[index] = scanner.nextInt();
		}
		int sumOfSubarrayMinimums = sumSubarrayMins(arr);
		System.out.println("Number of units of water : " + sumOfSubarrayMinimums);
		scanner.close();
	}

}
