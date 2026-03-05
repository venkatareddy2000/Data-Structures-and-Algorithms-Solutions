package koko_eating_bananas;

import java.util.Scanner;

public class KokoEatingBananasBrute {
	public static int minEatingSpeed(int[] piles, int h) {
		int maximumPile = Integer.MIN_VALUE;
		for (int index = 0; index < piles.length; index++) {
			if (piles[index] > maximumPile) {
				maximumPile = piles[index];
			}
		}
		for (int k = 1; k <= maximumPile; k++) {
			long totalHours = 0;
			for (int index = 0; index < piles.length; index++) {
				totalHours = totalHours + (piles[index] + k - 1) / k;
			}
			if (totalHours <= h) {
				return k;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of the array : ");
		int size = scanner.nextInt();
		int[] piles = new int[size];
		System.out.println("Enter the elements into the array : ");
		for (int index = 0; index < size; index++) {
			piles[index] = scanner.nextInt();
		}
		System.out.println("Enter the hour value : ");
		int h = scanner.nextInt();
		int minimumHours = minEatingSpeed(piles, h);
		System.out.println("Minimum hours taken to complete bananas in h hours : " + minimumHours);
		scanner.close();
	}

}
