package find_how_many_times_the_array_is_rotated;

import java.util.Scanner;

public class FindHowManyTimesTheArrayIsRotatedBrute {
	public static int howManyTimesArrayIsRotated(int[] nums) {
		for (int index = 1; index < nums.length; index++) {
			if (nums[index] > nums[index - 1]) {
				continue;
			} else {
				return nums.length - index;
			}
		}
		return 0;
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
		int arrayRotation = howManyTimesArrayIsRotated(nums);
		System.out.println("The number of times array is rotated : " + arrayRotation);
		scanner.close();
	}
}
