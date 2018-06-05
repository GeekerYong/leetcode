/**
 * Created by sw on 2018-06-05.
 */
public class intersectionOfTwoLinkedLists {
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    static public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        // 将一个链表访问到末尾，然后将其与另一个链表相连接，再重头开始访问，若存在环，则两个链表相交
        // 判断入口的方法：将其中一个指针移到链表起点，两者同时移动，每次移动一步，那么两者相遇的地方就是环的起点。
        if (headA == null || headB == null) {
            return null;
        }
        ListNode last;
        ListNode pA = headA;
        ListNode pB = headB;
        while (pA.next != null) {
            pA = pA.next;
        }
        last = pA;
        last.next = pB;//与另一个链表连接

        //龟兔赛跑判定环是否存在
        ListNode slow = headA;
        ListNode fast = headA;
        boolean flag = false; //有无环判断
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                flag = true;
                break;
            }
        }
        //确定环的起点
        if (flag) {
            //有环
            slow = headA;
            while (slow != fast) {
                slow = slow.next;
                fast = fast.next;

            }
            last.next = null; //恢复链表结构
            return slow;
        } else {
            //无环
            last.next = null;
            return null;
        }
    }

    public static void main(String[] args) {
        ListNode A = new ListNode(1);
        ListNode B = new ListNode(11);
        A.next = new ListNode(2);
        A.next.next = new ListNode(3);
        A.next.next.next = new ListNode(4);
        B.next = new ListNode(22);
        B.next.next = A.next.next;
        System.out.println(getIntersectionNode(A, B).val);
    }
}
