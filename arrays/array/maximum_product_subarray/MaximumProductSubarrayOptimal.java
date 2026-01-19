package maximum_product_subarray;

import java.util.Scanner;

public class MaximumProductSubarrayOptimal {
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
		int prefixProduct = 1;
		int suffixProduct = 1;
		for (int index = 0; index < nums.length; index++) {
			if (prefixProduct == 0) {
				prefixProduct = 1;
			}
			if (suffixProduct == 0) {
				suffixProduct = 1;
			}
			prefixProduct = prefixProduct * nums[index];
			suffixProduct = suffixProduct * nums[nums.length - index - 1];
			maximumProduct = Math.max(maximumProduct, Math.max(prefixProduct, suffixProduct));
		}
		return maximumProduct;
	}
}
