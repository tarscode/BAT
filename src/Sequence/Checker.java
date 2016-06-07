package Sequence;

/**
 * Created by liuyang on 16/6/6.
 * 重复值判断
 */
public class Checker {
    public boolean checkDuplicate(int[] A, int n) {
        if(A == null || A.length<2){
            return false;
        }
        int tempA = 0;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if (A[j]>A[j+1]){
                    tempA = A[j];
                    A[j] = A[j+1];
                    A[j+1] = tempA;
                }
            }
            if(i>0&&A[n-i-1]==A[n-i]){
                return true;
            }
        }
        return false;
    }
}
