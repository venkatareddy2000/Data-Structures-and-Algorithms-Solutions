package remove_duplicates_from_sorted_array;

import java.util.HashSet;
import java.util.Scanner;

public class RemoveDuplicatesFromSortedArrayUsingSet {

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
		HashSet<Integer> hashSet = new HashSet<Integer>();
		for (int index = 0; index < nums.length; index++) {
			hashSet.add(nums[index]);
		}
		return hashSet.size();
	}
}
