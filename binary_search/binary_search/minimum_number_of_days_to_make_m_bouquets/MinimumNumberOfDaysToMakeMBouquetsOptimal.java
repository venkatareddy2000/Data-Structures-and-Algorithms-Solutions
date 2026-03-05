package minimum_number_of_days_to_make_m_bouquets;

import java.util.Scanner;

public class MinimumNumberOfDaysToMakeMBouquetsOptimal {
	public static int minDays(int[] bloomDay, int m, int k) {
		if ((long) m * k > bloomDay.length) {
			return -1;
		}
		int minDay = Integer.MAX_VALUE;
		int maxDay = Integer.MIN_VALUE;
		for (int index = 0; index < bloomDay.length; index++) {
			if (bloomDay[index] > maxDay) {
				maxDay = bloomDay[index];
			}
			if (bloomDay[index] < minDay) {
				minDay = bloomDay[index];
			}
		}
		int low = minDay, high = maxDay;
		while (low <= high) {
			int mid = (low + high) / 2;
			int consecutiveDay = 0;
			int numberOfBouquetsMade = 0;
			for (int index = 0; index < bloomDay.length; index++) {
				if (bloomDay[index] <= mid) {
					consecutiveDay++;
				} else {
					consecutiveDay = 0;
				}
				if (consecutiveDay == k) {
					numberOfBouquetsMade++;
					consecutiveDay = 0;
				}
			}
			if (numberOfBouquetsMade >= m) {
				high = mid - 1;
			} else if (numberOfBouquetsMade < m) {
				low = mid + 1;
			}
		}
		return low;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of the array : ");
		int size = scanner.nextInt();
		int[] bloomDay = new int[size];
		System.out.println("Enter the elements into the array : ");
		for (int index = 0; index < size; index++) {
			bloomDay[index] = scanner.nextInt();
		}
		System.out.println("Enter the m value to tell the number of bouquets to make : ");
		int m = scanner.nextInt();
		System.out.println(
				"Enter the k value to tell the number of number of adjacent flowers to take to make a bouquet : ");
		int k = scanner.nextInt();
		int minimumDaysRequired = minDays(bloomDay, m, k);
		System.out.println("Minimum days required to make m bouquets : " + minimumDaysRequired);
		scanner.close();
	}
}
