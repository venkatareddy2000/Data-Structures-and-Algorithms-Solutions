package leaders_in_an_array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LeadersInAnArrayBrute {
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
		List<Integer> arrayList = new ArrayList<Integer>();
		for (int outerIndex = 0; outerIndex < nums.length - 1; outerIndex++) {
			boolean status = true;
			for (int innerIndex = outerIndex + 1; innerIndex < nums.length; innerIndex++) {
				if (nums[outerIndex] < nums[innerIndex]) {
					status = false;
					break;
				} else {
					continue;
				}
			}
			if (status) {
				arrayList.add(nums[outerIndex]);
			}
		}
		arrayList.add(nums[nums.length - 1]);
		return arrayList;
	}
}
