package remove_duplicates_from_sorted_doubly_linked_list;

public class RemoveDuplicatedFromSortedDoublyLinkedList {
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

	public ListNode removeDuplicates(ListNode head) {
		ListNode temp1 = head;
		while (temp1 != null && temp1.next != null) {
			ListNode temp2 = temp1.next;
			while (temp2 != null && temp1.val == temp2.val) {
				temp2 = temp2.next;
			}
			temp1.next = temp2;
			if (temp2 != null)
				temp2.previous = temp1;
			temp1 = temp2;
		}
		return head;
	}
}
