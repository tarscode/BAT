package Tree;

/**
 * Created by liuyang on 16/9/4.
 * 二叉树的序列化
 */
public class TreeToString {
    public String toString(TreeNode root) {
        if(root==null){
            return "#!";
        }
        String res = root.val+"!";
        res += toString(root.left);
        res += toString(root.right);
        return res;
    }

}
