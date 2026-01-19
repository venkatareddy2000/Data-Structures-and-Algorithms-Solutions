package best_time_to_buy_and_sell_stocks;

import java.util.Scanner;

public class BestTimeToBuyAndSellStocksBrute {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of the array : ");
		int size = scanner.nextInt();
		int[] prices = new int[size];
		System.out.println("Enter the elements into the array : ");
		for (int index = 0; index < size; index++) {
			prices[index] = scanner.nextInt();
		}
		int maximumProfit = maxProfit(prices);
		System.out.println("Maximum profit in the array : " + maximumProfit);
		scanner.close();
	}

	public static int maxProfit(int[] prices) {
		int maximumProfit = 0;
		for (int outerIndex = 0; outerIndex < prices.length - 1; outerIndex++) {
			for (int innerIndex = outerIndex + 1; innerIndex < prices.length; innerIndex++) {
				if (prices[innerIndex] > prices[outerIndex]
						&& (prices[innerIndex] - prices[outerIndex] > maximumProfit)) {
					maximumProfit = prices[innerIndex] - prices[outerIndex];
				}
			}
		}
		return maximumProfit;
	}
}
