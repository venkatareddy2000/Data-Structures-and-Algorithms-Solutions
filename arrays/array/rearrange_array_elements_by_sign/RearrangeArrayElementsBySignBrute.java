package rearrange_array_elements_by_sign;

import java.util.Arrays;
import java.util.Scanner;

public class RearrangeArrayElementsBySignBrute {
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
		int[] positives = new int[nums.length / 2];
		int[] negatives = new int[nums.length / 2];
		int positiveIndex = 0;
		int negativeIndex = 0;
		for (int index = 0; index < nums.length; index++) {
			if (nums[index] >= 0) {
				positives[positiveIndex] = nums[index];
				positiveIndex++;
			} else {
				negatives[negativeIndex] = nums[index];
				negativeIndex++;
			}
		}
		for (int index = 0; index < nums.length / 2; index++) {
			nums[2 * index] = positives[index];
			nums[2 * index + 1] = negatives[index];
		}
		return nums;
	}
}
