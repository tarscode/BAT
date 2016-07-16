package String;

/**
 * Created by liuyang on 16/7/5.
 * 最长无重复字符子串
 */
public class DistinctSubstring {
    public int longestSubstring(String A, int n) {
        char[] arr = A.toCharArray();
        int len = 0;
        int length = 0;
        int begin = 0;
        for (int i = 0; i < n; i++) {
            int index = check(arr, begin, i);
            if (index != i) {
                length = len > length ? len : length;
                begin = index + 1;
                len = i - begin + 1;
            } else {
                len++;
                continue;
            }
        }
        return len > length ? len : length;
    }

    //判断是否有重复元素
    private static int check(char[] arr, int begin, int index) {
        if (begin == index) {
            return index;
        }
        for (int i = begin; i < index; i++) {
            if (arr[index] == arr[i]) {
                return i;
            } else {
                continue;
            }
        }
        return index;
    }
}
