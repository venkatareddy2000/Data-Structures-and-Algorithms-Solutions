package asteroid_collision;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class AsteroidCollision {
	public static int[] asteroidCollision(int[] asteroids) {
		List<Integer> list = new ArrayList<Integer>();
		for (int index = 0; index < asteroids.length; index++) {
			if (asteroids[index] > 0) {
				list.add(asteroids[index]);
			} else {
				while (!list.isEmpty() && list.getLast() > 0 && list.getLast() < Math.abs(asteroids[index])) {
					list.removeLast();
				}
				if (!list.isEmpty() && list.getLast() == Math.abs(asteroids[index])) {
					list.removeLast();
				} else if (list.isEmpty() || list.getLast() < 0) {
					list.add(asteroids[index]);
				}
			}
		}
		return list.stream().mapToInt(i -> i).toArray();
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of the array : ");
		int size = scanner.nextInt();
		int[] asteroids = new int[size];
		System.out.println("Enter the elements into the height : ");
		for (int index = 0; index < size; index++) {
			asteroids[index] = scanner.nextInt();
		}
		int[] collision = asteroidCollision(asteroids);
		System.out.println("Elements left after asteriod collision : " + Arrays.toString(collision));
		scanner.close();
	}
}
