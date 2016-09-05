package Tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by liuyang on 16/9/5.
 * 寻找错误结点
 */
public class FindErrorNode {
    public int[] findError(TreeNode root) {
        int[] res = new int[]{-1,-1};
        List<Integer> arr = mid(root);
        for(int i=1;i<arr.size();i++){
            if(arr.get(i)<arr.get(i-1)){
                if(res[0]==-1){
                    res[0]=i-1;
                }else{
                    res[1]=i;
                }
            }
        }
        if(res[1]==-1){
            res[1]=Math.max(arr.get(res[0]),arr.get(res[0]+1));
            res[0]=Math.min(arr.get(res[0]),arr.get(res[0]+1));
        }else {
            int max = Math.max(arr.get(res[0]),arr.get(res[1]));
            int min = Math.min(arr.get(res[0]),arr.get(res[1]));
            res[0] = min;
            res[1] = max;
        }
        return res;
    }
    private List<Integer> mid(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        List<Integer> list = new ArrayList<>();
        TreeNode cur = root;
        while (!stack.isEmpty() || cur != null) {
            if (cur != null) {
                stack.push(cur);
                cur = cur.left;
            } else {
                TreeNode top = stack.pop();
                list.add(top.val);
                cur = top.right;
            }
        }
        return list;
    }
}
