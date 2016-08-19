package Search;

/**
 * Created by liuyang on 16/8/19.
 * 最左原位
 */
public class Find {
    public int findPos(int[] arr, int n) {
        int left = 0;
        int right = n - 1;
        int mid = 0;
        while (left < right) {
            mid = left + (right - left) / 2;
            if (mid > arr[mid]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        if (left == arr[left]) {
            return left;
        } else {
            return -1;
        }
    }
}
