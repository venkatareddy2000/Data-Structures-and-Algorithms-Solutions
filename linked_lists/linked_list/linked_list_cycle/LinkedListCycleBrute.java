package linked_list_cycle;

import java.util.HashSet;

public class LinkedListCycleBrute {
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

	public boolean hasCycle(ListNode head) {
		HashSet<ListNode> hashSet = new HashSet<ListNode>();
		ListNode temp = head;
		while (temp != null) {
			if (hashSet.contains(temp)) {
				return true;
			}
			hashSet.add(temp);
			temp = temp.next;
		}
		return false;
	}
}
