package DP;

/**
 * 工程: BAT 包名: DP 类名: MinCost
 * 作者: liuyang
 * 时间: 16/9/15 上午10:47
 * 题目: 最优编辑
 * 内容:
 * 版本:
 * 运行时间: 63 ms
 * 备注:
 */
public class MinCost {
    public int findMinCost(String A, int n, String B, int m, int c0, int c1, int c2) {
        char[] strA = A.toCharArray();
        char[] strB = B.toCharArray();
        int[][] dp = new int[n + 1][m + 1];
        //处理第一行
        for (int j = 0; j <= m; j++) {
            dp[0][j] = j * c0;
        }
        //处理第一列
        for (int i = 0; i <= n; i++) {
            dp[i][0] = i * c1;
        }
        //生成dp
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (strA[i - 1] == strB[j - 1]) {
                    dp[i][j] = dp[i - 1][j - 1];
                } else {
                    dp[i][j] = dp[i - 1][j - 1] + c2;
                }
                dp[i][j] = Math.min(dp[i][j], dp[i][j - 1] + c0);
                dp[i][j] = Math.min(dp[i][j], dp[i - 1][j] + c1);
            }
        }
        return dp[n][m];
    }

    public static void main(String[] args) {
        String A = "ABC";
        String B = "ADC";
        int n = 3, m = 3;
        int c0 = 5, c1 = 3, c2 = 100;
        MinCost t = new MinCost();
        System.out.println(t.findMinCost(A, n, B, m, c0, c1, c2));
    }
}