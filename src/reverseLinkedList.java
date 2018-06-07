import java.util.List;

/**
 * Created by sw on 2018-06-07.
 */
public class reverseLinkedList {
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    static public ListNode solution(ListNode head) {
        ListNode ansCur = null;
        ListNode cur = head;
        while (cur != null) {
            ListNode temp = new ListNode(cur.val);
            temp.next = ansCur;
            ansCur = temp;
            cur = cur.next;
        }
        return ansCur;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);

        ListNode ans = solution(head);

        while (ans != null) {
            System.out.println(ans.val);
            ans = ans.next;
        }
    }
}
