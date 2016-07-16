package Stack;

/**
 * Created by liuyang on 16/7/16.
 */
public class StackDemo {
    public static void main(String[] args){
        TwoStacks t = new TwoStacks();
        int[] arr = {1,2,3,4,5};
        t.twoStacksSort(arr);
        System.out.println(t.twoStacksSort(arr).toString());
    }
}
