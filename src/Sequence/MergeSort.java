package Sequence;

/**
 * Created by Tars on 2016/4/8.
 */
public class MergeSort {
    private int[] B;
    public int[] mergeSort(int[] A, int n) {
        for(int i=0;i<n;i++){
            B[i]=A[i];
        }
        for(int sz=1;sz<n;sz = sz+sz){
            for (int begin = 0;begin<n-sz;begin=begin+sz+sz){
                merge(B,begin,begin+sz-1,Math.min(begin+sz+sz-1,n-1));
            }
        }
        return B;
    }

    public static int[] merge(int[] a, int begin, int mid, int end){
        int i = begin,j = mid+1;
        int[] aux = new int[a.length];
        for(int k=begin;k<=end;i++){
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
        return a;
    }
}