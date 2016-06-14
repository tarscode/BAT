package String;

/**
 * Created by liuyang on 16/6/14.
 * 句子的逆序
 */
public class Reverse {
    public String reverseSentence(String A, int n) {
        char[] B = A.toCharArray();
        char[] C = new char[n];
        for (int i = 0, j = 0; i < n; i++) {
            if(B[i]==' '&&j==0){
                for (int k = j, l = 0; k < i; k++) {
                    C[n - i + l++] = B[k];
                }
                j = i;
                C[n-i-1]=' ';
            }
            if (B[i] == ' '&&j!=0) {
                for (int k = j, l = 0; k < i; k++) {
                    C[n - i + l++-1] = B[k];
                }
                j = i;
            }
            if (i == n - 1) {
                for (int k = ++j, l = 0; k <= i; k++) {
                    C[n - i - 1 + l++] = B[k];
                }
            }
        }
        A = String.valueOf(C);
        return A;
    }
}


