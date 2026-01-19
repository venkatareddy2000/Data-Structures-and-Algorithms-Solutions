package print_subarray_with_maximum_subarray_sum;

import java.util.Scanner;

public class PrintSubarrayWithMaximumSubarraySumOptimal {
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
		int sum = 0;
		int startIndex = -1;
		int endIndex = -1;
		int start = -1;
		for (int index = 0; index < nums.length; index++) {
			if (sum == 0) {
				start = index;
			}
			sum = sum + nums[index];
			if (sum > largestSum) {
				largestSum = sum;
				startIndex = start;
				endIndex = index;
			}
			if (sum < 0) {
				sum = 0;
			}
		}
		System.out.print("The subarray with maximum sum : ");
		for (int index = startIndex; index <= endIndex; index++) {
			System.out.print(nums[index] + " ");
		}
	}
}
