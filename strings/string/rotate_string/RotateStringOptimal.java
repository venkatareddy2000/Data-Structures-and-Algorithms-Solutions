package rotate_string;

import java.util.Scanner;

public class RotateStringOptimal {
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
		if (s.length() != goal.length())
			return false;
		return ((s + s).contains(goal));
	}
}
