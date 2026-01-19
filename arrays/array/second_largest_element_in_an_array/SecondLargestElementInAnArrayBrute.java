package second_largest_element_in_an_array;

import java.util.Arrays;
import java.util.Scanner;

public class SecondLargestElementInAnArrayBrute {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of the array : ");
		int size = scanner.nextInt();
		int[] array = new int[size];
		System.out.println("Enter the elements into the array : ");
		for (int index = 0; index < size; index++) {
			array[index] = scanner.nextInt();
		}
		Arrays.sort(array);
		int secondLargestElement = secondLargestElementInAnArrayBrute(array);
		System.out.println("The second largest element in the array is : " + secondLargestElement);
		scanner.close();
	}

	private static int secondLargestElementInAnArrayBrute(int[] array) {
		return array[array.length - 2];
	}
}
