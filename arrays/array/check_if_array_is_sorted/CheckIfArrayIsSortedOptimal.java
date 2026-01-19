package check_if_array_is_sorted;

import java.util.Scanner;

public class CheckIfArrayIsSortedOptimal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of the array : ");
		int size = scanner.nextInt();
		int[] array = new int[size];
		System.out.println("Enter the elements into the array : ");
		for (int index = 0; index < size; index++) {
			array[index] = scanner.nextInt();
		}
		boolean isArraySorted = checkIfArrayIsSortedOptimal(array);
		System.out.println("Is the given array sorted : " + isArraySorted);
		scanner.close();
	}

	private static boolean checkIfArrayIsSortedOptimal(int[] array) {
		for (int index = 0; index < array.length - 1; index++) {
			if (array[index] > array[index + 1])
				return false;
		}
		return true;
	}

}
