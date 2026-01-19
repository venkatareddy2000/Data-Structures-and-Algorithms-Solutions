package sort_colors;

import java.util.Arrays;
import java.util.Scanner;

public class SortColorsBrute {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of the array : ");
		int size = scanner.nextInt();
		int[] nums = new int[size];
		System.out.println("Enter the elements into the array : ");
		for (int index = 0; index < size; index++) {
			nums[index] = scanner.nextInt();
		}
		sortColors(nums);
		System.out.println("Array after sorting : " + Arrays.toString(nums));
		scanner.close();
	}

	public static void sortColors(int[] nums) {
		if (nums == null || nums.length == 1) {
			return;
		}
		int mid = nums.length / 2;
		int[] left = new int[mid];
		int[] right = new int[nums.length - mid];
		for (int index = 0; index < mid; index++) {
			left[index] = nums[index];
		}
		for (int index = mid; index < nums.length; index++) {
			right[index - mid] = nums[index];
		}
		sortColors(left);
		sortColors(right);
		int leftSize = left.length;
		int rightSize = right.length;
		int leftArrayIndex = 0, rightArrayIndex = 0, arrayIndex = 0;
		while (leftArrayIndex < leftSize && rightArrayIndex < rightSize) {
			if (left[leftArrayIndex] < right[rightArrayIndex]) {
				nums[arrayIndex] = left[leftArrayIndex];
				arrayIndex++;
				leftArrayIndex++;
			} else {
				nums[arrayIndex] = right[rightArrayIndex];
				arrayIndex++;
				rightArrayIndex++;
			}
		}
		while (leftArrayIndex < leftSize) {
			nums[arrayIndex] = left[leftArrayIndex];
			arrayIndex++;
			leftArrayIndex++;
		}
		while (rightArrayIndex < rightSize) {
			nums[arrayIndex] = right[rightArrayIndex];
			arrayIndex++;
			rightArrayIndex++;
		}
	}
}
