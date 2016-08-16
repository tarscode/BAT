package List;

/**
 * Created by liuyang on 16/8/16.
 * 单链表相交判断练习题
 */
public class ChkInter {
    public boolean chkInter(ListNode head1, ListNode head2, int adjust0, int adjust1) {
        ListNode interNode1 = chkLoop(head1);
        ListNode interNode2 = chkLoop(head2);
        if((interNode1==null&&interNode2!=null)||(interNode1!=null&&interNode2==null)){
           return false;
        }
        if(interNode1==null&&interNode2==null){
           return chkIntersect(head1,head2);
        }
        if(interNode1!=null&&interNode2!=null){
            return chkInter2(head1,head2);
        }
        return true;
    }
    public boolean chkInter2(ListNode head1, ListNode head2) {
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
        return null;
    }
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
