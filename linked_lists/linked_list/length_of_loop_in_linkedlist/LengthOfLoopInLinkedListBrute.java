package length_of_loop_in_linkedlist;

import java.util.HashSet;

public class LengthOfLoopInLinkedListBrute {
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

	public int lengthOfLoop(ListNode head) {
		HashSet<ListNode> hashSet = new HashSet<ListNode>();
		int count = 0;
		boolean flag = false;
		ListNode temp = head;
		while (temp != null) {
			if (hashSet.contains(temp)) {
				flag = true;
				break;
			}
			hashSet.add(temp);
			temp = temp.next;
		}
		if (flag == true) {
			ListNode start = temp;
			ListNode current = temp.next;
			count = 1;
			while (current != start) {
				count++;
				current = current.next;
			}
		}
		return count;
	}
}
