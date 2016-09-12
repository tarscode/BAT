package Bit;

/**
 * Created by liuyang on 16/9/12.
 * 不用判断进行比较
 */
public class Compare {
    public int getMax(int a, int b) {
        int c = a - b;
        int as = sign(a);
        int bs = sign(b);
        int cs = sign(c);
        int difab = as ^ bs;
        int sameab = flip(difab);
        int returnA = difab * as + sameab * cs;
        int returnB = flip(returnA);
        return a * returnA + b * returnB;
    }

    public static int flip(int n) {
        return n ^ 1;
    }

    public static int sign(int n) {
        return flip((n >> 31) & 1);
    }
}
