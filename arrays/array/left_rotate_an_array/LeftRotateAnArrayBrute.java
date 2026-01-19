package left_rotate_an_array;

import java.util.Arrays;
import java.util.Scanner;

public class LeftRotateAnArrayBrute {
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
		rotate(nums, k);
		System.out.println("Array after rotation : " + Arrays.toString(nums));
		scanner.close();
	}

	public static void rotate(int[] nums, int k) {
		while (k != 0) {
			int firstElement = nums[0];
			int index = 0;
			for (index = 1; index < nums.length; index++) {
				nums[index - 1] = nums[index];
			}
			nums[index - 1] = firstElement;
			k--;
		}
	}
}
