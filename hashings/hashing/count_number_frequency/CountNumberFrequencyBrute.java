package count_number_frequency;

import java.util.Scanner;

public class CountNumberFrequencyBrute {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of the array : ");
		int size = scanner.nextInt();
		int[] array = new int[size];
		System.out.println("Enter the elements into the array : ");
		for (int index = 0; index < size; index++) {
			array[index] = scanner.nextInt();
		}
		System.out.println("Enter the size of the Query to find the frequency : ");
		int querySize = scanner.nextInt();
		while (querySize != 0) {
			System.out.print("Enter the Query element to find the frequency : ");
			int queryElement = scanner.nextInt();
			int result = countNumberFrequencyBrute(array, queryElement);
			System.out.println("Query Element : " + queryElement + " -> Frequency : " + result);
			querySize--;
		}
		scanner.close();
	}

	public static int countNumberFrequencyBrute(int[] array, int target) {
		int count = 0;
		for (int index = 0; index < array.length; index++) {
			if (array[index] == target)
				count++;
		}
		return count;
	}

}
