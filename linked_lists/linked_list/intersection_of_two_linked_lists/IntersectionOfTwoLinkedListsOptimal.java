package intersection_of_two_linked_lists;

public class IntersectionOfTwoLinkedListsOptimal {
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

	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		ListNode temp1 = headA;
		ListNode temp2 = headB;
		int headACount = 0;
		int headBCount = 0;
		while (temp1 != null) {
			headACount++;
			temp1 = temp1.next;
		}
		while (temp2 != null) {
			headBCount++;
			temp2 = temp2.next;
		}
		if (headACount > headBCount) {
			int extraLength = headACount - headBCount;
			temp1 = headA;
			while (extraLength > 0) {
				temp1 = temp1.next;
				extraLength--;
			}
			temp2 = headB;
		} else {
			int extraLength = headBCount - headACount;
			temp2 = headB;
			while (extraLength > 0) {
				temp2 = temp2.next;
				extraLength--;
			}
			temp1 = headA;
		}
		while (temp1 != null && temp2 != null) {
			if (temp1 == temp2) {
				return temp1;
			}
			temp1 = temp1.next;
			temp2 = temp2.next;
		}
		return null;
	}
}
