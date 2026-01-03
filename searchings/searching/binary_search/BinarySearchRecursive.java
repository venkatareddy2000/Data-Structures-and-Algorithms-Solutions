package binary_search;

import java.util.Scanner;

public class BinarySearchRecursive {

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
		int start = 0;
		int end = array.length - 1;
		int targetIndex = binarySearchRecursive(array, target, start, end);
		if (targetIndex != 1) {
			System.out.println("Target element found at the index : " + targetIndex);
		} else {
			System.out.println("Target is not in the array");
		}
		scanner.close();
	}

	private static int binarySearchRecursive(int[] array, int target, int start, int end) {
		if (start <= end) {
			int mid = (start + end) / 2;
			if (array[mid] == target) {
				return mid;
			} else if (target < array[mid]) {
				return binarySearchRecursive(array, target, start, mid - 1);
			} else {
				return binarySearchRecursive(array, target, mid + 1, end);
			}
		}
		return -1;
	}

}
