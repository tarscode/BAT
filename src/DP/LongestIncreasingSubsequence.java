package DP;

/**
 * 工程: BAT 包名: DP 类名: LongestIncreasingSubsequence
 * 作者: liuyang
 * 时间: 16/9/14 下午4:52
 * 题目: LIS(最长上升子序列)
 * 内容:
 * 版本: 1.0
 * 运行时间: 84 ms
 * 备注: 时间复杂度O(n2)
 */
public class LongestIncreasingSubsequence {
    public int getLIS(int[] A, int n) {
        int dp[] = new int[n];
        int len = 1;
        for (int i = 0; i < n; i++) {
            dp[i] = 1;
            for (int j = 0; j < i; j++) {
                if (A[i] > A[j]) {
                    dp[i] = Math.max(dp[i],dp[j]+1);
                }
            }
            len = dp[i]>len?dp[i]:len;
        }
        return len;
    }

    public static void main(String[] args) {
        int[] A = {1,4,2,5,3};
        int n = 5;
        LongestIncreasingSubsequence t = new LongestIncreasingSubsequence();
        System.out.println(t.getLIS(A,n));
    }
}