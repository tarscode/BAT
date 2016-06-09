package Sequence;

import Util.Util;

/**
 * Created by Tars on 2016/4/10.
 */
public class Test {
    public static void main(String args[]){
        int[] A = {1,2,6,5,8,9};
        int[] B;
        int n = 6;
        Subsequence s = new Subsequence();
        System.out.println(s.shortestSubsequence(A,n));
    }
}
