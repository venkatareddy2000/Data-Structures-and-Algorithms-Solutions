package check_if_array_is_sorted_and_rotated;

import java.util.Scanner;

public class CheckIfArrayIsSortedAndRotated {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of the array : ");
		int size = scanner.nextInt();
		int[] array = new int[size];
		System.out.println("Enter the elements into the array : ");
		for (int index = 0; index < size; index++) {
			array[index] = scanner.nextInt();
		}
		boolean isArraySorted = check(array);
		System.out.println("Is the given array sorted : " + isArraySorted);
		scanner.close();
	}

	public static boolean check(int[] nums) {
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
