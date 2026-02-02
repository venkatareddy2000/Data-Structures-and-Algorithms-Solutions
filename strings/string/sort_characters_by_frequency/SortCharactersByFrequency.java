package sort_characters_by_frequency;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class SortCharactersByFrequency {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the input string : ");
		String s = scanner.next();
		String frequencySorting = frequencySort(s);
		System.out.println("String after sorting the characters based on frequency : " + frequencySorting);
		scanner.close();
	}

	public static String frequencySort(String s) {
		StringBuilder stringBuilder = new StringBuilder();
		HashMap<Character, Integer> hashMap = new HashMap<Character, Integer>();
		for (int index = 0; index < s.length(); index++) {
			hashMap.put(s.charAt(index), hashMap.getOrDefault(s.charAt(index), 0) + 1);
		}
		List<Map.Entry<Character, Integer>> list = new ArrayList<Map.Entry<Character, Integer>>(hashMap.entrySet());
		list.sort((f1, f2) -> f2.getValue() - f1.getValue());
		for (Map.Entry<Character, Integer> entry : list) {
			char character = entry.getKey();
			int frequency = entry.getValue();
			for (int index = 0; index < frequency; index++) {
				stringBuilder.append(character);
			}
		}
		return stringBuilder.toString();
	}
}
