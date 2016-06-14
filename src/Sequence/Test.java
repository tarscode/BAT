package Sequence;

import Util.Util;

/**
 * Created by Tars on 2016/4/10.
 */
public class Test {
    public static void main(String args[]){
        int[] A = {1,2,3,5,2,3};
        int[] B = {1,3,4,11};
        int n = 6;
        RadixSort r = new RadixSort();
        B = r.radixSort(A,n);
        Util.printArray(B);
    }
}
