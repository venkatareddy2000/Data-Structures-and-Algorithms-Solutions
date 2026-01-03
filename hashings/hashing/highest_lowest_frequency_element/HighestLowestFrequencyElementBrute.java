package highest_lowest_frequency_element;

import java.util.Scanner;

public class HighestLowestFrequencyElementBrute {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of the array : ");
		int size = scanner.nextInt();
		int[] array = new int[size];
		System.out.println("Enter the elements into the array : ");
		for (int index = 0; index < size; index++) {
			array[index] = scanner.nextInt();
		}
		highestLowestFrequencyElementBrute(array);
		scanner.close();
	}

	public static void highestLowestFrequencyElementBrute(int[] array) {
		int size = array.length;
		int maximumFrequency = Integer.MIN_VALUE;
		int minimumFrequency = Integer.MAX_VALUE;
		int maximumFrequencyElement = 0;
		int minimumFrequencyElement = 0;
		boolean[] visited = new boolean[size];
		for (int index = 0; index < size; index++) {
			if (visited[index]) {
				continue;
			}
			int count = 1;
			for (int innerIndex = index + 1; innerIndex < size; innerIndex++) {
				if (array[index] == array[innerIndex]) {
					count = count + 1;
					visited[innerIndex] = true;
				}
			}
			if (count > maximumFrequency) {
				maximumFrequencyElement = array[index];
				maximumFrequency = count;
			}

			if (count < minimumFrequency) {
				minimumFrequencyElement = array[index];
				minimumFrequency = count;
			}
		}
		System.out.println("Maximum Frequency element : " + maximumFrequencyElement);
		System.out.println("Minimum Frequency element : " + minimumFrequencyElement);
	}

}
