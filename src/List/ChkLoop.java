package List;

/**
 * Created by liuyang on 16/8/6.
 * 链表判环
 * 时间:70 ms
 * 空间:1110K
 * 版本:1.0
 */
public class ChkLoop {
    public int chkLoop(ListNode head, int adjust) {
        if (head.next == head) {
            return head.val;
        }
        ListNode slow = head;
        ListNode fast = head;
        while (slow != null&&fast!=null&&fast.next!=null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                fast = head;
                while (fast != slow) {
                    fast = fast.next;
                    slow = slow.next;
                }
                return fast.val;
            }
        }
        return -1;
    }
}

