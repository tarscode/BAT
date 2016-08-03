package List;

/**
 * Created by liuyang on 16/8/3.
 * 访问单个节点的删除
 * 备注:思路转变,不是删除节点,而是进行节点拷贝
 */
public class Remove {
    public boolean removeNode(ListNode pNode) {
        if (pNode.next==null){
            return false;
        }
        pNode.val = pNode.next.val;
        pNode.next = pNode.next.next;
        return true;
    }
}
