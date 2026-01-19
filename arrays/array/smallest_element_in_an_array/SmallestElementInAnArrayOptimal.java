package smallest_element_in_an_array;

import java.util.Scanner;

public class SmallestElementInAnArrayOptimal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of the array : ");
		int size = scanner.nextInt();
		int[] array = new int[size];
		System.out.println("Enter the elements into the array : ");
		for (int index = 0; index < size; index++) {
			array[index] = scanner.nextInt();
		}
		int smallestElement = smallestElementInAnArrayOptimal(array);
		System.out.println("The smallest element in the array is : " + smallestElement);
		scanner.close();
	}

	private static int smallestElementInAnArrayOptimal(int[] array) {
		int smallestElement = Integer.MAX_VALUE;
		for (int index = 0; index < array.length; index++) {
			if (array[index] < smallestElement) {
				smallestElement = array[index];
			}
		}
		return smallestElement;
	}

}
