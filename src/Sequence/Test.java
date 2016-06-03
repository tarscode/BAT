package Sequence;

import Util.Util;

/**
 * Created by Tars on 2016/4/10.
 */
public class Test {
    public static void main(String args[]){
        int[] A = {1,2,3,5,2,3};
        int[] B;
        int n = 6;
        HeapSort h = new HeapSort();
        B = h.heapSort(A,n);
        Util.printArray(B);
    }
}
