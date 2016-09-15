package DP;

/**
 * 工程: BAT 包名: DP 类名: Exchange
 * 作者: liuyang
 * 时间: 16/9/15 下午1:37
 * 题目: 找零钱
 * 内容:
 * 版本:
 * 运行时间:
 * 备注:
 */
public class Exchange {
    public int countWays(int[] penny, int n, int aim) {
        if (penny == null || n < 0 || aim < 0) {
            return 0;
        }
        int[][] dp = new int[n][aim + 1];
        for (int i = 0; i < n; i++) {
            dp[i][0] = 1;
        }
        for (int j = 1; penny[0] * j <= aim; j++) {
            dp[0][penny[0] * j] = 1;
        }
        int num = 0;
        for (int i = 1; i < n; i++) {
            for (int j = 1; j <= aim; j++) {
                num = 0;
                for (int k = 0; j - penny[i] * k >= 0; k++) {
                    num += dp[i - 1][j - penny[i] * k];
                }
                dp[i][j] = num;
            }
        }
        return dp[n - 1][aim];
    }

    public static void main(String[] args) {
        int[] penny = {1, 2, 4};
        int n = 3, aim = 3;
        Exchange t = new Exchange();
        System.out.println(t.countWays(penny, n, aim));
    }
}