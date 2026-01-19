package longest_subarray_with_given_sum_k_positives;

import java.util.HashMap;
import java.util.Scanner;

public class LongestSubarrayWithGivenSumKBetterHashing {
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
		int longestSubarray = longestSubarrayWithGivenSumKBetterHashing(nums, K);
		System.out.println("The longest subarray with given sum K : " + longestSubarray);
		scanner.close();
	}

	private static int longestSubarrayWithGivenSumKBetterHashing(int[] nums, int K) {
		int longestSubarray = 0;
		int prefixSum = 0;
		HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
		for (int index = 0; index < nums.length; index++) {
			prefixSum = prefixSum + nums[index];
			if (prefixSum == K) {
				if (index + 1 > longestSubarray) {
					longestSubarray = index + 1;
				}
			}
			if (hashMap.containsKey(prefixSum - K)) {
				if (index - hashMap.get(prefixSum - K) > longestSubarray) {
					longestSubarray = index - hashMap.get(prefixSum - K);
				}
			}
			if (!hashMap.containsKey(prefixSum)) {
				hashMap.put(prefixSum, index);
			}
		}
		return longestSubarray;
	}
}
