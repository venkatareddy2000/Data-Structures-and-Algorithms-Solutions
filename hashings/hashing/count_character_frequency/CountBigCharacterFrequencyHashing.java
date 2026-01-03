package count_character_frequency;

import java.util.Scanner;

public class CountBigCharacterFrequencyHashing {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the input String : ");
		String input = scanner.next();
		int[] hashArray = new int[26];
		for (int index = 0; index < input.length(); index++) {
			hashArray[input.charAt(index) - 'A'] += 1;
		}
		System.out.println("Enter the size of the Query to find the frequency : ");
		int querySize = scanner.nextInt();
		while (querySize != 0) {
			System.out.print("Enter the Query element to find the frequency : ");
			char queryElement = scanner.next().charAt(0);
			int result = hashArray[queryElement - 'A'];
			System.out.println("Query Element : " + queryElement + " -> Frequency : " + result);
			querySize--;
		}
		scanner.close();
	}

}
