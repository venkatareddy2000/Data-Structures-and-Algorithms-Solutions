package count_character_frequency;

import java.util.Scanner;

public class CountCharacterFrequencyBrute {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the input String : ");
		String input = scanner.next();
		System.out.println("Enter the size of the Query to find the frequency : ");
		int querySize = scanner.nextInt();
		while (querySize != 0) {
			System.out.print("Enter the Query element to find the frequency : ");
			char queryElement = scanner.next().charAt(0);
			int result = countCharacterFrequencyBrute(input, queryElement);
			System.out.println("Query Element : " + queryElement + " -> Frequency : " + result);
			querySize--;
		}
		scanner.close();
	}

	public static int countCharacterFrequencyBrute(String input, char target) {
		int count = 0;
		for (int index = 0; index < input.length(); index++) {
			if (input.charAt(index) == target)
				count++;
		}
		return count;
	}

}
