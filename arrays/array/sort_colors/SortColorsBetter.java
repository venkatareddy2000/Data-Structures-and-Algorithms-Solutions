package sort_colors;

import java.util.Arrays;
import java.util.Scanner;

public class SortColorsBetter {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of the array : ");
		int size = scanner.nextInt();
		int[] nums = new int[size];
		System.out.println("Enter the elements into the array : ");
		for (int index = 0; index < size; index++) {
			nums[index] = scanner.nextInt();
		}
		sortColors(nums);
		System.out.println("Array after sorting : " + Arrays.toString(nums));
		scanner.close();
	}

	public static void sortColors(int[] nums) {
		int count0 = 0;
		int count1 = 0;
		int count2 = 0;
		for (int index = 0; index < nums.length; index++) {
			if (nums[index] == 0) {
				count0++;
			} else if (nums[index] == 1) {
				count1++;
			} else if (nums[index] == 2) {
				count2++;
			}
		}
		for (int index = 0; index < count0; index++) {
			nums[index] = 0;
		}
		for (int index = count0; index < count0 + count1; index++) {
			nums[index] = 1;
		}
		for (int index = count0 + count1; index < nums.length; index++) {
			nums[index] = 2;
		}
	}
}
