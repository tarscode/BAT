package Sequence;

/**
 * Created by liuyang on 16/4/10.
 */
//选择排序
public class SelectionSort {
    public int[] selectionSort(int[] A, int n) {
        if(A == null||A.length<2){
            return A;
        }
        for(int i=0;i<n;i++){
            int min = i;
            for(int j=i+1;j<n;j++){
                min = A[j]<A[min]?j:min;
            }
            int tempA = 0;
            if(min!=i){
                tempA = A[i];
                A[i] = A[min];
                A[min] = tempA;
            }
        }
        return A;
    }
}
/*
public class SelectionSort {
    public int[] selectionSort(int[] A, int n) {
    	if(A == null||A.length<2){
    		return A;
    	}
        int tempA = 0;
        for(int i=0;i<n;i++){
        	for(int j=i+1;j<n;j++){
        		if(A[i] > A[j]){
        			tempA = A[i];
        			A[i] = A[j];
        			A[j] = tempA;
        		}
        	}
        }
        return A;
    }
}
*/

