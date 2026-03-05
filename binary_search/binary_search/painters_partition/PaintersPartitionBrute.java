package painters_partition;

import java.util.Scanner;

public class PaintersPartitionBrute {
	public static int painterPartition(int[] nums, int k) {
		if (k > nums.length) {
			return -1;
		}
		int maximum = Integer.MIN_VALUE;
		int totalUnits = 0;
		for (int index = 0; index < nums.length; index++) {
			if (nums[index] > maximum) {
				maximum = nums[index];
			}
			totalUnits = totalUnits + nums[index];
		}
		for (int units = maximum; units <= totalUnits; units++) {
			int painters = 1, allocatedUnits = 0;
			for (int index = 0; index < nums.length; index++) {
				if (allocatedUnits + nums[index] > units) {
					painters = painters + 1;
					allocatedUnits = nums[index];
				} else {
					allocatedUnits = allocatedUnits + nums[index];
				}
			}
			if (painters <= k) {
				return units;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of the array : ");
		int size = scanner.nextInt();
		int[] boards = new int[size];
		System.out.println("Enter the elements into the array : ");
		for (int index = 0; index < size; index++) {
			boards[index] = scanner.nextInt();
		}
		System.out.println("Enter the k value : ");
		int k = scanner.nextInt();
		int minimumTimeTaken = painterPartition(boards, k);
		System.out.println("The minimum amount of time taken to paint the walls : " + minimumTimeTaken);
		scanner.close();
	}
}
