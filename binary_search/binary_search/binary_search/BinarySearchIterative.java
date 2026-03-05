package binary_search;

import java.util.Scanner;

public class BinarySearchIterative {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of the array : ");
		int size = scanner.nextInt();
		int[] nums = new int[size];
		System.out.println("Enter the elements into the array : ");
		for (int index = 0; index < size; index++) {
			nums[index] = scanner.nextInt();
		}
		System.out.println("Enter the target number to search in the given array : ");
		int target = scanner.nextInt();
		int targetIndex = binarySearchIterative(nums, target);
		if (targetIndex != 1) {
			System.out.println("Target element found at the index : " + targetIndex);
		} else {
			System.out.println("Target is not in the array");
		}
		scanner.close();
	}

	private static int binarySearchIterative(int[] nums, int target) {
		int start = 0;
		int end = nums.length - 1;
		while (start <= end) {
			int mid = (start + end) / 2;
			if (nums[mid] == target) {
				return mid;
			} else if (target < nums[mid]) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}
		return -1;
	}
}
