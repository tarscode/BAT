package Sequence;

/**
 * Created by Tars on 2016/4/8.
 */
public class MergeSort {
    private static int[] aux;
    public int[] mergeSort(int[] A, int n) {
        aux = new int[n];
        for(int sz=1;sz<n;sz = sz+sz){
            for (int begin = 0;begin<n-sz;begin=begin+sz+sz){
                merge(A,begin,begin+sz-1,Math.min(begin+sz+sz-1,n-1));
            }
        }
        return A;
    }

    public static void merge(int[] a, int begin, int mid, int end){
        int i = begin,j = mid+1;
        for(int k=begin;k<=end;k++){
            aux[k] = a[k];
        }
        for(int k=begin;k<=end;k++){
            if(i>mid){
                a[k]=aux[j++];//先获取j的值再执行j+1
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