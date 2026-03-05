package koko_eating_bananas;

import java.util.Scanner;

public class KokoEatingBananasOptimal {
	public static int minEatingSpeed(int[] piles, int h) {
		int maximumPile = Integer.MIN_VALUE;
		for (int index = 0; index < piles.length; index++) {
			if (piles[index] > maximumPile) {
				maximumPile = piles[index];
			}
		}
		int low = 1, high = maximumPile;
		int result = 0;
		while (low <= high) {
			int mid = (low + high) / 2;
			long totalHours = 0;
			for (int index = 0; index < piles.length; index++) {
				totalHours = totalHours + (piles[index] + mid - 1) / mid;
			}
			if (totalHours <= h) {
				result = mid;
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}
		return result;
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
