
/**
 * Created by sw on 2018-05-28.
 */

class ListNode{
    int val;
    ListNode next;
    ListNode(int x) { val = x;}
}

public class mergeTwoSortedLists {


    static public ListNode solution(ListNode l1, ListNode l2){
        ListNode ans = new ListNode(0);
        ListNode p = ans;
        ListNode pre = p;
        ListNode p1 = l1;
        ListNode p2 = l2;
        while ((p1 != null) && (p2 != null)){
            p = new ListNode(0);
            if (p1.val <= p2.val){
                p.val = p1.val;
                p1 = p1.next;
            }else{
                p.val = p2.val;
                p2 = p2.next;
            }
            pre.next = p;
            pre = p;
        }

        if (p1 != null){
            while (p1!=null){
                p = new ListNode(0);
                p.val = p1.val;
                p1 = p1.next;
                pre.next = p;
                pre = p;
            }
        }
        if (p2 != null){
            while (p2!=null){
                p = new ListNode(0);
                p.val = p2.val;
                p2 = p2.next;
                pre.next = p;
                pre = p;
            }
        }
        return ans.next;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next  = new ListNode(4);

        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(3);
        l2.next.next  = new ListNode(4);

        ListNode ans = solution(l1, l2);
        while (ans != null){
            System.out.println(ans.val);
            ans= ans.next;
        }
    }
}
