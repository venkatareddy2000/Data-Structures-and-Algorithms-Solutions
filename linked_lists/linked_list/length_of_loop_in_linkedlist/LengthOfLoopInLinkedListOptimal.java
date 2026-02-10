package length_of_loop_in_linkedlist;

public class LengthOfLoopInLinkedListOptimal {
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
		int count = 0;
		boolean flag = false;
		ListNode slow = head;
		ListNode fast = head;
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if (slow == fast) {
				flag = true;
				break;
			}
		}
		if (flag == true) {
			ListNode start = slow;
			ListNode current = slow.next;
			count = 1;
			while (current != start) {
				count++;
				current = current.next;
			}
		}
		return count;
	}
}
