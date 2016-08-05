package List;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by liuyang on 16/8/4.
 * 打印两个链表的公共值
 */
public class Common {
    public int[] findCommonParts(ListNode headA, ListNode headB) {
        List<Integer> list = new ArrayList<>();
        while (headA!=null&&headB!=null){
            if (headA.val>headB.val){
                headB = headB.next;
            }else if(headA.val<headB.val){
                headA = headA.next;
            }else{
                list.add(headA.val);
                headA = headA.next;
                headB = headB.next;
            }
        }
        int len = list.size();
        int [] arr = new int[len];
        for(int i=0;i<len;i++){
            arr[i] = list.get(i);
        }
        return arr;
    }
}
