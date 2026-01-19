package leaders_in_an_array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LeadersInAnArrayOptimal {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of the array : ");
		int size = scanner.nextInt();
		int[] nums = new int[size];
		System.out.println("Enter the elements into the array : ");
		for (int index = 0; index < size; index++) {
			nums[index] = scanner.nextInt();
		}
		List<Integer> leadersInAnArray = leadersInAnArrayBrute(nums);
		System.out.println("The leaders in the given array : " + leadersInAnArray);
		scanner.close();
	}

	private static List<Integer> leadersInAnArrayBrute(int[] nums) {
		int maximum = Integer.MIN_VALUE;
		List<Integer> arrayList = new ArrayList<Integer>();
		for (int index = nums.length - 1; index >= 0; index--) {
			if (nums[index] > maximum) {
				arrayList.add(nums[index]);
				maximum = nums[index];
			}
		}
		return arrayList.reversed();
	}
}
