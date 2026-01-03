package highest_lowest_frequency_element;

import java.util.HashMap;
import java.util.Scanner;

public class HighestLowestFrequencyElementOptimal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of the array : ");
		int size = scanner.nextInt();
		int[] array = new int[size];
		System.out.println("Enter the elements into the array : ");
		for (int index = 0; index < size; index++) {
			array[index] = scanner.nextInt();
		}
		highestLowestFrequencyElementOptimal(array);
		scanner.close();
	}

	public static void highestLowestFrequencyElementOptimal(int[] array) {
		int size = array.length;
		int maximumFrequency = Integer.MIN_VALUE;
		int minimumFrequency = Integer.MAX_VALUE;
		int maximumFrequencyElement = 0;
		int minimumFrequencyElement = 0;
		HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
		for (int index = 0; index < size; index++) {
			hashMap.put(array[index], hashMap.getOrDefault(array[index], 0) + 1);
		}
		for (Integer keys : hashMap.keySet()) {
			if (hashMap.get(keys) > maximumFrequency) {
				maximumFrequency = hashMap.get(keys);
				maximumFrequencyElement = keys;
			}
			if (hashMap.get(keys) < minimumFrequency) {
				minimumFrequency = hashMap.get(keys);
				minimumFrequencyElement = keys;
			}
		}
		System.out.println("Maximum Frequency element : " + maximumFrequencyElement);
		System.out.println("Minimum Frequency element : " + minimumFrequencyElement);
	}

}
