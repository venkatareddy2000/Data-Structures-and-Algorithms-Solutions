package remove_k_digits;

import java.util.Scanner;
import java.util.Stack;

public class RemoveKDigits {
	public static String removeKdigits(String num, int k) {
		Stack<Character> stack = new Stack<Character>();
		for (int index = 0; index < num.length(); index++) {
			while (!stack.isEmpty() && stack.peek() > num.charAt(index) && k > 0) {
				stack.pop();
				k--;
			}
			stack.push(num.charAt(index));
		}
		while (!stack.empty() && k > 0) {
			stack.pop();
			k--;
		}
		StringBuilder stringBuilder = new StringBuilder();
		while (!stack.empty()) {
			stringBuilder.append(stack.pop());
		}
		stringBuilder.reverse();
		int index = 0;
		while (index < stringBuilder.length() && stringBuilder.charAt(index) == '0') {
			index++;
		}
		stringBuilder.delete(0, index);
		if (stringBuilder.isEmpty()) {
			return "0";
		}
		return stringBuilder.toString();
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter string : ");
		String num = scanner.next();
		System.out.println("Enter the k value : ");
		int k = scanner.nextInt();
		String result = removeKdigits(num, k);
		System.out.println("String after removing k digits : " + result);
		scanner.close();
	}
}
