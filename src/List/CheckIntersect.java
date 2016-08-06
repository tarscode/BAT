package List;

/**
 * Created by liuyang on 16/8/6.
 * 无环单链表判相交
 */
public class CheckIntersect {
    public boolean chkIntersect(ListNode headA, ListNode headB) {
        while (headA.next != null) {
            headA = headA.next;
        }
        while (headB.next != null) {
            headB = headB.next;
        }
        if (headA == headB)
            return true;
        else
            return false;
    }
}
