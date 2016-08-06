package List;

/**
 * Created by liuyang on 16/8/6.
 * 链表判环
 */
public class ChkLoop {
    public int chkLoop(ListNode head, int adjust) {
        ListNode pre;
        ListNode node = head;
        ListNode end = new ListNode(-1);
        while (node != null) {
            if (node.next != end) {
                pre = node;
                node = node.next;
                pre.next = end;
            } else {
                return node.val;
            }
        }
        return -1;
    }
}
