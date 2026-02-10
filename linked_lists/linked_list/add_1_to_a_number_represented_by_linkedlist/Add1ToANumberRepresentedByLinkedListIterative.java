package add_1_to_a_number_represented_by_linkedlist;

public class Add1ToANumberRepresentedByLinkedListIterative {
	public static class ListNode {
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

	public static ListNode addOne(ListNode head) {
		head = reverse(head);
		int carry = 1;
		ListNode current = head;
		while (current != null && carry > 0) {
			int sum = current.val + carry;
			current.val = sum % 10;
			carry = sum / 10;
			if (current.next == null && carry > 0) {
				current.next = new ListNode(carry);
				carry = 0;
			}
			current = current.next;
		}
		head = reverse(head);
		return head;
	}

	private static ListNode reverse(ListNode temp) {
		ListNode current = temp;
		ListNode previous = null;
		while (current != null) {
			ListNode next = current.next;
			current.next = previous;
			previous = current;
			current = next;
		}
		return previous;
	}

	static void printList(ListNode head) {
		while (head != null) {
			System.out.print(head.val);
			if (head.next != null)
				System.out.print(" -> ");
			head = head.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		ListNode head = new ListNode(1);
		head.next = new ListNode(5);
		head.next.next = new ListNode(9);

		System.out.print("Input:  ");
		printList(head);

		head = addOne(head);

		System.out.print("Output: ");
		printList(head);
	}
}
