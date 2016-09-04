package Tree;


/**
 * Created by liuyang on 16/9/1.
 */
public class Test {
    public static void main(String[] args){
        TreeNode t1 = new TreeNode(1);
        TreeNode t2 = new TreeNode(2);
        TreeNode t3 = new TreeNode(3);
        t1.left = t2;
        t1.right = t3;
        TreePrinter tt = new TreePrinter();
        System.out.println(tt.printTree(t1));
    }
}
