package selection_sort;

import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of the array : ");
		int size = scanner.nextInt();
		int[] array = new int[size];
		System.out.println("Enter the elements into the array : ");
		for (int index = 0; index < size; index++) {
			array[index] = scanner.nextInt();
		}
		selectionSort(array);
		System.out.println("Array after sorting : " + Arrays.toString(array));
		scanner.close();
	}

	private static void selectionSort(int[] array) {
		for (int outerIndex = 0; outerIndex < array.length - 1; outerIndex++) {
			int minIndex = outerIndex;
			for (int innerIndex = minIndex + 1; innerIndex < array.length; innerIndex++) {
				if (array[minIndex] > array[innerIndex]) {
					minIndex = innerIndex;
				}
			}
			int temp = array[outerIndex];
			array[outerIndex] = array[minIndex];
			array[minIndex] = temp;
		}
	}
}
