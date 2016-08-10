package List;

/**
 * Created by liuyang on 16/8/10.
 * 复杂链表的复制
 */
public class Solution {
    public RandomListNode Clone(RandomListNode pHead) {
        if (pHead == null) {
            return null;
        }
        RandomListNode cur = pHead;
        RandomListNode next = null;
        //复制并连接每一个节点
        while (cur != null) {
            next = cur.next;
            cur.next = new RandomListNode(cur.label);
            cur.next.next = next;
            cur = next;
        }
        cur = pHead;
        RandomListNode curCopy = null;
        //设置复制节点的random值
        while (cur != null) {
            next = cur.next.next;
            curCopy = cur.next;
            curCopy.random = cur.random != null ? cur.random.next : null;
            cur = next;
        }
        RandomListNode res = pHead.next;
        cur = pHead;
        //拆分
        while (cur != null) {
            next = cur.next.next;
            curCopy = cur.next;
            cur.next = next;
            curCopy.next = next != null ? next.next : null;
            cur = next;
        }
        return res;
    }
}

class RandomListNode {
    int label;
    RandomListNode next = null;
    RandomListNode random = null;

    RandomListNode(int label) {
        this.label = label;
    }
}

