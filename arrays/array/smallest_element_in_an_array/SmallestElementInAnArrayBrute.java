package smallest_element_in_an_array;

import java.util.Arrays;
import java.util.Scanner;

public class SmallestElementInAnArrayBrute {

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
		int smallestElement = smallestElementInAnArrayBrute(array);
		System.out.println("The smallest element in the array is : " + smallestElement);
		scanner.close();
	}

	private static int smallestElementInAnArrayBrute(int[] array) {
		return array[0];
	}

}
