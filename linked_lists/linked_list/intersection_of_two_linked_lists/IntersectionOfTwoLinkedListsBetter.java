package intersection_of_two_linked_lists;

import java.util.HashSet;

public class IntersectionOfTwoLinkedListsBetter {
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
		HashSet<ListNode> hashSet = new HashSet<ListNode>();
		while (temp1 != null) {
			hashSet.add(temp1);
			temp1 = temp1.next;
		}
		while (temp2 != null) {
			if (hashSet.contains(temp2)) {
				return temp2;
			}
			temp2 = temp2.next;
		}
		return null;
	}
}
