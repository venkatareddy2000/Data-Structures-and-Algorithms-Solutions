package jewels_and_stones;

import java.util.HashMap;
import java.util.Scanner;

public class JewelsAndStonesOptimal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the jewels : ");
		String jewels = scanner.next();
		System.out.println("Enter the stones : ");
		String stones = scanner.next();
		int jewelsCount = jewelsAndStonesOptimal(jewels, stones);
		System.out.println("The number of jewels in the stones are : " + jewelsCount);
		scanner.close();
	}

	public static int jewelsAndStonesOptimal(String jewels, String stones) {
		int jewelsCount = 0;
		HashMap<Character, Integer> hashMap = new HashMap<Character, Integer>();
		for (int index = 0; index < stones.length(); index++) {
			hashMap.put(stones.charAt(index), hashMap.getOrDefault(stones.charAt(index), 0) + 1);
		}
		for (int index = 0; index < jewels.length(); index++) {
			jewelsCount = jewelsCount + hashMap.getOrDefault(jewels.charAt(index), 0);
		}
		return jewelsCount;
	}

}
