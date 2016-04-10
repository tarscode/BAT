package Sequence;

/**
 * Created by Tars on 2016/4/8.
 */

public class InsertionSort {
    public int[] insertionSort(int[] A, int n) {
        if(A == null||A.length<2){
            return A;
        }
        int tempA = 0;
        for(int i = 1;i < n;i++){
            int insert = i;
            for(int j = i-1;j >= 0;j--){
                if(A[insert]<A[j]){
                    tempA = A[insert];
                    A[insert] = A[j];
                    A[j] = tempA;
                    insert = j;
                }
                else{
                    break;
                }
            }
        }
        return A;
    }
}

