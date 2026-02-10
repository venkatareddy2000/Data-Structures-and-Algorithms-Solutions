package delete_all_occurences_of_a_key_in_doubly_linked_list;

public class DeleteAllOccurencesOfAKeyInDoublyLinkedList {
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

	public static ListNode deleteAllOccurences(ListNode head, int key) {
		ListNode temp = head;
		while (temp != null) {
			if (temp.val == key) {
				if (temp == head) {
					head = head.next;
					if (head != null) {
						head.previous = null;
					}
				}
				ListNode previous = temp.previous;
				ListNode next = temp.next;
				if (next != null) {
					next.previous = previous;
				}
				if (previous != null) {
					previous.next = next;
				}
				temp = next;
			} else {
				temp = temp.next;
			}
		}
		return head;
	}
}
