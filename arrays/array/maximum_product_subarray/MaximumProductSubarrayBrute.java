package maximum_product_subarray;

import java.util.Scanner;

public class MaximumProductSubarrayBrute {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of the array : ");
		int size = scanner.nextInt();
		int[] nums = new int[size];
		System.out.println("Enter the elements into the array : ");
		for (int index = 0; index < size; index++) {
			nums[index] = scanner.nextInt();
		}
		int maximumProduct = maxProduct(nums);
		System.out.println("The maximum product in the subarray is : " + maximumProduct);
		scanner.close();
	}

	public static int maxProduct(int[] nums) {
		if (nums.length == 1) {
			return nums[0];
		}
		int maximumProduct = 0;
		for (int outerIndex = 0; outerIndex < nums.length; outerIndex++) {
			int maximumProductSubarray = 1;
			for (int innerIndex = outerIndex; innerIndex < nums.length; innerIndex++) {
				maximumProductSubarray = maximumProductSubarray * nums[innerIndex];
				if (maximumProductSubarray > maximumProduct) {
					maximumProduct = maximumProductSubarray;
				}
			}
		}
		return maximumProduct;
	}
}
