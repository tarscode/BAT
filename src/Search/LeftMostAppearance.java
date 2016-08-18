package Search;

/**
 * Created by liuyang on 16/8/18.
 * 元素最左出现
 */
public class LeftMostAppearance {
    public int findPos(int[] arr, int n, int num) {
        int left = 0;
        int right = n - 1;
        int mid = 0;
        while (left < right) {
            mid = left + (right - left) / 2;
            if (arr[mid] >= num) {
                right = mid;
            } else {
                left = mid+1;
            }
        }
        return left;
    }
}
