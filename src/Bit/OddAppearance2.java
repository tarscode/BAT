package Bit;

/**
 * Created by liuyang on 16/9/12.
 * 寻找奇数出现II
 */
public class OddAppearance2 {
    public int[] findOdds(int[] arr, int n) {
        int eO = 0, eOhasOne = 0;
        for (int curNum : arr) {
            eO ^= curNum;
        }
        int rightOne = eO & (~eO + 1);
        for (int cur : arr) {
            if ((cur & rightOne) != 0) {
                eOhasOne ^= cur;
            }
        }
        int small = Math.min(eOhasOne, (eO ^ eOhasOne));
        int big = Math.max(eOhasOne, (eO ^ eOhasOne));
        return new int[] { small, big };
    }
}
