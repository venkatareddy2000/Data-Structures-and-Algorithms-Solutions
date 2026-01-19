package missing_number;

import java.util.Scanner;

public class MissingNumberOptimal2 {
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
		int XOR1 = 0;
		int XOR2 = 0;
		int index = 0;
		for (index = 0; index < nums.length; index++) {
			XOR1 = XOR1 ^ (index);
			XOR2 = XOR2 ^ nums[index];
		}
		XOR1 = XOR1 ^ index;
		return XOR1 ^ XOR2;
	}
}
