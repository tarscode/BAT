package Permutation;

/**
 * 【工程】: BAT 包名: Permutation 类名: Parenthesis
 * 【作者】: liuyang
 * 【时间】: 16/12/10 下午10:10
 * 【题目】: 括号序列
 * 【内容】: 假设有n对左右括号，请求出合法的排列有多少个？合法是指每一个括号都可以找到与之配对的括号，比如n=1时，()是合法的，但是)(为不合法。
 * 给定一个整数n，请返回所求的合法排列数。保证结果在int范围内。
 * 【版本】: V1.0
 * 【运行时间】:
 * 【时间复杂度】:
 * 【空间复杂度】:
 * 【备注】:
 * 【思路】:
 */
public class Parenthesis {

    public int countLegalWays(int n) {
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
        Parenthesis t = new Parenthesis();
        System.out.println(t.countLegalWays(2));
    }
}