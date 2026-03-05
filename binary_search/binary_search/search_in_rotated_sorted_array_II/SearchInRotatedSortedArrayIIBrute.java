package search_in_rotated_sorted_array_II;

import java.util.Scanner;

public class SearchInRotatedSortedArrayIIBrute {
	public static boolean search(int[] nums, int target) {
		for (int index = 0; index < nums.length; index++) {
			if (nums[index] == target) {
				return true;
			}
		}
		return false;
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
		boolean isFound = search(nums, target);
		System.out.println("Is the index of the given target number found : " + isFound);
		scanner.close();
	}
}
