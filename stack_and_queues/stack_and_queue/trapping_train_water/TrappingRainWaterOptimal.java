package trapping_train_water;

import java.util.Scanner;

public class TrappingRainWaterOptimal {
	public static int trap(int[] height) {
		int leftMax = Integer.MIN_VALUE, rightMax = Integer.MIN_VALUE;
		int left = 0, right = height.length - 1;
		int total = 0;
		while (left < right) {
			if (height[left] < height[right]) {
				if (leftMax > height[left]) {
					total = total + leftMax - height[left];
				} else {
					leftMax = height[left];
				}
				left++;
			} else {
				if (rightMax > height[right]) {
					total = total + rightMax - height[right];
				} else {
					rightMax = height[right];
				}
				right--;
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
