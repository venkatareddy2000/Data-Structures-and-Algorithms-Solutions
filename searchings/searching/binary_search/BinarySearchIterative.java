package binary_search;

import java.util.Scanner;

public class BinarySearchIterative {

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
		int targetIndex = binarySearchIterative(array, target);
		if (targetIndex != 1) {
			System.out.println("Target element found at the index : " + targetIndex);
		} else {
			System.out.println("Target is not in the array");
		}
		scanner.close();
	}

	private static int binarySearchIterative(int[] array, int target) {
		int start = 0;
		int end = array.length - 1;
		while (start <= end) {
			int mid = (start + end) / 2;
			if (array[mid] == target) {
				return mid;
			} else if (target < array[mid]) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}
		return -1;
	}

}
