package DP;

/**
 * 工程: BAT 包名: DP 类名: LCS
 * 作者: liuyang
 * 时间: 16/9/13 下午8:14
 * 题目: LCS(最长公共子序列）
 * 内容: 给定两个字符串A和B，返回两个字符串的最长公共子序列的长度。例如，A="1A2C3D4B56”，B="B1D23CA45B6A”，”123456"或者"12C4B6"都是最长公共子序列。
 * 给定两个字符串A和B，同时给定两个串的长度n和m，请返回最长公共子序列的长度。保证两串长度均小于等于300。
 * 测试样例：
 * "1A2C3D4B56",10,"B1D23CA45B6A",12
 * 返回：6
 * 版本: 1.0
 * 运行时间:
 * 备注:
 */
public class LCS {
    public int findLCS(String A, int n, String B, int m) {
        char[] arrA = A.toCharArray();
        char[] arrB = B.toCharArray();
        int[][] dp = new int[m][n];
        //处理第一个数
        dp[0][0] = arrA[0] == arrB[0] ? 1 : 0;
        //处理第一行
        for (int i = 1; i < n; i++) {
            dp[0][i] = Math.max(dp[0][i - 1], arrB[0] == arrA[i] ? 1 : 0);
        }
        //处理第一列
        for (int j = 1; j < m; j++) {
            dp[j][0] = Math.max(dp[j - 1][0], arrA[0] == arrB[j] ? 1 : 0);
        }
        //生成dp数组
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                if (arrA[j] == arrB[i]) {
                    dp[i][j] = Math.max(dp[i][j], dp[i - 1][j - 1] + 1);
                }
            }
        }
        return dp[m - 1][n - 1];
    }

    public static void main(String[] args) {
        LCS t = new LCS();
        String A = "1A2C3D4B56";
        String B = "B1D23CA45B6A";
        int n = 10;
        int m = 12;
        int lcs = t.findLCS(A, n, B, m);
        System.out.println(lcs);
    }
}