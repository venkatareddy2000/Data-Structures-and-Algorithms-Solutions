package jewels_and_stones;

import java.util.Scanner;

public class JewelsAndStonesBrute {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the jewels : ");
		String jewels = scanner.next();
		System.out.println("Enter the stones : ");
		String stones = scanner.next();
		int jewelsCount = jewelsAndStonesBrute(jewels, stones);
		System.out.println("The number of jewels in the stones are : " + jewelsCount);
		scanner.close();
	}

	public static int jewelsAndStonesBrute(String jewels, String stones) {
		int jewelsCount = 0;
		for (int outerIndex = 0; outerIndex < jewels.length(); outerIndex++) {
			int count = 0;
			for (int innerIndex = 0; innerIndex < stones.length(); innerIndex++) {
				if (jewels.charAt(outerIndex) == stones.charAt(innerIndex)) {
					count++;
				}
			}
			jewelsCount = jewelsCount + count;
		}
		return jewelsCount;
	}

}
