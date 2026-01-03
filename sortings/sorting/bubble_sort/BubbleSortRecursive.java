package bubble_sort;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSortRecursive {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of the array : ");
		int size = scanner.nextInt();
		int[] array = new int[size];
		System.out.println("Enter the elements into the array : ");
		for (int index = 0; index < size; index++) {
			array[index] = scanner.nextInt();
		}
		bubbleSortRecursive(array, array.length);
		System.out.println("Array after sorting : " + Arrays.toString(array));
		scanner.close();
	}

	private static void bubbleSortRecursive(int[] array, int size) {
		if (size == 1) {
			return;
		}
		for (int index = 0; index < size - 1; index++) {
			if (array[index] > array[index + 1]) {
				int temp = array[index];
				array[index] = array[index + 1];
				array[index + 1] = temp;
			}
		}
		bubbleSortRecursive(array, size - 1);
	}
}
