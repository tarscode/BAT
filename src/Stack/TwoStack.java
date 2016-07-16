package Stack;

import java.util.Stack;

/**
 * Created by liuyang on 16/7/16.
 * 双栈队列
 */
public class TwoStack {
    public int[] twoStack(int[] ope, int n) {
        Stack<Integer> positiveStack = new Stack<Integer>();
        Stack<Integer> reverseStack = new Stack<Integer>();
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (ope[i] != 0) {
                positiveStack.push(Integer.valueOf(ope[i]));
            } else {
                count++;
            }
        }
        while (!positiveStack.empty()) {
            reverseStack.push(positiveStack.pop());
        }
        int[] ope2 = new int[count];
        for(int i = 0;i<count;i++){
            ope2[i] = (reverseStack.pop()).intValue();
        }
        return ope2;
    }
}
