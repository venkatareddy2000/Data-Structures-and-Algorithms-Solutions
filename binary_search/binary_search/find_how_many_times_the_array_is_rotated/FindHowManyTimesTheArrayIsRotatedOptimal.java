package find_how_many_times_the_array_is_rotated;

import java.util.Scanner;

public class FindHowManyTimesTheArrayIsRotatedOptimal {
	public static int howManyTimesArrayIsRotated(int[] nums) {
		int start = 0, end = nums.length - 1;
		while (start < end) {
			int mid = (start + end) / 2;
			if (nums[mid] > nums[end]) {
				start = mid + 1;
			} else {
				end = mid;
			}
		}
		return start;
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
