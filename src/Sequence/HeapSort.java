package Sequence;

/**
 * Created by liuyang on 16/6/3.
 */
public class HeapSort {
    public int[] heapSort(int[] A, int n) {
        int[] B = new int[n+1];
        for(int p=0;p<A.length;p++){
            B[p+1]=A[p];
        }
        for(int k=n/2;k>=1;k--){
            sink(B,k,n);
        }
        while(n>1){
            exch(B,1,n--);
            sink(B,1,n);
        }
        for(int q=0;q<A.length;q++){
            A[q]=B[q+1];
        }
        return A;
    }
    private void sink(int[] A,int k,int N){
        while(2*k<=N) {
           int j = 2*k;
           if(j<N&&A[j]<A[j+1])
               j++;
           if(A[k]>A[j])
               break;
            exch(A, k, j);
            k=j;
        }
    }
    private void exch(int[] A,int i,int j){
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }
}
