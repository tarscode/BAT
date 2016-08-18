package Search;

/**
 * Created by liuyang on 16/8/18.
 * 循环有序数组最小值
 */
public class MinValue {
    public int getMin(int[] arr, int n) {
        int left = 0;
        int right = n - 1;
        int mid = 0;
        while (left < right) {
            mid = left+(right-left)/2;
            if(arr[mid]>arr[right]){
                left=mid+1;
            }else{
                right=mid;
            }
        }
        return arr[left];
    }
}
