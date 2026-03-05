package split_array_largest_sum;

import java.util.Scanner;

public class SplitArrayLargestSumBrute {
	public static int splitArray(int[] nums, int k) {
		if (k > nums.length) {
			return -1;
		}
		int maximum = Integer.MIN_VALUE;
		int totalSum = 0;
		for (int index = 0; index < nums.length; index++) {
			if (nums[index] > maximum) {
				maximum = nums[index];
			}
			totalSum = totalSum + nums[index];
		}
		for (int sum = maximum; sum <= totalSum; sum++) {
			int subArray = 1, allocatedSum = 0;
			for (int index = 0; index < nums.length; index++) {
				if (allocatedSum + nums[index] > sum) {
					subArray = subArray + 1;
					allocatedSum = nums[index];
				} else {
					allocatedSum = allocatedSum + nums[index];
				}
			}
			if (subArray <= k) {
				return sum;
			}
		}
		return -1;
	}

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
		int arrayWithMinimumSum = splitArray(nums, k);
		System.out.println("The minimum sum in the sub array : " + arrayWithMinimumSum);
		scanner.close();
	}
}
