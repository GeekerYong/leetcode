/**
 * Created by sw on 2018-05-30.
 */

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) { val = x; }
 * }
 */
public class removeDuplicatesFromSortedList {
    static public ListNode solution(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode ans = new ListNode(head.val);
        ListNode p = head.next;
        ListNode q = ans;
        while (p != null) {
            if (p.val != q.val) {
                q.next = new ListNode(p.val);
                q = q.next;
                p = p.next;
            } else {
                p = p.next;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(1);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(3);

        ListNode ans = solution(head);
        while (ans != null) {
            System.out.println(ans.val);
            ans = ans.next;
        }
    }
}
