package bubble_sort;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSortIterative {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of the array : ");
		int size = scanner.nextInt();
		int[] array = new int[size];
		System.out.println("Enter the elements into the array : ");
		for (int index = 0; index < size; index++) {
			array[index] = scanner.nextInt();
		}
		bubbleSortIterative(array);
		System.out.println("Array after sorting : " + Arrays.toString(array));
		scanner.close();
	}

	private static void bubbleSortIterative(int[] array) {
		for (int outerIndex = 0; outerIndex < array.length - 1; outerIndex++) {
			for (int innerIndex = 0; innerIndex < array.length - outerIndex - 1; innerIndex++) {
				if (array[innerIndex] > array[innerIndex + 1]) {
					int temp = array[innerIndex];
					array[innerIndex] = array[innerIndex + 1];
					array[innerIndex + 1] = temp;
				}
			}
		}
	}
}
