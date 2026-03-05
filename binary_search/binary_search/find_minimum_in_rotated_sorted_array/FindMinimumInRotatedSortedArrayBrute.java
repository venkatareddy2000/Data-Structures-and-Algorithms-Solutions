package find_minimum_in_rotated_sorted_array;

import java.util.Scanner;

public class FindMinimumInRotatedSortedArrayBrute {
	public static int findMin(int[] nums) {
		int minimum = Integer.MAX_VALUE;
		for (int index = 0; index < nums.length; index++) {
			if (nums[index] < minimum) {
				minimum = nums[index];
			}
		}
		return minimum;
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
		int minimumElement = findMin(nums);
		System.out.println("Minimum element in the array : " + minimumElement);
		scanner.close();
	}
}
