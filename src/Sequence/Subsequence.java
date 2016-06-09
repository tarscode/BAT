package Sequence;

/**
 * Created by liuyang on 16/6/8.
 * 最短子数组
 */
public class Subsequence {
    public int shortestSubsequence(int[] A, int n) {
        int l = beginChangeIndex(A,n);
        int r = endChangeIndex(A,n);
        if(l== 0)
            return 0;
        int max = max(A,l,r);
        int min = min(A,l,r);
        int beginIndex = index0(A,0,l,min);
        int endIndex = index1(A,r,n-1,max);
        return endIndex-beginIndex+1;
    }
    //左边升序
    private int beginChangeIndex(int[] A,int n){
        for(int i=0;i<n-1;i++)
            if(A[i]>A[i+1])
                return i;
        return 0;
    }
    //右边升序
    private int endChangeIndex(int[] A,int n){
        for(int i=n-1;i>0;i--)
            if(A[i]<A[i-1])
                return i;
        return 0;
    }
    private int max(int[] A,int begin,int end){
        int max = A[begin];
        for(int i=begin;i<=end;i++){
            if(A[i]>max)
                max=A[i];
        }
        return max;
    }
    private int min(int[] A,int begin,int end){
        int min = A[begin];
        for(int i=begin;i<=end;i++)
            if(A[i]<min)
                min = A[i];
        return min;
    }
    private int index0(int[] A,int begin,int end,int n){
        for (int i=begin;i<=end;i++){
            if(n<A[i])
                return i;
        }
        return begin;
    }
    private int index1(int[] A,int begin,int end,int n){
        for (int i=begin;i<=end;i++){
            if(n<=A[i])
                return i-1;
        }
        return end;
    }
}
