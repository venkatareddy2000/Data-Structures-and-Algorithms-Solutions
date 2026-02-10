package rotate_list;

public class RotateList {
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

	public ListNode rotateRight(ListNode head, int k) {
		if (head == null && k == 0) {
			return head;
		}
		ListNode temp = head;
		int lengthOfList = findLength(temp);
		k = k % lengthOfList;
		if (k == 0) {
			return head;
		}
		temp = head;
		ListNode kthNode = getKthNode(temp, lengthOfList - k);
		ListNode newHead = kthNode.next;
		kthNode.next = null;
		ListNode headTraversal = newHead;
		while (headTraversal.next != null) {
			headTraversal = headTraversal.next;
		}
		headTraversal.next = head;
		return newHead;
	}

	private int findLength(ListNode temp) {
		int count = 0;
		while (temp != null) {
			count++;
			temp = temp.next;
		}
		return count;
	}

	public ListNode getKthNode(ListNode temp, int k) {
		k = k - 1;
		while (temp != null && k > 0) {
			temp = temp.next;
			k--;
		}
		return temp;
	}
}
