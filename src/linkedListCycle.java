/**
 * Created by sw on 2018-06-05.
 */
public class linkedListCycle {
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    static public boolean hasCycle(ListNode head) {
        // 龟兔赛跑算法 https://blog.csdn.net/xiaoquantouer/article/details/51620657
        // 定义两个指针进行追赶，一快一慢，如果慢的能够追上快的，那么就是有环。
        if (head == null) {
            return false;
        }
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (fast == slow) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        System.out.println(hasCycle(head));
    }

}
