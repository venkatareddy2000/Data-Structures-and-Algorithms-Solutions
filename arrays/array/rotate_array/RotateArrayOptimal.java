package rotate_array;

import java.util.Arrays;
import java.util.Scanner;

public class RotateArrayOptimal {
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
		if (nums == null || nums.length <= 1) {
			return;
		}
		k = k % nums.length;
		int start = 0, end = nums.length - 1;
		while (start < end) {
			int temp = nums[start];
			nums[start] = nums[end];
			nums[end] = temp;
			start++;
			end--;
		}
		start = 0;
		end = k - 1;
		while (start < end) {
			int temp = nums[start];
			nums[start] = nums[end];
			nums[end] = temp;
			start++;
			end--;
		}
		start = k;
		end = nums.length - 1;
		while (start < end) {
			int temp = nums[start];
			nums[start] = nums[end];
			nums[end] = temp;
			start++;
			end--;
		}
	}
}
