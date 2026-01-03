package decode_the_message;

import java.util.Scanner;

public class DecodeTheMessageArray {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the key : ");
		String key = scanner.nextLine();
		System.out.println("Enter the message : ");
		String message = scanner.nextLine();
		String decodedMessage = decodeTheMessageArray(key, message);
		System.out.println("The decoded message : " + decodedMessage);
		scanner.close();
	}

	private static String decodeTheMessageArray(String key, String message) {
		String decodedMessage = "";
		char[] mappedArray = new char[26];
		int alphabetIndex = 0;
		for (int index = 0; index < key.length(); index++) {
			if (key.charAt(index) != ' ' && mappedArray[key.charAt(index) - 'a'] == '\0') {
				mappedArray[key.charAt(index) - 'a'] = (char) (97 + alphabetIndex);
				alphabetIndex++;
			}
		}
		for (int index = 0; index < message.length(); index++) {
			if (message.charAt(index) != ' ') {
				decodedMessage = decodedMessage + mappedArray[message.charAt(index) - 'a'];
			} else {
				decodedMessage = decodedMessage + " ";
			}
		}
		return decodedMessage;
	}
}
