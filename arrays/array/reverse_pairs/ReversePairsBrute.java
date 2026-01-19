package reverse_pairs;

import java.util.Scanner;

public class ReversePairsBrute {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of the array : ");
		int size = scanner.nextInt();
		int[] nums = new int[size];
		System.out.println("Enter the elements into the array : ");
		for (int index = 0; index < size; index++) {
			nums[index] = scanner.nextInt();
		}
		int numberOfReversePairs = reversePairs(nums);
		System.out.println("The number of reverse pairs in the given array is : " + numberOfReversePairs);
		scanner.close();
	}

	public static int reversePairs(int[] nums) {
		int count = 0;
		for (int outerIndex = 0; outerIndex < nums.length - 1; outerIndex++) {
			for (int innerIndex = outerIndex + 1; innerIndex < nums.length; innerIndex++) {
				if ((nums[outerIndex] > (long) 2 * nums[innerIndex]) && (innerIndex > outerIndex)) {
					count++;
				}
			}
		}
		return count;
	}
}
