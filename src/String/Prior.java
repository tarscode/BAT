package String;

import com.sun.java.swing.action.NextAction;

/**
 * Created by liuyang on 16/6/14.
 * 拼接最小字典序
 */
public class Prior {
    public String findSmallest(String[] strs, int n) {
        String str ="";
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                String str1;
                String str2;
                str1=strs[i]+strs[j];
                str2=strs[j]+strs[i];
                if (str1.compareTo(str2) > 0)
                    exch(strs, i, j);
                else
                    continue;

            }
        }
        for (int i=0;i<n;i++){
           str=str+strs[i];
        }
        return str;
    }

    private static void exch(String[] strs, int i, int j) {
        String str;
        str = strs[i];
        strs[i] = strs[j];
        strs[j] = str;
    }
}
