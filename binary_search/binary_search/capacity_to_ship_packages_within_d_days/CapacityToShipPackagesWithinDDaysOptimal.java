package capacity_to_ship_packages_within_d_days;

import java.util.Scanner;

public class CapacityToShipPackagesWithinDDaysOptimal {
	public static int shipWithinDays(int[] weights, int days) {
		int maximum = Integer.MIN_VALUE;
		int totalWeight = 0;
		for (int index = 0; index < weights.length; index++) {
			if (weights[index] > maximum) {
				maximum = weights[index];
			}
			totalWeight = totalWeight + weights[index];
		}
		int low = maximum, high = totalWeight;
		while (low <= high) {
			int mid = (low + high) / 2;
			int day = 1, load = 0;
			for (int index = 0; index < weights.length; index++) {
				if (load + weights[index] > mid) {
					day = day + 1;
					load = weights[index];
				} else {
					load = load + weights[index];
				}
			}
			if (day <= days) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}
		return low;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of the array : ");
		int size = scanner.nextInt();
		int[] weights = new int[size];
		System.out.println("Enter the elements into the array : ");
		for (int index = 0; index < size; index++) {
			weights[index] = scanner.nextInt();
		}
		System.out.println("Enter the days value : ");
		int days = scanner.nextInt();
		int minimumShipCapacity = shipWithinDays(weights, days);
		System.out.println("The Minimum capacity of the ship : " + minimumShipCapacity);
		scanner.close();
	}
}
