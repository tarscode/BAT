package Sequence;

import Util.Util;

/**
 * Created by liuyang on 16/6/9.
 * 小范围排序
 * 采用堆排序的方法
 * 版本2.0
 */
public class ScaleSort {
    public int[] sortElement(int[] A, int n, int k) {
        int[] B = new int[n + 1];
        for (int p = 0; p < A.length; p++) {
            B[p + 1] = A[p];
        }
        for (int i=n;i>=n-k;i--) {
            int m=k;
            while(m>1){
                exch(B,i,i+m--);
                sink2(B,i,i+m);
                System.out.println("i:"+i+" "+"i+k:"+(i+k));
                Util.printArray2(B);
            }
        }
        for (int q = 0; q < A.length; q++) {
            A[q] = B[q + 1];
        }
        return A;
    }

    private void sink(int[] A, int k, int N) {
        while (2 * k <= N) {
            System.out.println("test");
            int j = 2 * k;
            if (j < N && A[j] < A[j + 1])
                j++;
            if (A[k] > A[j])
                break;
            exch(A, k, j);
            k = j;
        }
    }
    private void sink2(int[] A, int i, int N) {
        while (2 * i <= N) {
            System.out.println("test");
            int j = 2 * i;
            if (j < N && A[j] > A[j + 1])
                j++;
            if (A[i] < A[j])
                break;
            exch(A, i, j);
            i = j;
        }
    }

    private void exch(int[] A, int i, int j) {
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }
}
/*
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
*/
