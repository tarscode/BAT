package Permutation;

/**
 * 【工程】: BAT 包名: Permutation 类名: BuyTickets
 * 【作者】: liuyang
 * 【时间】: 17/3/12 上午11:40
 * 【题目】: 排队买票问题
 * 【内容】: 2n个人排队买票，n个人拿5块钱，n个人拿10块钱，票价是5块钱1张，每个人买一张票，售票员手里没有零钱，问有多少种排队方法
 *          让售票员可以顺利卖票。给定一个整数n，请返回所求的排队方案个数。保证结果在int范围内。
 * 【版本】: V1.0
 * 【运行时间】:
 * 【时间复杂度】:
 * 【空间复杂度】:
 * 【备注】:
 * 【思路】:
 */
public class BuyTickets {

    public int countWays(int n) {
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
        BuyTickets t = new BuyTickets();
        System.out.println();
    }
}