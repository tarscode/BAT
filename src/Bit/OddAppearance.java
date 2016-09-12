package Bit;

/**
 * Created by liuyang on 16/9/12.
 * 寻找奇数出现
 */
public class OddAppearance {
    public int findOdd(int[] A, int n) {
        int cur = 0;
        for (int a : A) {
            cur = cur ^ a;
        }
        return cur;
    }
}
