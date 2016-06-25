package String;

/**
 * Created by liuyang on 16/6/25.
 * 合法括号序列判断
 */
public class Parenthesis {
    public boolean chkParenthesis(String A, int n) {
        char[] arr = A.toCharArray();
        int numLeft = 0;
        int numRight = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == '(') {
                numLeft++;
            } else if (arr[i] == ')') {
                numRight++;
            } else {
                return false;
            }
        }
        if (numLeft == numRight) {
            return true;
        } else {
            return false;
        }
    }
}
