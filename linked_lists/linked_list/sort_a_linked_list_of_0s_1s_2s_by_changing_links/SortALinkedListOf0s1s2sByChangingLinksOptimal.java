package sort_a_linked_list_of_0s_1s_2s_by_changing_links;

public class SortALinkedListOf0s1s2sByChangingLinksOptimal {
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
		ListNode zeroesDummy = new ListNode(0);
		ListNode onesDummy = new ListNode(1);
		ListNode twosDummy = new ListNode(2);
		ListNode zeroes = zeroesDummy;
		ListNode ones = onesDummy;
		ListNode twos = twosDummy;
		ListNode temp = head;
		while (temp != null) {
			if (temp.val == 0) {
				zeroes.next = temp;
				zeroes = temp;
			} else if (temp.val == 1) {
				ones.next = temp;
				ones = temp;
			} else {
				twos.next = temp;
				twos = temp;
			}
			temp = temp.next;
		}
		zeroes.next = (onesDummy.next != null) ? onesDummy.next : twosDummy.next;
		ones.next = twosDummy.next;
		twos.next = null;
		return zeroesDummy.next;
	}

	public static void main(String[] args) {
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(0);
		head.next.next.next = new ListNode(1);
		head.next.next.next.next = new ListNode(0);
		head.next.next.next.next.next = new ListNode(2);
		SortALinkedListOf0s1s2sByChangingLinksOptimal sortALinkedListOf0s1s2sByChangingLinks = new SortALinkedListOf0s1s2sByChangingLinksOptimal();
		ListNode sorted = sortALinkedListOf0s1s2sByChangingLinks.sortList(head);

		while (sorted != null) {
			System.out.print(sorted.val + " -> ");
			sorted = sorted.next;
		}
	}
}
