package String;

/**
 * Created by liuyang on 16/6/14.
 * 句子的逆序
 * 版本:2.0
 * 时间:44ms
 * 内存:914K
 * 备注:逻辑更为清晰
 */
public class Reverse {
    public String reverseSentence(String A, int n) {
        char[] arr = A.toCharArray();
        arr = reverse(arr, 0,n-1);
        for (int i = 0, j = 0; i < n; i++) {
            if (arr[i] == ' ') {
                reverse(arr,j,i-1);
                j=i+1;
            }
            if(i == n-1){
                reverse(arr,j,i);
            }

        }
        A = String.valueOf(arr);
        return A;
    }

    //逆序字符串
    private char[] reverse(char[] arr, int begin, int end) {
        char temp = ' ';
        for (int i = begin; i < (end + begin) / 2+1; i++) {
            temp = arr[i];
            arr[i] = arr[begin + end - i];
            arr[begin + end - i] = temp;
        }
        return arr;
    }
}
/*
public class Reverse {
    public String reverseSentence(String A, int n) {
        char[] B = A.toCharArray();
        char[] C = new char[n];
        for (int i = 0, j = 0; i < n; i++) {
            //处理第一个单词
            if(B[i]==' '&&j==0){
                for (int k = j, l = 0; k < i; k++) {
                    C[n - i + l++] = B[k];
                }
                j = i;
                C[n-i-1]=' ';
            }
            //处理中间部分单词
            if (B[i] == ' '&&j!=0) {
                for (int k = j, l = 0; k < i; k++) {
                    C[n - i + l++-1] = B[k];
                }
                j = i;
            }
            //处理最后一个单词
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
*/

