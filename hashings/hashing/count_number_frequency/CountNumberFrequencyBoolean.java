package count_number_frequency;

import java.util.Scanner;

public class CountNumberFrequencyBoolean {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of the array : ");
		int size = scanner.nextInt();
		int[] array = new int[size];
		System.out.println("Enter the elements into the array : ");
		for (int index = 0; index < size; index++) {
			array[index] = scanner.nextInt();
		}
		countNumberFrequencyBoolean(array);
		scanner.close();
	}

	public static void countNumberFrequencyBoolean(int[] array) {
		int size = array.length;
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
			System.out.println(array[index] + " -> " + count);
		}
	}

}
