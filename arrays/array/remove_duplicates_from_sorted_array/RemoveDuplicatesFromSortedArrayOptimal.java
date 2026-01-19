package remove_duplicates_from_sorted_array;

import java.util.Scanner;

public class RemoveDuplicatesFromSortedArrayOptimal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of the array : ");
		int size = scanner.nextInt();
		int[] nums = new int[size];
		System.out.println("Enter the elements into the array : ");
		for (int index = 0; index < size; index++) {
			nums[index] = scanner.nextInt();
		}
		int uniqueElements = removeDuplicates(nums);
		System.out.println("The number of unique elements after removing duplicate from the array : " + uniqueElements);
		scanner.close();
	}

	public static int removeDuplicates(int[] nums) {
		int pointer = 0;
		for (int index = 1; index < nums.length; index++) {
			if (nums[index] != nums[index - 1]) {
				pointer++;
				nums[pointer] = nums[index];
			}
		}
		return pointer + 1;
	}
}
