package second_largest_element_in_an_array;

import java.util.Scanner;

public class SecondLargestElementInAnArrayBetter {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of the array : ");
		int size = scanner.nextInt();
		int[] array = new int[size];
		System.out.println("Enter the elements into the array : ");
		for (int index = 0; index < size; index++) {
			array[index] = scanner.nextInt();
		}
		int secondLargestElement = secondLargestElementInAnArrayBetter(array);
		System.out.println("The second largest element in the array is : " + secondLargestElement);
		scanner.close();
	}

	private static int secondLargestElementInAnArrayBetter(int[] array) {
		int largestElement = Integer.MIN_VALUE;
		int secondLargestElement = Integer.MIN_VALUE;
		for (int index = 0; index < array.length; index++) {
			if (array[index] > largestElement) {
				largestElement = array[index];
			}
		}
		for (int index = 0; index < array.length; index++) {
			if (array[index] > secondLargestElement && array[index] < largestElement) {
				secondLargestElement = array[index];
			}
		}
		return secondLargestElement;
	}
}
