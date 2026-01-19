package count_inversions_in_an_array;

import java.util.Scanner;

public class CountInversionsInAnArrayOptimal {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of the array : ");
		int size = scanner.nextInt();
		int[] nums = new int[size];
		System.out.println("Enter the elements into the array : ");
		for (int index = 0; index < size; index++) {
			nums[index] = scanner.nextInt();
		}
		int numberOfInversions = countInversionsInAnArray(nums);
		System.out.println("The number of inversions in the given array is : " + numberOfInversions);
		scanner.close();
	}

	private static int countInversionsInAnArray(int[] nums) {
		return mergeSort(nums);
	}

	private static int mergeSort(int[] array) {
		int count = 0;
		if (array == null || array.length == 1) {
			return count;
		}
		int mid = array.length / 2;
		int[] left = new int[mid];
		int[] right = new int[array.length - mid];
		for (int index = 0; index < mid; index++) {
			left[index] = array[index];
		}
		for (int index = mid; index < array.length; index++) {
			right[index - mid] = array[index];
		}
		count += mergeSort(left);
		count += mergeSort(right);
		int leftSize = left.length;
		int rightSize = right.length;
		int leftArrayIndex = 0, rightArrayIndex = 0, arrayIndex = 0;
		while (leftArrayIndex < leftSize && rightArrayIndex < rightSize) {
			if (left[leftArrayIndex] < right[rightArrayIndex]) {
				array[arrayIndex] = left[leftArrayIndex];
				arrayIndex++;
				leftArrayIndex++;
			} else {
				array[arrayIndex] = right[rightArrayIndex];
				count = count + (leftSize - leftArrayIndex);
				arrayIndex++;
				rightArrayIndex++;
			}
		}
		while (leftArrayIndex < leftSize) {
			array[arrayIndex] = left[leftArrayIndex];
			arrayIndex++;
			leftArrayIndex++;
		}
		while (rightArrayIndex < rightSize) {
			array[arrayIndex] = right[rightArrayIndex];
			arrayIndex++;
			rightArrayIndex++;
		}
		return count;
	}
}
