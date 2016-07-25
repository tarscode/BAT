package Stack;

/**
 * Created by liuyang on 16/7/16.
 */
public class StackDemo {
    public static void main(String[] args){
       int[] A = {2,4,3,1,3};
        int n = 5;
        TwoStacks t =new TwoStacks();
        System.out.println(t.twoStacksSort(A));
    }
}
