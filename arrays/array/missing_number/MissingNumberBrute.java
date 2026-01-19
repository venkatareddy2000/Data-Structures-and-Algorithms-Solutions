package missing_number;

import java.util.Scanner;

public class MissingNumberBrute {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of the array : ");
		int size = scanner.nextInt();
		int[] nums = new int[size];
		System.out.println("Enter the elements into the array : ");
		for (int index = 0; index < size; index++) {
			nums[index] = scanner.nextInt();
		}
		int missingNumber = missingNumber(nums);
		System.out.println("The missing number in the array : " + missingNumber);
		scanner.close();
	}

	public static int missingNumber(int[] nums) {
		for (int outerIndex = 0; outerIndex < nums.length + 1; outerIndex++) {
			int flag = 0;
			for (int innerIndex = 0; innerIndex < nums.length; innerIndex++) {
				if (nums[innerIndex] == outerIndex) {
					flag = 1;
					break;
				}
			}
			if (flag == 0)
				return outerIndex;
		}
		return -1;
	}
}
