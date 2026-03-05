package floor_and_ceil;

import java.util.Arrays;
import java.util.Scanner;

public class FloorAndCeilBrute {
	public static int[] floorAndCeil(int[] nums, int target) {
		int floor = target;
		int ceil = target;
		for (int index = 0; index < nums.length; index++) {
			if (nums[index] <= target) {
				floor = nums[index];
			}
			if (nums[index] >= target) {
				ceil = nums[index];
				break;
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
