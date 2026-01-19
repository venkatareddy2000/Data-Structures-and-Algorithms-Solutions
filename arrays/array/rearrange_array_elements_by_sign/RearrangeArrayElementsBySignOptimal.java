package rearrange_array_elements_by_sign;

import java.util.Arrays;
import java.util.Scanner;

public class RearrangeArrayElementsBySignOptimal {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of the array : ");
		int size = scanner.nextInt();
		int[] nums = new int[size];
		System.out.println("Enter the elements into the array : ");
		for (int index = 0; index < size; index++) {
			nums[index] = scanner.nextInt();
		}
		int[] result = rearrangeArray(nums);
		System.out.println("Array after rearrange : " + Arrays.toString(result));
		scanner.close();
	}

	public static int[] rearrangeArray(int[] nums) {
		int[] result = new int[nums.length];
		int positiveIndex = 0;
		int negativeIndex = 1;
		for (int index = 0; index < nums.length; index++) {
			if (nums[index] >= 0) {
				result[positiveIndex] = nums[index];
				positiveIndex = positiveIndex + 2;
			} else {
				result[negativeIndex] = nums[index];
				negativeIndex = negativeIndex + 2;
			}
		}

		return result;
	}
}
