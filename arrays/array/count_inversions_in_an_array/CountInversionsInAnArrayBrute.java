package count_inversions_in_an_array;

import java.util.Scanner;

public class CountInversionsInAnArrayBrute {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of the array : ");
		int size = scanner.nextInt();
		int[] nums = new int[size];
		System.out.println("Enter the elements into the array : ");
		for (int index = 0; index < size; index++) {
			nums[index] = scanner.nextInt();
		}
		int numberOfInversions = countInversionsInAnArray(nums);
		System.out.println("The number of inversions in the given array is : " + numberOfInversions);
		scanner.close();
	}

	private static int countInversionsInAnArray(int[] nums) {
		int count = 0;
		for (int outerIndex = 0; outerIndex < nums.length - 1; outerIndex++) {
			for (int innerIndex = outerIndex + 1; innerIndex < nums.length; innerIndex++) {
				if ((nums[outerIndex] > nums[innerIndex]) && (innerIndex > outerIndex)) {
					count++;
				}
			}
		}
		return count;
	}
}
