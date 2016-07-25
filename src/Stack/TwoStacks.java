package Stack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

/**
 * Created by liuyang on 16/7/16.
 * 双栈排序
 * 版本2.0
 */
public class TwoStacks {
    public ArrayList<Integer> twoStacksSort(int[] numbers) {
        Stack<Integer> dataStack = new Stack<>();
        Stack<Integer> tempStack = new Stack<>();
        int n = numbers.length;
        for (int i = 0; i < n; i++) {
            dataStack.push(Integer.valueOf(numbers[i]));
        }
        while(!dataStack.isEmpty()){
            int data = dataStack.pop();
            while (!tempStack.isEmpty()&&data>tempStack.peek()){
                dataStack.push(tempStack.pop());
            }
            tempStack.push(data);
        }
        ArrayList<Integer> list = new ArrayList<>();
        while(!tempStack.isEmpty()){
            list.add(0,tempStack.pop());
        }
        return list;
    }
}
