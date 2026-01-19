package remove_duplicates_from_sorted_array;

import java.util.ArrayList;
import java.util.Scanner;

public class RemoveDuplicatesFromSortedArrayBrute {

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
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		arrayList.add(nums[0]);
		for (int index = 1; index < nums.length; index++) {
			if (nums[index] != nums[index - 1]) {
				arrayList.add(nums[index]);
			}
		}
		for (int index = 0; index < arrayList.size(); index++) {
			nums[index] = arrayList.get(index);
		}
		return arrayList.size();
	}
}
