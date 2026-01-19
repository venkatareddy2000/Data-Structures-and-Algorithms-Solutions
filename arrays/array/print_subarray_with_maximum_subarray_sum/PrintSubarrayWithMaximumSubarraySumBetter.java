package print_subarray_with_maximum_subarray_sum;

import java.util.Scanner;

public class PrintSubarrayWithMaximumSubarraySumBetter {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of the array : ");
		int size = scanner.nextInt();
		int[] nums = new int[size];
		System.out.println("Enter the elements into the array : ");
		for (int index = 0; index < size; index++) {
			nums[index] = scanner.nextInt();
		}
		maxSubArray(nums);
		scanner.close();
	}

	public static void maxSubArray(int[] nums) {
		int largestSum = Integer.MIN_VALUE;
		int startIndex = -1;
		int endIndex = -1;
		for (int outerIndex = 0; outerIndex < nums.length; outerIndex++) {
			int sum = 0;
			for (int innerIndex = outerIndex; innerIndex < nums.length; innerIndex++) {
				sum = sum + nums[innerIndex];
				if (sum > largestSum) {
					largestSum = sum;
					startIndex = outerIndex;
					endIndex = innerIndex;
				}
			}
		}
		System.out.print("The subarray with maximum sum : ");
		for (int index = startIndex; index <= endIndex; index++) {
			System.out.print(nums[index] + " ");
		}
	}
}
