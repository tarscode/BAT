package Permutation;

/**
 * 【工程】: BAT 包名: Permutation 类名: HighAndShort
 * 【作者】: liuyang
 * 【时间】: 17/3/12 下午12:34
 * 【题目】: 高矮排列问题
 * 【内容】: 12个高矮不同的人，排成两排，每排必须是从矮到高排列，而且第二排比对应的第一排的人高，问排列方式有多少种？给定一个偶数n，请返回所求的排列方式个数。保证结果在int范围内。
 * 【版本】: V1.0
 * 【运行时间】:
 * 【时间复杂度】:
 * 【空间复杂度】:
 * 【备注】:
 * 【思路】:
 */
public class HighAndShort {
    public int countWays(int n) {
        n = n/2;
        return factorial(2 * n, n+1) / (factorial(  n,  1)*(n + 1));
    }

    private static int factorial(int m, int n) {
        int res = 1;
        for (int i = n; i <= m; i++) {
            res *= i;
        }
        return res;
    }

    public static void main(String[] args) {
        HighAndShort t = new HighAndShort();
        System.out.println();
    }
}