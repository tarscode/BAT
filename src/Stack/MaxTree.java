package Stack;

import Util.Util;

import java.util.Stack;

/**
 * Created by liuyang on 16/7/23.
 * 数组变树
 *版本2.0
 */

public class MaxTree {
    public int[] buildMaxTree(int[] A, int n) {
        int[] res = new int[n];
        for(int i=0; i<n; i++){
            res[i] = -1;
        }
        Stack<Integer> stack = new Stack<Integer>();
        for(int i=0; i<n; i++){
            while(!stack.empty() && A[stack.peek()]<A[i]){
                if(res[stack.peek()] == -1 || A[res[stack.peek()]] > A[i]){
                    res[stack.peek()] = i;
                }
                stack.pop();
            }
            if(!stack.empty()){
                res[i] = stack.peek();
            }
            stack.push(i);
        }
        return res;
    }
}
