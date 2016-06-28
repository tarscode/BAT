package String;
import Sequence.RadixSort;
import Util.Util;

/**
 * Created by Tars on 2016/4/10.
 */
public class StringTest {
    public static void main(String args[]){
        String[] A = {"ab","be"};
        int n = 2;
        Prior p = new Prior();
        System.out.println(p.findSmallest(A,n));
    }
}
