package String;
import Sequence.RadixSort;
import Util.Util;

/**
 * Created by Tars on 2016/4/10.
 */
public class StringTest {
    public static void main(String args[]) {
        String A1 = "aabcb";
        int n1 = 5;//3
        String A2 = "rfrxkmdb";
        int n2 = 8;//7
        String A3 = "kojypxtmcheuvhpkqapldlkxkdbbouclkqwpnivxquwimbexyuqlipqpnlaklsqjnhcqspegqswpwinmvaokwbzylyrctfiscjuweakmmiaqsuanrfxhaffeuaauafqkeksjxgdpspkzzzsawuyvrdbgdqhrnkspldkkqfmlsofadojwfdikwpzsafacxoktpxkzmzzihljiqlsnbygkstydeflbgjrzrtxryfcntduaadqyzxmsrrxqbgldcvmtmqwyqgjtda";
        int n3=266;//13
        DistinctSubstring d = new DistinctSubstring();
        int num= d.longestSubstring(A3,n3);
        System.out.println(num);
    }
}
