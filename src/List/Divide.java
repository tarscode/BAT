package List;

/**
 * Created by liuyang on 16/8/3.
 * 链表的分化
 */
public class Divide {
    public ListNode listDivide(ListNode head, int val) {
        ListNode node = head;
        ListNode preHead = null;
        ListNode preNode = null;
        ListNode nextHead = null;
        ListNode nextNode = null;
        ListNode next = null;
        while (node != null) {
            next = node.next;
            node.next = null;
            if (node.val <= val) {
                if (preHead == null) {
                    preHead = node;
                    preNode = node;
                } else {
                    preNode.next = node;
                    preNode = node;
                }
            } else {
                if (nextHead == null) {
                    nextHead = node;
                    nextNode = node;
                } else {
                    nextNode.next = node;
                    nextNode = node;
                }
            }
            node = next;
        }
        if (preNode != null) {
            preNode.next = nextHead;
        }
        return preHead != null ? preHead : nextHead;
    }
}
