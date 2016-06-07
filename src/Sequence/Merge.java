package Sequence;

/**
 * Created by liuyang on 16/6/7.
 * 与牛客网结果运行不一致
 */
public class Merge {
    private static int[] aux;
    public int[] mergeAB(int[] A, int[] B, int n, int m) {
        aux = new int[A.length];
        int[] C = new int[A.length];
        for (int i = 0;i<A.length;i++){
            if(i<n)
                C[i]=A[i];
            else if (i>=n&&i<n+m)
                C[i]=B[i-n];
            else
                C[i]=0;
        }
        merge(C,0,n-1,n+m-1);
        return C;
    }
    public static void merge(int[] a, int begin, int mid, int end){
        int i = begin,j = mid+1;
        for(int k=begin;k<=end;k++){
            aux[k] = a[k];
        }
        for(int k=begin;k<=end;k++){
            if(i>mid){
                a[k]=aux[j++];
            }
            else if(j>end){
                a[k]=aux[i++];
            }
            else if(aux[j]<aux[i]){
                a[k]=aux[j++];
            }
            else
                a[k]=aux[i++];
        }
    }
}
