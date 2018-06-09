/**
 * Created by sw on 2018-06-09.
 */
public class deleteNodeInALinkedList {
    static public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    static public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;

    }

    public static void main(String[] args) {
        ListNode head = new ListNode(4);
        head.next = new ListNode(5);
        head.next.next = new ListNode(1);
        head.next.next.next = new ListNode(9);

        deleteNode(head.next.next);

        while (head != null) {
            System.out.println(head.val);
            head = head.next;

        }
    }
}
