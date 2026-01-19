package insertion_sort;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSortIterative {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of the array : ");
		int size = scanner.nextInt();
		int[] array = new int[size];
		System.out.println("Enter the elements into the array : ");
		for (int index = 0; index < size; index++) {
			array[index] = scanner.nextInt();
		}
		insertionSortIterative(array);
		System.out.println("Array after sorting : " + Arrays.toString(array));
		scanner.close();
	}

	private static void insertionSortIterative(int[] array) {
		for (int outerIndex = 1; outerIndex < array.length; outerIndex++) {
			int key = array[outerIndex];
			int innerIndex;
			for (innerIndex = outerIndex - 1; innerIndex >= 0; innerIndex--) {
				if (array[innerIndex] > key) {
					array[innerIndex + 1] = array[innerIndex];
				} else {
					break;
				}
			}
			array[innerIndex + 1] = key;
		}
	}
}
