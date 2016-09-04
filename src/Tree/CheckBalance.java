package Tree;

/**
 * Created by liuyang on 16/9/4.
 * 平衡二叉树判断
 */
public class CheckBalance {
    public boolean check(TreeNode root) {
        boolean[] res = new boolean[1];
        res[0] = true;
        getHeight(root,1,res);
        return res[0];
    }
    private int getHeight(TreeNode node,int level,boolean[] res){
        if(node == null){
            return level;
        }
        int lH = getHeight(node.left,level+1,res);
        if(!res[0]){
            return level;
        }
        int rH = getHeight(node.right,level+1,res);
        if(!res[0]){
            return level;
        }
        if(Math.abs(rH-lH)>1){
            res[0] = false;
        }
        return Math.max(rH,lH);
    }
}
