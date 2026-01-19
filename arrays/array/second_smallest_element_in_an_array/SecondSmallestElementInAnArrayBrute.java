package second_smallest_element_in_an_array;

import java.util.Arrays;
import java.util.Scanner;

public class SecondSmallestElementInAnArrayBrute {
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
		int secondLSmallestElement = secondSmallestElementInAnArrayBrute(array);
		System.out.println("The second smallest element in the array is : " + secondLSmallestElement);
		scanner.close();
	}

	private static int secondSmallestElementInAnArrayBrute(int[] array) {
		return array[1];
	}
}
