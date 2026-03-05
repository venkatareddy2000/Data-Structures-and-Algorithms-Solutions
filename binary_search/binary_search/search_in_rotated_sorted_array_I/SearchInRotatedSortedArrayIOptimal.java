package search_in_rotated_sorted_array_I;

import java.util.Scanner;

public class SearchInRotatedSortedArrayIOptimal {
	public static int search(int[] nums, int target) {
		int start = 0, end = nums.length - 1;
		while (start <= end) {
			int mid = (start + end) / 2;
			if (nums[mid] == target) {
				return mid;
			}
			if (nums[start] <= nums[mid]) {
				if (nums[start] <= target && nums[mid] >= target) {
					end = mid - 1;
				} else {
					start = mid + 1;
				}
			} else {
				if (nums[mid + 1] <= target && nums[end] >= target) {
					start = mid + 1;
				} else {
					end = mid - 1;
				}
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
