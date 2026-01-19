package subarray_sum_equals_k;

import java.util.HashMap;
import java.util.Scanner;

public class SubarraySumEqualsKOptimal {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of the array : ");
		int size = scanner.nextInt();
		int[] nums = new int[size];
		System.out.println("Enter the elements into the array : ");
		for (int index = 0; index < size; index++) {
			nums[index] = scanner.nextInt();
		}
		System.out.println("Enter the k value : ");
		int k = scanner.nextInt();
		int totalSubarray = subarraySum(nums, k);
		System.out.println("The total number of subarrays whose sum is equal to k is : " + totalSubarray);
		scanner.close();
	}

	public static int subarraySum(int[] nums, int k) {
		int totalSubarray = 0;
		int prefixSum = 0;
		HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
		hashMap.put(0, 1);
		for (int index = 0; index < nums.length; index++) {
			prefixSum = prefixSum + nums[index];
			if (hashMap.containsKey(prefixSum - k)) {
				totalSubarray = totalSubarray + hashMap.get(prefixSum - k);
			}
			hashMap.put(prefixSum, hashMap.getOrDefault(prefixSum, 0) + 1);
		}
		return totalSubarray;
	}
}
