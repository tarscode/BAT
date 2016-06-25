package String;
import Sequence.RadixSort;
import Util.Util;

/**
 * Created by Tars on 2016/4/10.
 */
public class StringTest {
    public static void main(String args[]){
        String A = "()(()()";
        int n = 7;
        Parenthesis p = new Parenthesis();
        System.out.println(p.chkParenthesis(A,n));
    }
}
