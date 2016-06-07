package Sequence;

import Util.Util;

/**
 * Created by Tars on 2016/4/10.
 */
public class Test {
    public static void main(String args[]){
        int[] A = {1,2,2,4,7,5,6};

        int[] B;
        int n = 7;
        BubbleSort b = new BubbleSort();
        Util.printArray(b.bubbleSort(A,n));
        Checker c = new Checker();
        System.out.println(c.checkDuplicate(A,n));
    }
}
