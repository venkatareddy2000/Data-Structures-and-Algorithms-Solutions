package check_if_array_is_sorted;

import java.util.Scanner;

public class CheckIfArrayIsSortedBrute {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of the array : ");
		int size = scanner.nextInt();
		int[] array = new int[size];
		System.out.println("Enter the elements into the array : ");
		for (int index = 0; index < size; index++) {
			array[index] = scanner.nextInt();
		}
		boolean isArraySorted = checkIfArrayIsSortedBrute(array);
		System.out.println("Is the given array sorted : " + isArraySorted);
		scanner.close();
	}

	private static boolean checkIfArrayIsSortedBrute(int[] nums) {
		for (int outerIndex = 0; outerIndex < nums.length - 1; outerIndex++) {
			for (int innerIndex = outerIndex + 1; innerIndex < nums.length; innerIndex++) {
				if (nums[outerIndex] > nums[innerIndex]) {
					return false;
				}
			}
		}
		return true;
	}

	public boolean check(int[] nums) {
		int count = 0;
		for (int index = 0; index < nums.length; index++) {
			if (nums[index] > nums[(index + 1) % nums.length]) {
				count++;
			}
		}
		if (count > 1) {
			return false;
		}
		return true;
	}

}
