package floor_and_ceil;

import java.util.Arrays;
import java.util.Scanner;

public class FloorAndCeilOptimal {
	public static int[] floorAndCeil(int[] nums, int target) {
		int floor = -1;
		int ceil = -1;
		int start = 0, end = nums.length - 1;
		while (start <= end) {
			int mid = (start + end) / 2;
			if (nums[mid] <= target) {
				floor = nums[mid];
				start = mid + 1;
			} else {
				end = mid - 1;
			}
		}
		start = 0;
		end = nums.length - 1;
		while (start <= end) {
			int mid = (start + end) / 2;
			if (nums[mid] >= target) {
				ceil = nums[mid];
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}
		return new int[] { floor, ceil };
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
		int[] floorAndCeilOfTheTarget = floorAndCeil(nums, target);
		System.out.println("Floor and Ceil of the target element  : " + Arrays.toString(floorAndCeilOfTheTarget));
		scanner.close();
	}
}
