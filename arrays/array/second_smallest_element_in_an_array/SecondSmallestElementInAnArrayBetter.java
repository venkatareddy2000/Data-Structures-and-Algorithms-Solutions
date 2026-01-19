package second_smallest_element_in_an_array;

import java.util.Scanner;

public class SecondSmallestElementInAnArrayBetter {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of the array : ");
		int size = scanner.nextInt();
		int[] array = new int[size];
		System.out.println("Enter the elements into the array : ");
		for (int index = 0; index < size; index++) {
			array[index] = scanner.nextInt();
		}
		int secondSmallestElement = secondSmallestElementInAnArrayBetter(array);
		System.out.println("The second smallest element in the array is : " + secondSmallestElement);
		scanner.close();
	}

	private static int secondSmallestElementInAnArrayBetter(int[] array) {
		int smallestElement = Integer.MAX_VALUE;
		int secondSmallestElement = Integer.MAX_VALUE;
		for (int index = 0; index < array.length; index++) {
			if (array[index] < smallestElement) {
				smallestElement = array[index];
			}
		}
		for (int index = 0; index < array.length; index++) {
			if (array[index] < secondSmallestElement && array[index] > smallestElement) {
				secondSmallestElement = array[index];
			}
		}
		return secondSmallestElement;
	}
}
