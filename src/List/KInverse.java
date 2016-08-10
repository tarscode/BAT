package List;

/**
 * Created by liuyang on 16/8/5.
 * 链表的k逆序
 */
public class KInverse {
    public ListNode inverse(ListNode head, int k) {
        if (k < 2) {
            return head;
        }
        ListNode cur = head;
        ListNode start = null;
        ListNode pre = null;
        ListNode next = null;
        int count = 1;
        while (cur != null) {
            next = cur.next;
            if (count == k) {
                start = pre == null ? head : pre.next;
                head = pre == null ? cur : head;
                resign(pre, start, cur, next);
                pre = start;
                count = 0;
            }
            count++;
            cur = next;
        }
        return head;
    }

    public void resign(ListNode left, ListNode start, ListNode end, ListNode right) {
        ListNode pre = start;
        ListNode cur = start.next;
        ListNode next = null;
        while (cur != right) {
            next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        if (left != null) {
            left.next = end;
        }
        start.next = right;
    }
}
