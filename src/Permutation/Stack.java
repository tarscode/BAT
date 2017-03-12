package Permutation;

/**
 * 【工程】: BAT 包名: Permutation 类名: Stack
 * 【作者】: liuyang
 * 【时间】: 16/12/10 下午11:23
 * 【题目】: 进栈出栈练习
 * 【内容】: n个数进出栈的顺序有多少种？假设栈的容量无限大。给定一个整数n，请返回所求的进出栈顺序个数。保证结果在int范围内。
 * 【版本】: V1.0
 * 【运行时间】:
 * 【时间复杂度】:
 * 【空间复杂度】:
 * 【备注】: 注意整数溢出问题
 * 【思路】:
 */
public class Stack {
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
        Stack t = new Stack();
        System.out.println(t.countWays(7));
    }
}