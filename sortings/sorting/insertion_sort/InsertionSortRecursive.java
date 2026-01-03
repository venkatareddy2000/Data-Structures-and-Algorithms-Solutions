package insertion_sort;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSortRecursive {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of the array : ");
		int size = scanner.nextInt();
		int[] array = new int[size];
		System.out.println("Enter the elements into the array : ");
		for (int index = 0; index < size; index++) {
			array[index] = scanner.nextInt();
		}
		int index = 1;
		insertionSortRecursive(array, index);
		System.out.println("Array after sorting : " + Arrays.toString(array));
		scanner.close();
	}

	private static void insertionSortRecursive(int[] array, int index) {
		if (index == array.length) {
			return;
		}
		int key = array[index];
		int innerIndex;
		for (innerIndex = index - 1; innerIndex >= 0; innerIndex--) {
			if (array[innerIndex] > key) {
				array[innerIndex + 1] = array[innerIndex];
			} else {
				break;
			}
		}
		array[innerIndex + 1] = key;
		insertionSortRecursive(array, index + 1);
	}
}
