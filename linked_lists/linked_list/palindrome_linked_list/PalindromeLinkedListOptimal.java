package palindrome_linked_list;

public class PalindromeLinkedListOptimal {
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

	public static boolean isPalindrome(ListNode head) {
		ListNode slow = head;
		ListNode fast = head;
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		ListNode previous = null;
		ListNode next = null;
		while (slow != null) {
			next = slow.next;
			slow.next = previous;
			previous = slow;
			slow = next;
		}
		ListNode start = head;
		ListNode end = previous;
		while (end != null) {
			if (start.val != end.val) {
				return false;
			}
			start = start.next;
			end = end.next;
		}
		return true;
	}

	public static void main(String[] args) {
		ListNode node4 = new ListNode(1);
		ListNode node3 = new ListNode(2, node4);
		ListNode node2 = new ListNode(2, node3);
		ListNode node1 = new ListNode(1, node2);
		isPalindrome(node1);
	}
}
