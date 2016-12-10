package Permutation;

/**
 * 【工程】: BAT 包名: Permutation 类名: Distribution
 * 【作者】: liuyang
 * 【时间】: 16/12/10 下午10:00
 * 【题目】: 分糖果
 * 【内容】: n颗相同的糖果，分给m个人，每人至少一颗，问有多少种分法。
 *          给定n和m，请返回方案数，保证n小于等于12，且m小于等于n。
 * 【版本】: V1.0
 * 【运行时间】:
 * 【时间复杂度】:
 * 【空间复杂度】:
 * 【备注】:
 * 【思路】:
 */
public class Distribution {
    public int getWays(int n, int m) {
        return factorial(n-1)/factorial(m-1)/factorial(n-m);
    }
    //计算阶乘数，即n! = n * (n-1) * ... * 2 * 1
    private static int factorial(int n) {
        return (n > 1) ? n * factorial(n - 1) : 1;
    }

    public static void main(String[] args) {
        Distribution t = new Distribution();
        System.out.println();
    }
}