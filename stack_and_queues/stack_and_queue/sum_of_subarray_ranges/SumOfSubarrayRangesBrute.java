package sum_of_subarray_ranges;

import java.util.Scanner;

public class SumOfSubarrayRangesBrute {
	public static long subArrayRanges(int[] nums) {
		long sum = 0;
		for (int outerIndex = 0; outerIndex < nums.length; outerIndex++) {
			int minimum = nums[outerIndex], maximum = nums[outerIndex];
			for (int innerIndex = outerIndex; innerIndex < nums.length; innerIndex++) {
				if (nums[innerIndex] < minimum) {
					minimum = nums[innerIndex];
				}
				if (nums[innerIndex] > maximum) {
					maximum = nums[innerIndex];
				}
				sum = (sum) + (maximum - minimum);
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of the array : ");
		int size = scanner.nextInt();
		int[] nums = new int[size];
		System.out.println("Enter the elements into the nums : ");
		for (int index = 0; index < size; index++) {
			nums[index] = scanner.nextInt();
		}
		long sumOfSubarrayMinimumsAndMaximums = subArrayRanges(nums);
		System.out.println("Sum of maximum and minimum subarrays : " + sumOfSubarrayMinimumsAndMaximums);
		scanner.close();
	}
}
