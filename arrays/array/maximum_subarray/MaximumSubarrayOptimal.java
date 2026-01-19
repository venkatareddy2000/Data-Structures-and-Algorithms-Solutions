package maximum_subarray;

import java.util.Scanner;

public class MaximumSubarrayOptimal {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of the array : ");
		int size = scanner.nextInt();
		int[] nums = new int[size];
		System.out.println("Enter the elements into the array : ");
		for (int index = 0; index < size; index++) {
			nums[index] = scanner.nextInt();
		}
		int longestSubarraySum = maxSubArray(nums);
		System.out.println("The longest subarray sum is : " + longestSubarraySum);
		scanner.close();
	}

	public static int maxSubArray(int[] nums) {
		int largestSum = Integer.MIN_VALUE;
		int sum = 0;
		for (int index = 0; index < nums.length; index++) {
			sum = sum + nums[index];
			if (sum > largestSum) {
				largestSum = sum;
			}
			if (sum < 0) {
				sum = 0;
			}
		}
		return largestSum;
	}
}
