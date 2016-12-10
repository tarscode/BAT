package Permutation;

/**
 * 【工程】: BAT 包名: Permutation 类名: StandInLine
 * 【作者】: liuyang
 * 【时间】: 16/12/10 下午9:16
 * 【题目】: 站队问题
 * 【内容】: n个人站队，他们的编号依次从1到n，要求编号为a的人必须在编号为b的人的左边，但不要求一定相邻，请问共有多少种排法？第二问如果要求a必须在b的左边，并且一定要相邻，请问一共有多少种排法？
 *          给定人数n及两个人的编号a和b，请返回一个两个元素的数组，其中两个元素依次为两个问题的答案。保证人数小于等于10。
 * 【版本】: V1.0
 * 【运行时间】:
 * 【时间复杂度】:
 * 【空间复杂度】:
 * 【备注】:
 * 【思路】:
 */
public class StandInLine {
    public int[] getWays(int n, int a, int b) {
        int[] res = new int[2];
        res[0] = factorial(n)/2;
        res[1] = factorial(n-1);
        return res;
    }
    //计算阶乘数，即n! = n * (n-1) * ... * 2 * 1
    private static int factorial(int n) {
        return (n > 1) ? n * factorial(n - 1) : 1;
    }
    public static void main(String[] args) {
        StandInLine t = new StandInLine();
        System.out.println();
    }
}