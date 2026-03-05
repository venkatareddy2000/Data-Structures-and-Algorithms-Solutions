package search_in_rotated_sorted_array_I;

import java.util.Scanner;

public class SearchInRotatedSortedArrayIBrute {
	public static int search(int[] nums, int target) {
		for (int index = 0; index < nums.length; index++) {
			if (nums[index] == target) {
				return index;
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
		System.out.println("Enter the target element : ");
		int target = scanner.nextInt();
		int index = search(nums, target);
		System.out.println("The index of the given target number is : " + index);
		scanner.close();
	}
}
