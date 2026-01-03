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
		boolean isTargetFound = linearSearch(array, target);
		System.out.println("Is the target element found in the array : " + isTargetFound);
		scanner.close();
	}

	private static boolean linearSearch(int[] array, int target) {
		for (int index = 0; index < array.length; index++) {
			if (array[index] == target)
				return true;
		}
		return false;
	}

}
