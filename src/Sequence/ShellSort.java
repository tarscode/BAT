package Sequence;

/**
 * Created by liuyang on 16/6/6.
 */
public class ShellSort {
    public int[] shellSort(int[] A, int n) {
        int h = 1;
        while(h<n)
            h = 3*h+1;
        while(h>=1) {
            for (int i = h; i < n; i++) {
                for (int j = i;j>=h&&A[j]<A[j-h];j-=h)
                    exch(A,j,j-h);
            }
            h = h/3;
        }
        return A;
    }

    private static void exch(int[] A,int i,int j){
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }
}
