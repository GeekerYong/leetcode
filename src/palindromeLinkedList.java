import java.util.List;

/**
 * Created by sw on 2018-06-08.
 */
public class palindromeLinkedList {
    static public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    static public ListNode reverseList(ListNode head) {
        //这种方法满足空间复杂度
        ListNode temp = head;
        ListNode pre = head;
        ListNode cur = head.next;
        while (cur != null) {
            temp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = temp;
        }
        head.next = null;
        return pre;
    }

    static public ListNode reverseList2(ListNode head) {
        //这种方法不满足空间复杂度
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

    static public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) {
            return true;
        }
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        if (fast != null) {
            slow.next = reverseList(slow.next);
            slow = slow.next;
        } else {
            slow = reverseList(slow);
        }

        while (slow != null) {
            if (head.val != slow.val) {
                return false;
            }
            slow = slow.next;
            head = head.next;
        }
        return true;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(1);
        System.out.println(isPalindrome(head));
    }
}
