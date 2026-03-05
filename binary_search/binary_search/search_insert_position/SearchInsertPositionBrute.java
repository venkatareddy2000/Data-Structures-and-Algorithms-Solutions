package search_insert_position;

import java.util.Scanner;

public class SearchInsertPositionBrute {
	public static int searchInsert(int[] nums, int target) {
		for (int index = 0; index < nums.length; index++) {
			if (nums[index] == target) {
				return index;
			} else if (nums[index] > target) {
				return index;
			}
		}
		return nums.length;
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
		int insertPosition = searchInsert(nums, target);
		System.out.println("The element can be inserted at or found at  : " + insertPosition);
		scanner.close();
	}
}
