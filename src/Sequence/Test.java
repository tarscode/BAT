package Sequence;

import Util.Util;

/**
 * Created by Tars on 2016/4/10.
 */
public class Test {
    public static void main(String args[]){
        int[] A = {2,1,4,3,6,5,8,7,10,9};
        int n = 10;
        int k = 2;
        ScaleSort s = new ScaleSort();
        Util.printArray(s.sortElement(A,n,k));
    }
}
