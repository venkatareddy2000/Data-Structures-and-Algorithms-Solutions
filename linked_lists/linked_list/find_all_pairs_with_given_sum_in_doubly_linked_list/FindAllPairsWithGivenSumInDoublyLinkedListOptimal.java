package find_all_pairs_with_given_sum_in_doubly_linked_list;

import java.util.ArrayList;
import java.util.List;

public class FindAllPairsWithGivenSumInDoublyLinkedListOptimal {
	public class ListNode {
		int val;
		ListNode next;
		ListNode previous;

		ListNode(int val) {
			this.val = val;
			this.next = null;
			this.previous = null;
		}
	}

	public static List<List<Integer>> findPairsWithGivenSum(ListNode head, int sum) {
		ListNode pointer1 = head;
		ListNode pointer2 = head;
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		while (pointer2.next != null) {
			pointer2 = pointer2.next;
		}
		while (pointer1 != pointer2 && pointer2.previous != pointer1) {
			int totalSum = pointer1.val + pointer2.val;
			if (totalSum == sum) {
				List<Integer> pairs = new ArrayList<Integer>();
				pairs.add(pointer1.val);
				pairs.add(pointer2.val);
				result.add(pairs);
				pointer1 = pointer1.next;
				pointer2 = pointer2.previous;
			} else if (totalSum > sum) {
				pointer2 = pointer2.previous;
			} else {
				pointer1 = pointer1.next;
			}
		}
		return result;
	}
}
