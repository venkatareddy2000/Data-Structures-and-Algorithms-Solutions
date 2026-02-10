package sort_a_linked_list_of_0s_1s_2s_by_changing_links;

public class SortALinkedListOf0s1s2sByChangingLinksBrute {
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
		int count0 = 0;
		int count1 = 0;
		int count2 = 0;
		ListNode temp = head;
		while (temp != null) {
			if (temp.val == 0) {
				count0++;
			} else if (temp.val == 1) {
				count1++;
			} else {
				count2++;
			}
			temp = temp.next;
		}
		temp = head;
		while (temp != null) {
			if (count0 > 0) {
				temp.val = 0;
				count0--;
			} else if (count1 > 0) {
				temp.val = 1;
				count1--;
			} else {
				temp.val = 2;
				count2--;
			}
			temp = temp.next;
		}
		return head;
	}

	public static void main(String[] args) {
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(0);
		head.next.next.next = new ListNode(1);
		head.next.next.next.next = new ListNode(0);
		head.next.next.next.next.next = new ListNode(2);
		SortALinkedListOf0s1s2sByChangingLinksBrute sortALinkedListOf0s1s2sByChangingLinks = new SortALinkedListOf0s1s2sByChangingLinksBrute();
		ListNode sorted = sortALinkedListOf0s1s2sByChangingLinks.sortList(head);

		while (sorted != null) {
			System.out.print(sorted.val + " -> ");
			sorted = sorted.next;
		}
	}
}
