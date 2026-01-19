package maximum_subarray;

import java.util.Scanner;

public class MaximumSubarrayBrute {
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
		if (nums.length == 1) {
			return nums[0];
		}
		int largestSum = Integer.MIN_VALUE;
		for (int outerIndex = 0; outerIndex < nums.length; outerIndex++) {
			for (int innerIndex = outerIndex; innerIndex < nums.length; innerIndex++) {
				int sum = 0;
				for (int thirdLoop = outerIndex; thirdLoop <= innerIndex; thirdLoop++) {
					sum = sum + nums[thirdLoop];
				}
				if (sum > largestSum) {
					largestSum = sum;
				}
			}
		}
		return largestSum;
	}
}
