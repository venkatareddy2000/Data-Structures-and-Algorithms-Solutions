package binary_search;

import java.util.Scanner;

public class BinarySearchRecursive {

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
		int start = 0;
		int end = nums.length - 1;
		int targetIndex = binarySearchRecursive(nums, target, start, end);
		if (targetIndex != -1) {
			System.out.println("Target element found at the index : " + targetIndex);
		} else {
			System.out.println("Target is not in the array");
		}
		scanner.close();
	}

	private static int binarySearchRecursive(int[] nums, int target, int start, int end) {
		if (start <= end) {
			int mid = (start + end) / 2;
			if (nums[mid] == target) {
				return mid;
			} else if (target < nums[mid]) {
				return binarySearchRecursive(nums, target, start, mid - 1);
			} else {
				return binarySearchRecursive(nums, target, mid + 1, end);
			}
		}
		return -1;
	}
}
