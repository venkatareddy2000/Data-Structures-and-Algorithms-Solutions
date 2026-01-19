package single_number;

import java.util.Scanner;

public class SingleNumberBrute {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of the array : ");
		int size = scanner.nextInt();
		int[] nums = new int[size];
		System.out.println("Enter the elements into the array : ");
		for (int index = 0; index < size; index++) {
			nums[index] = scanner.nextInt();
		}
		int singleNumberInArray = singleNumber(nums);
		System.out.println("The single number in the array is : " + singleNumberInArray);
		scanner.close();
	}

	public static int singleNumber(int[] nums) {
		for (int innerIndex = 0; innerIndex < nums.length; innerIndex++) {
			int count = 0;
			for (int outerIndex = 0; outerIndex < nums.length; outerIndex++) {
				if (nums[outerIndex] == nums[innerIndex]) {
					count++;
				}
			}
			if (count == 1) {
				return nums[innerIndex];
			}
		}
		return -1;
	}
}
