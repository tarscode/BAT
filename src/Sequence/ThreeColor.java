package Sequence;

/**
 * Created by liuyang on 16/6/7.
 * 三色排序
 */
public class ThreeColor{
    public int[] sortThreeColor(int[] A, int n) {
        for(int i=0;i<n;i++){
            if(A[i]!=0&&index(A,n,i,0)!=-1){
                A[index(A,n,i,0)]=A[i];
                A[i]=0;
            }
            else if(A[i]==2&&index(A,n,i,1)!=-1){
                A[index(A,n,i,1)]=2;
                A[i]=1;
            }
            else if(A[i]==2&&index(A,n,i,1)==-1){
                break;
            }
        }
        return A;
    }
    private int index(int[] A,int n,int i,int num){
        for(++i;i<n;i++){
            if(A[i]==num){
                return i;
            }
        }
        return -1;
    }
}
