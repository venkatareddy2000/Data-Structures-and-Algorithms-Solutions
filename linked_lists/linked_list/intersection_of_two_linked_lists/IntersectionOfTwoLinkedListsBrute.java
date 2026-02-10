package intersection_of_two_linked_lists;

public class IntersectionOfTwoLinkedListsBrute {
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
		while (temp1 != null) {
			ListNode temp2 = headB;
			while (temp2 != null) {
				if (temp1 == temp2) {
					return temp1;
				}
				temp2 = temp2.next;
			}
			temp1 = temp1.next;
		}
		return null;
	}
}
