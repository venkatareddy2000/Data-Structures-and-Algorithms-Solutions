package count_character_frequency;

import java.util.HashMap;
import java.util.Scanner;

public class CountCharacterFrequencyHashMap {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the input String : ");
		String input = scanner.next();
		HashMap<Character, Integer> hashMap = new HashMap<Character, Integer>();
		for (int index = 0; index < input.length(); index++) {
			hashMap.put(input.charAt(index), hashMap.getOrDefault(input.charAt(index), 0) + 1);
		}
		System.out.println("Enter the size of the Query to find the frequency : ");
		int querySize = scanner.nextInt();
		while (querySize != 0) {
			System.out.print("Enter the Query element to find the frequency : ");
			char queryElement = scanner.next().charAt(0);
			int result = hashMap.getOrDefault(queryElement, 0);
			System.out.println("Query Element : " + queryElement + " -> Frequency : " + result);
			querySize--;
		}
		scanner.close();
	}

}
