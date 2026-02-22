package trapping_train_water;

import java.util.Scanner;

public class TrappingRainWaterBetter {
	public static int trap(int[] height) {
		int size = height.length;
		int[] suffixMax = new int[size];
		suffixMax[size - 1] = height[size - 1];
		for (int index = size - 2; index >= 0; index--) {
			if (height[index] > suffixMax[index + 1]) {
				suffixMax[index] = height[index];
			} else {
				suffixMax[index] = suffixMax[index + 1];
			}
		}
		int total = 0;
		int prefixMaximum = Integer.MIN_VALUE;
		for (int index = 0; index < size; index++) {
			prefixMaximum = Math.max(prefixMaximum, height[index]);
			int suffixMaximum = suffixMax[index];
			if (height[index] < prefixMaximum && height[index] < suffixMaximum) {
				total = total + Math.min(prefixMaximum, suffixMaximum) - height[index];
			}
		}
		return total;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of the array : ");
		int size = scanner.nextInt();
		int[] height = new int[size];
		System.out.println("Enter the elements into the height : ");
		for (int index = 0; index < size; index++) {
			height[index] = scanner.nextInt();
		}
		int unitsOfWater = trap(height);
		System.out.println("Number of units of water : " + unitsOfWater);
		scanner.close();
	}
}
