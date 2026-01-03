package count_number_frequency;

import java.util.HashMap;
import java.util.Scanner;

public class CountNumberFrequencyHashMap {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of the array : ");
		int size = scanner.nextInt();
		int[] array = new int[size];
		System.out.println("Enter the elements into the array : ");
		for (int index = 0; index < size; index++) {
			array[index] = scanner.nextInt();
		}
		HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
		for (int index = 0; index < array.length; index++) {
			hashMap.put(array[index], hashMap.getOrDefault(array[index], 0) + 1);
		}
		System.out.println("Enter the size of the Query to find the frequency : ");
		int querySize = scanner.nextInt();
		while (querySize != 0) {
			System.out.print("Enter the Query element to find the frequency : ");
			int queryElement = scanner.nextInt();
			int result = hashMap.getOrDefault(queryElement, 0);
			System.out.println("Query Element : " + queryElement + " -> Frequency : " + result);
			querySize--;
		}
		scanner.close();
	}

}
