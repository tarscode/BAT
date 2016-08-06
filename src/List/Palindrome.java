package List;

import java.util.Stack;

/**
 * Created by liuyang on 16/8/6.
 * 链表的回文结构
 */
public class Palindrome {
    public boolean isPalindrome(ListNode pHead) {
        ListNode node = pHead;
        Stack<Integer> posStack = new Stack<>();
        Stack<Integer> revStack = new Stack<>();
        Stack<Integer> tempStack = new Stack<>();
        while(node!=null){
            posStack.push(node.val);
            tempStack.push(node.val);
            node = node.next;
        }
        while(!tempStack.isEmpty()){
            System.out.println(tempStack.peek());
            revStack.push(tempStack.pop());
        }
        while(!posStack.isEmpty()){
            if(posStack.pop()!=revStack.pop()){
                return false;
            }
        }
        return true;
    }
}
