package List;

/**
 * Created by liuyang on 16/8/16.
 * 有环单链表相交判断
 */
public class ChkIntersection {
    public boolean chkInter(ListNode head1, ListNode head2, int adjust0, int adjust1) {
        ListNode interNode1 = chkLoop(head1);
        ListNode interNode2 = chkLoop(head2);
        if(interNode1==interNode2){
            return true;
        }
        ListNode node = interNode1.next;
        while (node!=interNode1){
            if(node == interNode2){
                return true;
            }
            node = node.next;
        }
        return false;
    }
    public ListNode chkLoop(ListNode head) {
        if (head.next == head) {
            return head;
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
                return fast;
            }
        }
        return head;
    }
}
