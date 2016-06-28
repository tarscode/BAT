package String;

/**
 * Created by liuyang on 16/6/27.
 * 词语变形
 */

public class Transform {
    public boolean chkTransform(String A, int lena, String B, int lenb) {
        if(A.length()==0||B.length()==0||lena!=lenb){
            return false;
        }
        char[] charA = A.toCharArray();
        char[] charB = B.toCharArray();
        int[] map = new int[256];
        for(int i=0;i<lena;i++){
            map[charA[i]]++;
        }
        for(int i=0;i<lenb;i++){
            if(map[charB[i]]--==0)
                return false;
        }
        return true;
    }
}
