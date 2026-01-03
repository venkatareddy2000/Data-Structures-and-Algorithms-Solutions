package quick_sort;

import java.util.Arrays;
import java.util.Scanner;

public class QuickSort {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of the array : ");
		int size = scanner.nextInt();
		int[] array = new int[size];
		System.out.println("Enter the elements into the array : ");
		for (int index = 0; index < size; index++) {
			array[index] = scanner.nextInt();
		}
		int low = 0;
		int high = array.length - 1;
		quickSort(array, low, high);
		System.out.println("Array after sorting : " + Arrays.toString(array));
		scanner.close();
	}

	private static void quickSort(int[] array, int low, int high) {
		if (low < high) {
			int pivotIndex = pivot(array, low, high);
			quickSort(array, low, pivotIndex - 1);
			quickSort(array, pivotIndex + 1, high);
		}
	}

	private static int pivot(int[] array, int low, int high) {
		int pivotIndex = high;
		int pointer = low - 1;
		int index;
		for (index = low; index < high; index++) {
			if (array[index] > array[pivotIndex]) {
				continue;
			} else {
				pointer++;
				int temp = array[pointer];
				array[pointer] = array[index];
				array[index] = temp;
			}
		}
		pointer++;
		int temp = array[pointer];
		array[pointer] = array[index];
		array[index] = temp;
		return pointer;
	}
}
