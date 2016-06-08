package Sequence;

import Util.Util;

/**
 * Created by Tars on 2016/4/10.
 */
public class Test {
    public static void main(String args[]){
        int[][] A = {{281,394,667,785},{944,1019,1248,1366},{1459,1521,1746,1975}};
        int[] B;
        int n = 6;
        Finder f = new Finder();
        System.out.println(f.findX(A,3,4,394));
    }
}
