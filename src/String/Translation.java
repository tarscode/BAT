package String;

/**
 * Created by liuyang on 16/6/14.
 * 字符串移位
 * 时间:31ms
 * 内存:709K
 */
public class Translation {
    public String stringTranslation(String A, int n, int len) {
        char[] B = A.toCharArray();
        char[] C = new char[n];
        for(int i=0;i<n-len;i++){
            C[i] = B[len+i];
        }
        for(int i=0;i<len;i++){
            C[i+n-len] = B[i];
        }
        A = String.valueOf(C);
        return A;
    }
}
