package Bit;

/**
 * Created by liuyang on 16/9/12.
 * 不用任何额外变量交换两个整数的值
 */
public class Swap {
    public int[] getSwap(int[] num) {
        num[0] = num[0]^num[1];
        num[1] = num[0]^num[1];
        num[0] = num[0]^num[1];
        return num;
    }
}

