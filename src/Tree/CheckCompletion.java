package Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by liuyang on 16/9/4.
 * 完全二叉树判断
 */
public class CheckCompletion {
    public boolean chk(TreeNode root) {
        LinkedList<TreeNode> quene = new LinkedList<>();
        quene.add(root);
        boolean flag = false;
        while (!quene.isEmpty()) {
            TreeNode cur = quene.poll();

            if (cur.right != null && cur.left == null) {
                return false;
            }
            if (flag == true && (cur.left != null || cur.right != null)) {
                return false;
            }
            if (cur.left != null) {
                quene.add(cur.left);
            }
            if (cur.right != null) {
                quene.add(cur.right);
            }else{
                flag = true;
            }
        }
        return true;
    }
}
