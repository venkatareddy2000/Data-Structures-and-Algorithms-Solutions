package second_largest_element_in_an_array;

import java.util.Scanner;

public class SecondLargestElementInAnArrayOptimal {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of the array : ");
		int size = scanner.nextInt();
		int[] array = new int[size];
		System.out.println("Enter the elements into the array : ");
		for (int index = 0; index < size; index++) {
			array[index] = scanner.nextInt();
		}
		int secondLargestElement = secondLargestElementInAnArrayOptimal(array);
		System.out.println("The second largest element in the array is : " + secondLargestElement);
		scanner.close();
	}

	private static int secondLargestElementInAnArrayOptimal(int[] array) {
		int largestElement = Integer.MIN_VALUE;
		int secondLargestElement = Integer.MIN_VALUE;
		for (int index = 0; index < array.length; index++) {
			if (array[index] > largestElement) {
				secondLargestElement = largestElement;
				largestElement = array[index];
			} else if (array[index] < largestElement && array[index] > secondLargestElement) {
				secondLargestElement = array[index];
			}
		}
		return secondLargestElement;
	}
}
