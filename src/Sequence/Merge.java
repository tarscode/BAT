package Sequence;

/**
 * Created by liuyang on 16/6/7.
 * 有序数组合并
 * 与牛客网结果运行不一致,返回数组为A
 */
public class Merge {
    public int[] mergeAB(int[] A, int[] B, int n, int m) {
        int[] aux = new int[A.length];
        for (int i = 0;i<m;i++){
            A[i+n] = B[i];
        }
        merge(A,aux,0,n-1,n+m-1);
        return A;
    }
    public static void merge(int[] a,int[] aux, int begin, int mid, int end){
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
