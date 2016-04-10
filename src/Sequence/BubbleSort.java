package Sequence;

/**
 * Created by liuyang on 16/4/10.
 */
//冒泡排序
public class BubbleSort {
    public int[] bubbleSort(int[] A, int n) {
        if(A == null || A.length<2){
            return A;
        }
        int tempA = 0;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if (A[j]>A[j+1]){
                    tempA = A[j];
                    A[j] = A[j+1];
                    A[j+1] = tempA;
                }
            }
        }
        return A;
    }
}

