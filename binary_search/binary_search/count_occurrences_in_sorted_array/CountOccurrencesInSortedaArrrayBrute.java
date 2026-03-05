package count_occurrences_in_sorted_array;

import java.util.Scanner;

public class CountOccurrencesInSortedaArrrayBrute {
	public static int countOccurrences(int[] nums, int target) {
		int count = 0;
		for (int index = 0; index < nums.length; index++) {
			if (nums[index] == target) {
				count++;
			}
		}
		return count;
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
