package Sequence;

/**
 * Created by Tars on 2016/4/10.
 */
public class Test {
    public static void main(String args[]){
        int[] A = {1,2,3,5,2,3};
        int[] B;
        int n = 6;
        /*归并排序测试
        MergeSort m = new MergeSort();
        B = m.mergeSort(A,n);
        for(int i = 0;i<6;i++){
            System.out.println(B[i]);
        }
        */
        /*快速排序测试
        QuickSort q = new QuickSort();
        B = q.quickSort(A,n);
        for(int i = 0;i<6;i++){
            System.out.println(B[i]);
        }
        */
        QuickSort q = new QuickSort();
        B = q.quickSort(A,n);
        for(int i = 0;i<6;i++){
            System.out.println(B[i]);
        }
    }
}
