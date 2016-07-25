package Stack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

/**
 * Created by liuyang on 16/7/16.
 * 双栈排序
 * 有两个一样小的
 */
public class TwoStacks {
    public ArrayList<Integer> twoStacksSort(int[] numbers) {
        Stack<Integer> dataStack = new Stack<>();
        Stack<Integer> tempStack = new Stack<>();
        int n = numbers.length;
        for (int i = 0; i < n; i++) {
            dataStack.push(Integer.valueOf(numbers[i]));
        }
        while (!dataStack.isEmpty()){
            if(tempStack.isEmpty()){
                tempStack.push(dataStack.pop());
                continue;
            }
            int data = dataStack.pop();
            while(data>=tempStack.peek()){
                dataStack.push(tempStack.pop());
                if(!tempStack.isEmpty()){
                    continue;
                }
                else{
                    break;
                }

            }
            if(tempStack.isEmpty()){
                tempStack.push(data);
            }else{
                dataStack.push(data);
            }
            if((tempStack.peek()).equals(dataStack.peek())){
                tempStack.push(dataStack.pop());
            }
            if(data<tempStack.peek()){
                tempStack.push(data);
            }
        }
        ArrayList<Integer> list = new ArrayList<>();
        while(!tempStack.isEmpty()){
            list.add(0,tempStack.pop());
        }
        return list;
    }
}
/*
public class TwoStacks {

    public ArrayList<Integer> twoStacksSort(int[] numbers) {
        Stack<Integer> dataStack = new Stack<>();
        Stack<Integer> tempStack = new Stack<>();
        int n = numbers.length;
        for (int i = 0; i < n; i++) {
            dataStack.push(Integer.valueOf(numbers[n - i - 1]));
        }
        for (int i = 0; i < n; i++) {
            Integer min = dataStack.peek();
            for (int j = 0; j < n - i; j++) {
                if (dataStack.peek() < min) {
                    min = dataStack.peek();
                }
                tempStack.push(dataStack.pop());
            }
            dataStack.push(min);
            for (int j = 0; j < n - i; j++) {
                if (tempStack.peek() == min) {
                    tempStack.pop();
                    continue;
                }
                dataStack.push(tempStack.pop());
            }
        }
        for (int i = 0; i < n; i++) {
            numbers[i] = (dataStack.pop()).intValue();
        }
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            list.add(Integer.valueOf(numbers[i]));
        }
        return list;
    }
}
*/
