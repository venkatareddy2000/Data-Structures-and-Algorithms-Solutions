package find_peak_element;

import java.util.Scanner;

public class FindPeakElementBrute {
	public static int findPeakElement(int[] nums) {
		for (int index = 0; index < nums.length - 1; index++) {
			if (nums[index] > nums[index + 1]) {
				return index;
			}
		}
		return nums.length - 1;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of the array : ");
		int size = scanner.nextInt();
		int[] nums = new int[size];
		System.out.println("Enter the elements into the array : ");
		for (int index = 0; index < size; index++) {
			nums[index] = scanner.nextInt();
		}
		int peakElement = findPeakElement(nums);
		System.out.println("Peak element index in the array : " + peakElement);
		scanner.close();
	}
}
