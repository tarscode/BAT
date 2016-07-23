package Stack;

import Util.Util;

import java.util.Stack;

/**
 * Created by liuyang on 16/7/23.
 * 数组变树
 */
public class MaxTree {
    public int[] buildMaxTree(int[] A, int n) {
        Stack<Integer> maxLeftStack = new Stack<>();
        Stack<Integer> maxRightStack = new Stack<>();
        int[] maxTree = new int[n];
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                maxLeftStack.push(i);
            }
            if(A[i]>A[maxLeftStack.peek()]){
                while (A[i] > A[maxLeftStack.peek()]) {
                    maxLeftStack.pop();
                    if(maxLeftStack.empty()){
                        maxLeftStack.push(i);
                    }
                }
                maxTree[i] = maxLeftStack.peek();
                maxLeftStack.push(i);
            }else{
                maxTree[i] = maxLeftStack.peek();
                maxLeftStack.push(i);
            }
        }
        //Util.printArray(maxTree);
        for (int i = n - 1; i >= 0; i--) {
            if (i == n - 1) {
                maxRightStack.push(i);
            }
            System.out.println("i:"+i+" "+A[i]+" "+A[maxRightStack.peek()]);
            if (A[i] > A[maxRightStack.peek()]) {
                while (A[i] > A[maxRightStack.peek()]) {
                    maxRightStack.pop();
                    if(maxRightStack.empty()){
                        maxRightStack.push(i);
                    }
                }
                System.out.println("maxTree"+A[maxTree[i]]);
                System.out.println("maxPeek:"+A[maxRightStack.peek()]);
                if (maxRightStack.peek() == i && maxTree[i] == maxRightStack.peek()) {
                    maxTree[i] = -1;
                }
                if (maxRightStack.peek() != i && A[maxTree[i]] > A[maxRightStack.peek()]) {
                    maxTree[i] = maxRightStack.peek();
                }
                if (maxRightStack.peek() != i && maxTree[i]==i) {
                    maxTree[i] = maxRightStack.peek();
                }
                System.out.println("Peek1:"+maxRightStack.peek());
                maxRightStack.push(i);
            } else {
                System.out.println("Peek2:"+maxRightStack.peek());
                if (maxRightStack.peek() == i && maxTree[i] == maxRightStack.peek()) {
                    maxTree[i] = -1;
                }
                if (maxRightStack.peek() != i && A[maxTree[i]] > A[maxRightStack.peek()]) {
                    maxTree[i] = maxRightStack.peek();
                }
                if (maxRightStack.peek() != i && maxTree[i]==i) {
                    maxTree[i] = maxRightStack.peek();
                }
                maxRightStack.push(i);
            }
        }
        return maxTree;
    }
}
