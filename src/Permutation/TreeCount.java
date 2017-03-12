package Permutation;

/**
 * 【工程】: BAT 包名: Permutation 类名: TreeCount
 * 【作者】: liuyang
 * 【时间】: 17/3/12 下午12:31
 * 【题目】: 二叉树统计
 * 【内容】: 求n个无差别的节点构成的二叉树有多少种不同的结构？给定一个整数n，请返回不同结构的二叉树的个数。保证结果在int范围内。
 * 【版本】: V1.0
 * 【运行时间】:
 * 【时间复杂度】:
 * 【空间复杂度】:
 * 【备注】:
 * 【思路】:
 */
public class TreeCount {

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
        TreeCount t = new TreeCount();
        System.out.println();
    }
}