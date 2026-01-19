package move_zeroes;

import java.util.Arrays;
import java.util.Scanner;

public class MoveZeroesBrute {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of the array : ");
		int size = scanner.nextInt();
		int[] nums = new int[size];
		System.out.println("Enter the elements into the array : ");
		for (int index = 0; index < size; index++) {
			nums[index] = scanner.nextInt();
		}
		moveZeroes(nums);
		System.out.println("Array after moving zeroes to end : " + Arrays.toString(nums));
		scanner.close();
	}

	public static void moveZeroes(int[] nums) {
		int[] result = new int[nums.length];
		int resultIndex = 0;
		for (int index = 0; index < nums.length; index++) {
			if (nums[index] != 0) {
				result[resultIndex] = nums[index];
				resultIndex++;
			}
		}
		for (int index = 0; index < result.length; index++) {
			nums[index] = result[index];
		}
	}
}
