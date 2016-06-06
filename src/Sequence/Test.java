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
        ShellSort s = new ShellSort();
        B = s.shellSort(A,n);
        Util.printArray(B);
    }
}
