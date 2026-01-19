package count_the_number_of_subarrays_with_given_xor_k;

import java.util.HashMap;
import java.util.Scanner;

public class CountTheNumberOfSubarraysWithGivenXorKOptimal {
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
		HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
		hashMap.put(0, 1);
		int prefixXOR = 0;
		for (int index = 0; index < nums.length; index++) {
			prefixXOR = prefixXOR ^ nums[index];
			if (hashMap.containsKey(prefixXOR ^ target)) {
				count += hashMap.get(prefixXOR ^ target);
			}
			hashMap.put(nums[index], hashMap.getOrDefault(nums[index], 0) + 1);
		}
		return count;
	}
}
