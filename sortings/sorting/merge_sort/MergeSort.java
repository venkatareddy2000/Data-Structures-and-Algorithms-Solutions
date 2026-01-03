package merge_sort;

import java.util.Arrays;
import java.util.Scanner;

public class MergeSort {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of the array : ");
		int size = scanner.nextInt();
		int[] array = new int[size];
		System.out.println("Enter the elements into the array : ");
		for (int index = 0; index < size; index++) {
			array[index] = scanner.nextInt();
		}
		mergeSort(array);
		System.out.println("Array after sorting : " + Arrays.toString(array));
		scanner.close();
	}

	private static void mergeSort(int[] array) {
		if (array == null || array.length == 1) {
			return;
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
		mergeSort(left);
		mergeSort(right);
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
	}
}
