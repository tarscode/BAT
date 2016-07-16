package Stack;

import java.util.Stack;

/**
 * Created by liuyang on 16/7/16.
 * 可查询最值的栈
 */
public class Solution {
    private Stack<Integer> stack = new Stack<Integer>();
    private Stack<Integer> minStack = new Stack<Integer>();

    public void push(int node) {
        stack.push(Integer.valueOf(node));
        if (minStack.empty()||stack.peek() < minStack.peek()) {
            minStack.push(Integer.valueOf(node));
        } else {
            minStack.push(minStack.peek());
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