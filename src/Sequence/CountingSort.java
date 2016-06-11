package Sequence;

/**
 * Created by liuyang on 16/6/10.
 * 计数排序
 */
public class CountingSort {
    public int[] countingSort(int[] A, int n) {
        int min = min(A,0,n-1);
        int max = max(A,0,n-1);
        int length = max-min+1;
        int[] B = new int[length];
        int[] C = new int[length];
        for (int i=0;i<n;i++) {
            B[A[i]-min]=A[i];
            C[A[i]-min]=C[A[i]-min]+1;
        }
        for (int i=0,j=0;i<length;i++){
            for(;C[i]>0;--C[i])
                A[j++]=B[i];
        }
        return A;
    }
    private int max(int[] A,int begin,int end){
        int max = A[begin];
        for(int i=begin;i<=end;i++){
            if(A[i]>max)
                max=A[i];
        }
        return max;
    }
    private int min(int[] A,int begin,int end){
        int min = A[begin];
        for(int i=begin;i<=end;i++)
            if(A[i]<min)
                min = A[i];
        return min;
    }
}
