package DP;

/**
 * Created by liuyang on 16/9/13.
 * 台阶问题
 */
public class GoUpstairs {
    public int countWays(int n) {
        Long arr[] = new Long[100000];
        arr[1] = 1L;
        arr[2] = 2L;
        for (int i = 3; i <= n; i++) {
            arr[i] = arr[i - 1]%1000000007 + arr[i - 2]%1000000007;
        }
        return n == 1 ? 1 : n == 2 ? 2 : arr[n].intValue()%1000000007;
    }
    public static void main(String[] args) {
        GoUpstairs g = new GoUpstairs();
        System.out.println(g.countWays(36196));
    }
}
