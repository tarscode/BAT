package List;

/**
 * Created by liuyang on 16/8/5.
 * 链表指定值清除
 */
public class ClearValue {
    public ListNode clear(ListNode head, int val) {
        ListNode pre=head;
        ListNode node =pre.next;
        while (node!=null){
            if (node.val==val){
                node=node.next;
                pre.next = node;
            }
            else{
                pre = node;
                node = node.next;
            }
        }
        //处理头结点
        if (head.val == val){
            head = head.next;
        }
        return head;
    }
}
