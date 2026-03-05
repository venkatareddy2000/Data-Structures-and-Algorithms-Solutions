package count_occurrences_in_sorted_array;

import java.util.Scanner;

public class CountOccurrencesInSortedaArrrayOptimal {
	public static int countOccurrences(int[] nums, int target) {
		int lower = lowerBound(nums, target);
		int upper = upperBound(nums, target);
		return upper - lower;
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
		int occurrenceCount = countOccurrences(nums, target);
		System.out.println("The occurrence count of the given target number is : " + occurrenceCount);
		scanner.close();
	}
}
