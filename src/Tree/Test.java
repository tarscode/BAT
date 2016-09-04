package Tree;


/**
 * Created by liuyang on 16/9/1.
 */
public class Test {
    public static void main(String[] args){
        TreeNode t1 = new TreeNode(1);
        TreeNode t2 = new TreeNode(2);
        TreeNode t3 = new TreeNode(3);
        TreeNode t4 = new TreeNode(4);
        t1.left = t2;
        t1.right = t3;
        t2.left = t4;
        CheckCompletion tt = new CheckCompletion();
        System.out.println(tt.chk(t1));
    }
}
