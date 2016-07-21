package Stack;

import java.util.Stack;

/**
 * Created by liuyang on 16/7/16.
 * 栈的反转
 */
public class StackReverse {
    public int[] reverseStack(int[] A, int n) {
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<n;i++){
            stack.push(Integer.valueOf(A[i]));
        }
        stack = reverse(stack);
        for(int i=n-1;i>=0;i--){
            A[i]=(stack.pop()).intValue();
        }
        return A;
    }
    public Stack<Integer>reverse(Stack<Integer> stack){
        if(stack.isEmpty()){
            return stack;
        }
        int i = get(stack);
        reverse(stack);
        stack.push(i);
        return stack;
    }
    public int get(Stack<Integer> stack){
        int result = stack.pop();
        if(stack.isEmpty()){
            return result;
        }
        else{
            int last = get(stack);
            stack.push(result);
            return last;
        }
    }
}
