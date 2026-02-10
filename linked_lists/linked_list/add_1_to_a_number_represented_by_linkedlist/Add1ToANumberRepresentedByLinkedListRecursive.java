package add_1_to_a_number_represented_by_linkedlist;

public class Add1ToANumberRepresentedByLinkedListRecursive {
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
		int carry = help(head);
		if (carry == 1) {
			ListNode node = new ListNode(carry);
			node.next = head;
			return node;
		}
		return head;
	}

	private static int help(ListNode head) {
		if (head == null) {
			return 1;
		}
		int carry = help(head.next);
		if (head.val + carry >= 10) {
			head.val = (head.val + carry) % 10;
		} else {
			head.val = head.val + carry;
			carry = 0;
		}
		return carry;
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
		ListNode head = new ListNode(9);
		head.next = new ListNode(9);
		head.next.next = new ListNode(9);

		System.out.print("Input:  ");
		printList(head);

		head = addOne(head);

		System.out.print("Output: ");
		printList(head);
	}
}
