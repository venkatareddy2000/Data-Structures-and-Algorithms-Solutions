package find_all_pairs_with_given_sum_in_doubly_linked_list;

import java.util.ArrayList;
import java.util.List;

public class FindAllPairsWithGivenSumInDoublyLinkedListBrute {
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
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		ListNode temp1 = head;
		while (temp1 != null) {
			ListNode temp2 = temp1.next;
			while (temp2 != null) {
				if (temp1.val + temp2.val == sum) {
					List<Integer> pairs = new ArrayList<Integer>();
					pairs.add(temp1.val);
					pairs.add(temp2.val);
					result.add(pairs);
				}
				temp2 = temp2.next;
			}
			temp1 = temp1.next;
		}
		return result;
	}
}
