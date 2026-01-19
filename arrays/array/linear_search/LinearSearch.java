package linear_search;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of the array : ");
		int size = scanner.nextInt();
		int[] array = new int[size];
		System.out.println("Enter the elements into the array : ");
		for (int index = 0; index < size; index++) {
			array[index] = scanner.nextInt();
		}
		System.out.println("Enter the target number to search in the given array : ");
		int target = scanner.nextInt();
		int targetIndex = linearSearch(array, target);
		if (targetIndex != -1) {
			System.out.println("Target element found at the index : " + targetIndex);
		} else {
			System.out.println("Target is not in the array");
		}
		scanner.close();
	}

	private static int linearSearch(int[] array, int target) {
		for (int index = 0; index < array.length; index++) {
			if (array[index] == target)
				return index;
		}
		return -1;
	}
}
