package left_rotate_an_array;

import java.util.Arrays;
import java.util.Scanner;

public class LeftRotateAnArrayBetter {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of the array : ");
		int size = scanner.nextInt();
		int[] nums = new int[size];
		System.out.println("Enter the elements into the array : ");
		for (int index = 0; index < size; index++) {
			nums[index] = scanner.nextInt();
		}
		System.out.println("Enter an input to determine the number of steps to rotate : ");
		int k = scanner.nextInt();
		int[] rotate = rotate(nums, k);
		System.out.println("Array after rotation : " + Arrays.toString(rotate));
		scanner.close();
	}

	public static int[] rotate(int[] nums, int k) {
		int[] result = new int[nums.length];
		int initialKValue = k;
		int index = 0;
		while (k != 0) {
			result[nums.length - k] = nums[index];
			k--;
			index++;
		}
		index = 0;
		while (initialKValue >= 0) {
			result[index] = nums[nums.length - (initialKValue + 1)];
			index++;
			initialKValue--;
		}
		return result;
	}
}
