package String;
import Sequence.RadixSort;
import Util.Util;

/**
 * Created by Tars on 2016/4/10.
 */
public class Test {
    public static void main(String args[]){
        String A = "TUM MKIALI KVJUBEN VBSEWFT JAD AIZWEL CP LG PTB";
        int n = 47;
        Reverse r = new Reverse();
        System.out.print(r.reverseSentence(A,n));
    }
}
