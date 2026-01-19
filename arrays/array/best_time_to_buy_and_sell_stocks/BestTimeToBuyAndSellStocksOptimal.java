package best_time_to_buy_and_sell_stocks;

import java.util.Scanner;

public class BestTimeToBuyAndSellStocksOptimal {
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
		int maximumProfit = Integer.MIN_VALUE;
		int minimum = Integer.MAX_VALUE;
		for (int index = 0; index < prices.length; index++) {
			if (prices[index] < minimum) {
				minimum = prices[index];
			}
			if (prices[index] - minimum > maximumProfit) {
				maximumProfit = prices[index] - minimum;
			}
		}
		return maximumProfit;
	}
}
