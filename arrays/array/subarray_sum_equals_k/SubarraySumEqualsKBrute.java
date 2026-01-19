package subarray_sum_equals_k;

import java.util.Scanner;

public class SubarraySumEqualsKBrute {
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
		for (int outerIndex = 0; outerIndex < nums.length; outerIndex++) {
			for (int innerIndex = outerIndex; innerIndex < nums.length; innerIndex++) {
				int sum = 0;
				for (int index = outerIndex; index <= innerIndex; index++) {
					sum = sum + nums[index];
				}
				if (sum == k) {
					totalSubarray = totalSubarray + 1;
				}
			}
		}
		return totalSubarray;
	}
}
