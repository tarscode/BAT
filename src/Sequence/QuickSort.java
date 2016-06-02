package Sequence;
import Util.Util;
/**
 * Created by liuyang on 16/5/31.
 */
public class QuickSort {
    public int[] quickSort(int[] A, int n) {
        sort(A,0,n-1);
        return A;
    }
    private static int[] sort(int[] A,int lo,int hi){
        if (lo < hi) {
            //Util.printArray(A);
            int j = partition(A, lo, hi);
            sort(A, lo, j - 1);
            sort(A, j + 1, hi);
        }
        return A;
    }
    private static int partition(int[] A,int lo,int hi){
        int i = lo;
        int j = hi+1;
        int v = A[lo];
        while(i<hi&&j>lo){
            while(v>A[++i]){
                if (i==hi)
                    break;
            }
            while(v<A[--j]){
                if (j==lo)
                    break;
            }
            if (i>j)
                break;
            exch(A,i,j);
        }
        exch(A,lo,j);
        return j;
    }
    private static void exch(int[] A,int i,int j){
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }
}
