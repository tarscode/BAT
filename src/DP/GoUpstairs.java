package DP;

/**
 * Created by liuyang on 16/9/13.
 * 台阶问题
 */
public class GoUpstairs {
    public int countWays(int n) {
        int arr[] = new int[100000];
        arr[0] = 1;
        int mod = 1000000007;
        for (int i = 1; i <= n; i++) {
            arr[i] = ((i >= 1 ? arr[i - 1] : 0) + (i >= 2 ? arr[i - 2] : 0)) % mod;
        }
        return arr[n];
    }

    public static void main(String[] args) {
        GoUpstairs g = new GoUpstairs();
        System.out.println(g.countWays(36196));
    }
}
