public class removeLinkedListElement {
    static public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    static public ListNode removeElements(ListNode head, int val) {
        if (head == null) return null;
        ListNode root = new ListNode(0);
        root.next = head;
        ListNode pre = root;
        ListNode cur = head;
        while (cur != null) {
            if (cur.val == val) {
                pre.next = cur.next;
            } else {
                pre = cur;
            }
            cur = cur.next;
        }
        return root.next;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(1);
        head.next.next = new ListNode(1);
        head.next.next.next = new ListNode(1);
        head.next.next.next.next = new ListNode(1);
        ListNode ans = removeElements(head, 1);
        while (ans != null) {
            System.out.println(ans.val);
            ans = ans.next;
        }
    }
}
