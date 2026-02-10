package sort_list;

public class SortListOptimal {
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

	public ListNode sortList(ListNode head) {
		if (head == null || head.next == null) {
			return head;
		}
		ListNode slow = head;
		ListNode fast = head;
		ListNode previous = null;
		while (fast != null && fast.next != null) {
			previous = slow;
			slow = slow.next;
			fast = fast.next.next;
		}
		previous.next = null;
		ListNode left = sortList(head);
		ListNode right = sortList(slow);
		return mergeList(left, right);
	}

	private ListNode mergeList(ListNode left, ListNode right) {
		ListNode dummy = new ListNode(0);
		ListNode tail = dummy;
		while (left != null && right != null) {
			if (left.val <= right.val) {
				tail.next = left;
				left = left.next;
			} else {
				tail.next = right;
				right = right.next;
			}
			tail = tail.next;
		}
		if (left != null) {
			tail.next = left;
		} else {
			tail.next = right;
		}
		return dummy.next;
	}

	public static void main(String[] args) {
		ListNode head = new ListNode(4);
		head.next = new ListNode(2);
		head.next.next = new ListNode(1);
		head.next.next.next = new ListNode(3);
		head.next.next.next.next = new ListNode(5);
		SortListOptimal sortListOptimal = new SortListOptimal();
		ListNode sorted = sortListOptimal.sortList(head);

		while (sorted != null) {
			System.out.print(sorted.val + " -> ");
			sorted = sorted.next;
		}
	}
}
