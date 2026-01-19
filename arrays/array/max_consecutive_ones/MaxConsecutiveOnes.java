package max_consecutive_ones;

import java.util.Scanner;

public class MaxConsecutiveOnes {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of the array : ");
		int size = scanner.nextInt();
		int[] nums = new int[size];
		System.out.println("Enter the elements into the array : ");
		for (int index = 0; index < size; index++) {
			nums[index] = scanner.nextInt();
		}
		int maxConsecutiveOnes = findMaxConsecutiveOnes(nums);
		System.out.println("The number of maximum consecutive ones in the array is : " + maxConsecutiveOnes);
		scanner.close();
	}

	public static int findMaxConsecutiveOnes(int[] nums) {
		int count = 0;
		int maxConsecutiveOnes = 0;
		for (int index = 0; index < nums.length; index++) {
			if (nums[index] == 1) {
				count++;
				if (count > maxConsecutiveOnes) {
					maxConsecutiveOnes = count;
				}
			} else {
				count = 0;
			}
		}
		return maxConsecutiveOnes;
	}
}
