package largest_element_in_an_array;

import java.util.Scanner;

public class LargestElementInAnArrayOptimal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of the array : ");
		int size = scanner.nextInt();
		int[] array = new int[size];
		System.out.println("Enter the elements into the array : ");
		for (int index = 0; index < size; index++) {
			array[index] = scanner.nextInt();
		}
		int largestElement = largestElementInAnArrayOptimal(array);
		System.out.println("The largest element in the array is : " + largestElement);
		scanner.close();
	}

	private static int largestElementInAnArrayOptimal(int[] array) {
		int largestElement = Integer.MIN_VALUE;
		for (int index = 0; index < array.length; index++) {
			if (array[index] > largestElement) {
				largestElement = array[index];
			}
		}
		return largestElement;
	}

}
