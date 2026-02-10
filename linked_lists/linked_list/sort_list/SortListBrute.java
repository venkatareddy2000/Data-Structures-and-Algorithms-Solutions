package sort_list;

import java.util.ArrayList;
import java.util.Collections;

public class SortListBrute {
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

	public ListNode sortList(ListNode head) {
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		ListNode temp = head;
		while (temp != null) {
			arrayList.add(temp.val);
			temp = temp.next;
		}
		Collections.sort(arrayList);
		int index = 0;
		temp = head;
		while (index < arrayList.size()) {
			temp.val = arrayList.get(index);
			index++;
			temp = temp.next;
		}
		return head;
	}
}
