package linked_list_cycle_II;

import java.util.HashSet;

public class LinkedListCycleIIBrute {
	public class ListNode {
		int val;
		ListNode next;

		ListNode() {
		}

		ListNode(int val) {
			this.val = val;
		}

		ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}
	}

	public ListNode hasCycle(ListNode head) {
		HashSet<ListNode> hashSet = new HashSet<ListNode>();
		ListNode temp = head;
		while (temp != null) {
			if (hashSet.contains(temp)) {
				return temp;
			}
			hashSet.add(temp);
			temp = temp.next;
		}
		return null;
	}
}
