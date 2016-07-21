package Util;

/**
 * Created by liuyang on 16/6/2.
 */
public class Util {
    public static void printArray(int[] A){
        int n = A.length;
        System.out.print("数组输出:");
        for(int i=0;i<n;i++){
            System.out.print(A[i]);
            System.out.println(" ");
        }
        System.out.println("\n");
    }
    public static void printArray2(int[] A){
        int n = A.length;
        System.out.print("数组输出:");
        for(int i=1;i<n;i++){
            System.out.print(A[i]);
            System.out.print(" ");
        }
        System.out.println("\n");
    }
}
