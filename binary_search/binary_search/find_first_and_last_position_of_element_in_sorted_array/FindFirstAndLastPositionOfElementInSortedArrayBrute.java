package find_first_and_last_position_of_element_in_sorted_array;

import java.util.Arrays;
import java.util.Scanner;

public class FindFirstAndLastPositionOfElementInSortedArrayBrute {
	public static int[] searchRange(int[] nums, int target) {
		int first = -1;
		int last = -1;
		for (int index = 0; index < nums.length; index++) {
			if (nums[index] == target) {
				if (first == -1) {
					first = index;
					last = index;
				} else {
					last = index;
				}
			}
		}
		return new int[] { first, last };
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
