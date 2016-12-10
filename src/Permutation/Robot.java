package Permutation;

/**
 * 【工程】: BAT 包名: Permutation 类名: Robot
 * 【作者】: liuyang
 * 【时间】: 16/12/10 下午9:11
 * 【题目】: 方格移动
 * 【内容】: 在XxY的方格中，以左上角格子为起点，右下角格子为终点，每次只能向下走或者向右走，请问一共有多少种不同的走法
 *          给定两个正整数int x,int y，请返回走法数目。保证x＋y小于等于12。
 * 【版本】: V1.0
 * 【运行时间】:
 * 【时间复杂度】:
 * 【空间复杂度】:
 * 【备注】:
 * 【思路】:
 */
public class Robot {
    //计算组合数，即C(n, m) = n!/((n-m)! * m!)
    public int countWays(int x, int y) {
        return factorial(x-1 + y-1) / factorial(x-1) / factorial(y-1);
    }
    //计算阶乘数，即n! = n * (n-1) * ... * 2 * 1
    private static int factorial(int n) {
        return (n > 1) ? n * factorial(n - 1) : 1;
    }

    public static void main(String[] args) {
        Robot t = new Robot();
        System.out.println();
    }
}