package Sequence;

import Util.Util;

/**
 * Created by Tars on 2016/4/10.
 */
public class Test {
    public static void main(String args[]){
        int[] A = {1,2,6,9,5,8,9};
        int[] B;
        int n = 7;
        CountingSort c = new CountingSort();
        B = c.countingSort(A,n);
        Util.printArray(B);
    }
}
