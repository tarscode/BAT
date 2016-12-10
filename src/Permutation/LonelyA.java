package Permutation;

/**
 * 【工程】: BAT 包名: Permutation 类名: LonelyA
 * 【作者】: liuyang
 * 【时间】: 16/12/10 下午9:22
 * 【题目】: 孤傲的A
 * 【内容】: A(A也是他的编号)是一个孤傲的人，在一个n个人(其中编号依次为1到n)的队列中，他于其中的标号为b和标号c的人都有矛盾，所以他不会和他们站在相邻的位置。现在问你满足A的要求的对列有多少种？
 * 给定人数n和三个人的标号A,b和c，请返回所求答案，保证人数小于等于11且大于等于3。
 * 【版本】: V1.0
 * 【运行时间】:
 * 【时间复杂度】:
 * 【空间复杂度】:
 * 【备注】:
 * 【思路】:
 */
public class LonelyA {
    public int getWays(int n, int A, int b, int c) {
        int res = factorial(n) - 4 * factorial(n - 1) + 2*factorial(n - 2);
        return res >= 0 ? res : 0;
    }

    //计算阶乘数，即n! = n * (n-1) * ... * 2 * 1
    private static int factorial(int n) {
        return (n > 1) ? n * factorial(n - 1) : 1;
    }

    public static void main(String[] args) {
        LonelyA t = new LonelyA();
        System.out.println();
    }
}