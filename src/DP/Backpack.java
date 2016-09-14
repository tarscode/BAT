package DP;

/**
 * 工程: BAT 包名: DP 类名: Backpack
 * 作者: liuyang
 * 时间: 16/9/13 下午11:03
 * 题目: 01背包
 * 内容:
 * 版本:
 * 运行时间:
 * 备注:
 */
public class Backpack {
    public int maxValue(int[] w, int[] v, int n, int cap) {
        int dp[][] = new int[n+1][cap+1];
        //初始化背包为0
        for (int i = 0; i <= n; i++) {
            dp[i][0] = 0;
        }
        //初始化物品为0
        for (int j = 0; j <= cap; j++) {
            dp[0][j] = 0;
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= cap; j++) {
                if (w[i-1] > j) {
                    dp[i][j] = dp[i - 1][j];
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - w[i-1]] + v[i-1]);
                }
            }
        }
        return dp[n][cap];
    }

    public static void main(String[] args) {
        int[] w = {1, 2, 3};
        int[] v = {1, 2, 3};
        int n = 3, cap = 6;
        Backpack t = new Backpack();
        int maxValue = t.maxValue(w, v, n, cap);
        System.out.println(maxValue);
    }
}