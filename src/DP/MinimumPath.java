package DP;

/**
 * 工程: BAT 包名: DP 类名: MinimumPath
 * 作者: liuyang
 * 时间: 16/9/13 下午4:17
 * 题目: 矩阵最小路径和
 * 内容:
 * 版本: 1.0
 * 运行时间: 91 ms
 * 备注:
 */
public class MinimumPath {
    public int getMin(int[][] map, int n, int m) {
        //处理第一行
        for (int j = 1; j < m; j++) {
            map[0][j] = map[0][j - 1] + map[0][j];
        }
        //处理第一列
        for (int i = 1; i < n; i++) {
            map[i][0] = map[i - 1][0] + map[i][0];
        }
        //处理其他
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                map[i][j]=map[i][j]+Math.min(map[i-1][j],map[i][j-1]);
            }
        }
        return map[n-1][m-1];
    }
    public static void main(String[] args){
        int[][] map ={{613,0,93,463},{101,369,112,255},{42,67,86,543},{485,452,393,461},{485,452,393,461}};
        int m=5,n=4;
        MinimumPath min = new MinimumPath();
        System.out.println(min.getMin(map,m,n));
    }
}