package delete_the_middle_node_of_a_linked_list;

public class DeleteTheMiddleNodeOfALinkedListBrute {
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

	public ListNode deleteMiddle(ListNode head) {
		if (head.next == null) {
			return null;
		}
		int count = 0;
		ListNode temp = head;
		while (temp != null) {
			count++;
			temp = temp.next;
		}
		int mid = count / 2;
		temp = head;
		for (int index = 1; index < mid; index++) {
			temp = temp.next;
		}
		temp.next = temp.next.next;
		return head;
	}
}
