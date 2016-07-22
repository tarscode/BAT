package Stack;

import java.util.LinkedList;

/**
 * Created by liuyang on 16/7/21.
 * 滑动窗口
 */
public class SlideWindow {
    public int[] slide(int[] arr, int n, int w) {
        LinkedList<Integer> qmax = new LinkedList<>();
        int res[] = new int[n-w+1];
        int index = 0;
        for(int i=0;i<n;i++){
            while(!qmax.isEmpty()&&arr[qmax.peekLast()]<=arr[i]){
                qmax.pollLast();
            }
            qmax.addLast(i);
            if(qmax.peekFirst() == i-w){
                qmax.pollFirst();
            }
            if(i>=w-1){
                res[index++]=arr[qmax.peekFirst()];
            }

        }

        return res;
    }
}
