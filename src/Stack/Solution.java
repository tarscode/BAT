package Stack;

import java.util.Stack;

/**
 * Created by liuyang on 16/7/16.
 * 可查询最值的栈
 */
public class Solution {
    Stack<Integer> stack = new Stack();
    Stack<Integer> minStack = new Stack<>();

    public void push(int node) {
        stack.push(Integer.valueOf(node));
        if(minStack.empty()){
            minStack.push(Integer.valueOf(node));
        }
        if (stack.peek() > minStack.peek()) {
            minStack.push(minStack.peek());
        } else {
            minStack.push(Integer.valueOf(node));
        }
    }

    public void pop() {
        stack.pop();
        minStack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int min() {
        return minStack.peek();
    }
}