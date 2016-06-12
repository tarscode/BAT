package Sequence;

/**
 * Created by liuyang on 16/6/9.
 * 小范围排序
 */
public class ScaleSort {
    public int[] sortElement(int[] A, int n, int k) {
        int min = 0;
        for(int i=0;i<n;i++){
            if (i+k<n-1)
                min = min(A,i,i+k);
            else
                min = min(A,i,n-1);
            exch(A,i,min);
        }
        return A;
    }
    private int min(int[] A,int begin,int end){
        int min = A[begin];
        int index = begin;
        for(int i=begin;i<=end;i++)
            if(A[i]<min) {
                min = A[i];
                index = i;
            }
        return index;
    }
    private void exch(int[] A,int i,int j) {
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }
}
