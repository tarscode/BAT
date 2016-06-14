package String;
import Sequence.RadixSort;
import Util.Util;

/**
 * Created by Tars on 2016/4/10.
 */
public class Test {
    public static void main(String args[]){
        String A = "ABCDE";
        int n = 47;
        Translation t = new Translation();
        System.out.println(t.stringTranslation(A,5,3));
    }
}
