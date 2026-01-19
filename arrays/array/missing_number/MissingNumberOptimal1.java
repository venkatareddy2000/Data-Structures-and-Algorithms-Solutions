package missing_number;

import java.util.Scanner;

public class MissingNumberOptimal1 {
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
		int sum = 0;
		for (int index = 0; index < nums.length; index++) {
			sum = sum + nums[index];
		}
		int sumOfNNaturalNumbers = ((nums.length) * (nums.length + 1)) / 2;
		return sumOfNNaturalNumbers - sum;
	}
}
