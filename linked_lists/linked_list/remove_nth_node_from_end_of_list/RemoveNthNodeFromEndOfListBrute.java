package remove_nth_node_from_end_of_list;

public class RemoveNthNodeFromEndOfListBrute {
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

	public ListNode removeNthFromEnd(ListNode head, int n) {
		int count = 0;
		ListNode temp = head;
		while (temp != null) {
			count++;
			temp = temp.next;
		}
		if (n == count) {
			return head.next;
		}
		temp = head;
		for (int index = 1; index < count - n; index++) {
			temp = temp.next;
		}
		temp.next = temp.next.next;
		return head;
	}
}
