package largest_subarray_with_0_sum;

import java.util.Scanner;

public class LargestSubarrayWith0SumBetter {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of the array : ");
		int size = scanner.nextInt();
		int[] nums = new int[size];
		System.out.println("Enter the elements into the array : ");
		for (int index = 0; index < size; index++) {
			nums[index] = scanner.nextInt();
		}
		int largestSubarray = largestSubarrayWith0SumBetter(nums);
		System.out.println("The largest subarray with 0 sum is : " + largestSubarray);
		scanner.close();
	}

	public static int largestSubarrayWith0SumBetter(int[] nums) {
		int largestSubarray = Integer.MIN_VALUE;
		for (int outerIndex = 0; outerIndex < nums.length - 1; outerIndex++) {
			int sum = nums[outerIndex];
			for (int innerIndex = outerIndex + 1; innerIndex < nums.length; innerIndex++) {
				sum = sum + nums[innerIndex];
				if ((sum == 0) && ((innerIndex - outerIndex + 1) > largestSubarray)) {
					largestSubarray = innerIndex - outerIndex + 1;
				}
			}
		}
		return largestSubarray;
	}
}
