package rotate_string;

import java.util.Scanner;

public class RotateStringBrute {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the input string : ");
		String s = scanner.next();
		System.out.println("Enter the input string : ");
		String goal = scanner.next();
		boolean isStringSame = rotateString(s, goal);
		System.out.println("Is the given strings same after rotation : " + isStringSame);
		scanner.close();
	}

	public static boolean rotateString(String s, String goal) {
		if (s.equals(goal))
			return true;
		StringBuilder stringBuilder = new StringBuilder(s);
		for (int index = 0; index < stringBuilder.length(); index++) {
			char firstChar = stringBuilder.charAt(0);
			stringBuilder.deleteCharAt(0);
			stringBuilder.append(firstChar);
			if (goal.equals(stringBuilder.toString())) {
				return true;
			}
		}
		return false;
	}
}
