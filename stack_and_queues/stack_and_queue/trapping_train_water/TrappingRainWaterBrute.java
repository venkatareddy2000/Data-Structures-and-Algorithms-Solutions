package trapping_train_water;

import java.util.Scanner;

public class TrappingRainWaterBrute {
	public static int trap(int[] height) {
		int size = height.length;
		int[] prefixMax = new int[size];
		int[] suffixMax = new int[size];
		prefixMax[0] = height[0];
		for (int index = 1; index < size; index++) {
			if (height[index] > prefixMax[index - 1]) {
				prefixMax[index] = height[index];
			} else {
				prefixMax[index] = prefixMax[index - 1];
			}
		}
		suffixMax[size - 1] = height[size - 1];
		for (int index = size - 2; index >= 0; index--) {
			if (height[index] > suffixMax[index + 1]) {
				suffixMax[index] = height[index];
			} else {
				suffixMax[index] = suffixMax[index + 1];
			}
		}
		int total = 0;
		for (int index = 0; index < size; index++) {
			int prefixMaximum = prefixMax[index];
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
