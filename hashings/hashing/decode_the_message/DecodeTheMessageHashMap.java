package decode_the_message;

import java.util.HashMap;
import java.util.Scanner;

public class DecodeTheMessageHashMap {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the key : ");
		String key = scanner.nextLine();
		System.out.println("Enter the message : ");
		String message = scanner.nextLine();
		String decodedMessage = decodeTheMessageHashMap(key, message);
		System.out.println("The decoded message : " + decodedMessage);
		scanner.close();
	}

	private static String decodeTheMessageHashMap(String key, String message) {
		String decodedMessage = "";
		HashMap<Character, Character> hashMap = new HashMap<Character, Character>();
		int alphabetIndex = 0;
		for (int index = 0; index < key.length(); index++) {
			if (key.charAt(index) != ' ' && !hashMap.containsKey(key.charAt(index))) {
				hashMap.put(key.charAt(index), (char) (97 + alphabetIndex));
				alphabetIndex++;
			}
		}
		for (int index = 0; index < message.length(); index++) {
			if (message.charAt(index) != ' ') {
				decodedMessage = decodedMessage + hashMap.get(message.charAt(index));
			} else {
				decodedMessage = decodedMessage + " ";
			}
		}
		return decodedMessage;
	}
}
