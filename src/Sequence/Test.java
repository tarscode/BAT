package Sequence;

import Util.Util;

/**
 * Created by Tars on 2016/4/10.
 */
public class Test {
    public static void main(String args[]){
        int[] A = {5,7,8,9,10,0,0,0,0,0,0,0,0,0};
        int[] B = {1,3,4,11};
        int n = 5;
        Merge m = new Merge();
        int[] C ;
        C= m.mergeAB(A,B,5,4);
        Util.printArray(C);
    }
}
