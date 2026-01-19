package longest_subarray_with_given_sum_k_positives;

import java.util.Scanner;

public class LongestSubarrayWithGivenSumKOptimal {
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
		int longestSubarray = longestSubarrayWithGivenSumKOptimal(nums, K);
		System.out.println("The longest subarray with given sum K : " + longestSubarray);
		scanner.close();
	}

	private static int longestSubarrayWithGivenSumKOptimal(int[] nums, int K) {
		int longestSubarray = 0;
		int sum = 0;
		int start = 0, end = 0;
		{
			while (end < nums.length) {
				sum = sum + nums[end];
				while (sum > K) {
					sum = sum - nums[start];
					start++;
				}
				if (sum == K) {
					if ((end - start + 1) > longestSubarray) {
						longestSubarray = end - start + 1;
					}
				}
				end++;
			}
		}
		return longestSubarray;
	}
}
