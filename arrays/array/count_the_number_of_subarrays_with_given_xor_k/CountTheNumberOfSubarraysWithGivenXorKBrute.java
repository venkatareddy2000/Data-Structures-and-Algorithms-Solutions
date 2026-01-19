package count_the_number_of_subarrays_with_given_xor_k;

import java.util.Scanner;

public class CountTheNumberOfSubarraysWithGivenXorKBrute {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of the array : ");
		int size = scanner.nextInt();
		int[] nums = new int[size];
		System.out.println("Enter the elements into the array : ");
		for (int index = 0; index < size; index++) {
			nums[index] = scanner.nextInt();
		}
		System.out.println("Enter the target number : ");
		int target = scanner.nextInt();
		int numberOfSubarrays = countTheNumberOfSubarraysWithGivenXorK(nums, target);
		System.out.println("The number of subarrays witht given XOR K is : " + numberOfSubarrays);
		scanner.close();
	}

	public static int countTheNumberOfSubarraysWithGivenXorK(int[] nums, int target) {
		int count = 0;
		for (int outerIndex = 0; outerIndex < nums.length; outerIndex++) {
			for (int innerIndex = outerIndex; innerIndex < nums.length; innerIndex++) {
				int xor = 0;
				for (int thirdLoop = outerIndex; thirdLoop <= innerIndex; thirdLoop++) {
					xor = xor ^ nums[thirdLoop];
				}
				if (xor == target) {
					count++;
				}
			}
		}
		return count;
	}
}
