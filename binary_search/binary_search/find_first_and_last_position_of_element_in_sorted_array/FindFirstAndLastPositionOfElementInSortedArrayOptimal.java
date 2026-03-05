package find_first_and_last_position_of_element_in_sorted_array;

import java.util.Arrays;
import java.util.Scanner;

public class FindFirstAndLastPositionOfElementInSortedArrayOptimal {
	public static int[] searchRange(int[] nums, int target) {
		int lower = lowerBound(nums, target);
		int upper = upperBound(nums, target);
		if (lower == nums.length || nums[lower] != target)
			return new int[] { -1, -1 };
		return new int[] { lower, upper - 1 };
	}

	public static int lowerBound(int[] arr, int x) {
		int start = 0, end = arr.length - 1;
		int result = arr.length;
		while (start <= end) {
			int mid = (start + end) / 2;
			if (arr[mid] >= x) {
				result = mid;
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}
		return result;
	}

	public static int upperBound(int[] arr, int x) {
		int start = 0, end = arr.length - 1;
		int result = arr.length;
		while (start <= end) {
			int mid = (start + end) / 2;
			if (arr[mid] > x) {
				result = mid;
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}
		return result;
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
		int[] firstAndLastPositionOfElement = searchRange(nums, target);
		System.out.println("First and last position of element in sorted array  : "
				+ Arrays.toString(firstAndLastPositionOfElement));
		scanner.close();
	}
}
