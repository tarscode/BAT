package Sequence;

import Util.Util;

/**
 * Created by Tars on 2016/4/10.
 */
public class Test {
    public static void main(String args[]){
        int[] A = {0,1,1,0,2,2};
        int[] B;
        int n = 6;
        ThreeColor t = new ThreeColor();
        B = t.sortThreeColor(A,n);
        Util.printArray(B);
    }
}
