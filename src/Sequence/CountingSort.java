package Sequence;

/**
 * Created by liuyang on 16/6/10.
 * 计数排序
 */
public class CountingSort {
    public int[] countingSort(int[] A, int n) {
        int[] B = new int[214748];
        int[] C = new int[214748];
        for (int i=0;i<n;i++) {
            B[A[i]]=A[i];
            C[A[i]]=C[A[i]]+1;
        }
        for (int i=0,j=0;i<B.length;i++){
            for(;C[i]>0;--C[i])
                A[j++]=B[i];
        }
        return A;
    }
}
