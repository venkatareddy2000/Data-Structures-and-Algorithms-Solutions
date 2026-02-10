package reverse_linked_list;

import java.util.Stack;

public class ReverseLinkedListBrute {
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

	public ListNode reverseList(ListNode head) {
		ListNode current = head;
		Stack<Integer> stack = new Stack<Integer>();
		while (current != null) {
			stack.push(current.val);
			current = current.next;
		}
		current = head;
		while (current != null) {
			current.val = stack.pop();
			current = current.next;
		}
		return head;
	}
}
