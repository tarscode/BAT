package Sequence;

/**
 * Created by liuyang on 16/6/8.
 * 有序矩阵查找
 */
public class Finder {
    public boolean findX(int[][] mat, int n, int m, int x) {
        for(int i=0;i<n;i++){
            if(mat[i][m-1]>=x){
                for (int j=0;j<m;j++){
                    if (mat[i][j]==x)
                        return true;
                }
                return false;
            }
        }
        return false;
    }
}
