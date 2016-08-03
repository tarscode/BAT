package List;

/**
 * Created by liuyang on 16/7/25.
 * 环形链表插值
 * 运行时间:258ms
 * 占用内存:4121k
 */


public class InsertValue {
    public ListNode insert(int[] A, int[] nxt, int val) {
        ListNode insertNode = new ListNode(val);
        if (A == null) {
            insertNode.next = insertNode;
            return insertNode;
        }
        ListNode head = new ListNode(A[0]);
        ListNode node = head;
        ListNode next;
        int len = A.length;
        for (int i = 0; i < len - 1; i++) {
            next = new ListNode(A[(i + 1)]);
            node.next = next;
            node = next;
        }

        ListNode pos = head;
        ListNode pas = pos.next;
        while (pas != null) {
            if (pos.val <= insertNode.val && insertNode.val <= pas.val)
                break;
            pos = pas;
            pas = pos.next;
        }
        insertNode.next = pas;
        pos.next = insertNode;
        if (insertNode.val < head.val) {
            return insertNode;
        } else {
            return head;
        }
    }

}

class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}

