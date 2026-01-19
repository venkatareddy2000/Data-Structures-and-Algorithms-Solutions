package longest_subarray_with_given_sum_k_positives;

import java.util.Scanner;

public class LongestSubarrayWithGivenSumKBrute {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of the array : ");
		int size = scanner.nextInt();
		int[] nums = new int[size];
		System.out.println("Enter the elements into the array : ");
		for (int index = 0; index < size; index++) {
			nums[index] = scanner.nextInt();
		}
		System.out.println("Enter the sum value : ");
		int K = scanner.nextInt();
		int longestSubarray = longestSubarrayWithGivenSumKBrute(nums, K);
		System.out.println("The longest subarray with given sum K : " + longestSubarray);
		scanner.close();
	}

	private static int longestSubarrayWithGivenSumKBrute(int[] nums, int K) {
		int longestSubarray = 0;
		for (int outerIndex = 0; outerIndex < nums.length; outerIndex++) {
			for (int innerIndex = outerIndex; innerIndex < nums.length; innerIndex++) {
				int sum = 0;
				for (int thirdLoop = outerIndex; thirdLoop <= innerIndex; thirdLoop++) {
					sum = sum + nums[thirdLoop];
				}
				if (sum == K) {
					if ((innerIndex - outerIndex + 1) > longestSubarray) {
						longestSubarray = innerIndex - outerIndex + 1;
					}
				}
			}
		}
		return longestSubarray;
	}
}
