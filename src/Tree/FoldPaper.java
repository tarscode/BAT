package Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * Created by liuyang on 16/9/5.
 * 折纸问题
 */
public class FoldPaper {
    public String[] foldPaper(int n) {
        if (n <= 0) {
            return new String[]{};
        }
        if (n == 1) {
            return new String[]{"down"};
        }
        int m = 1;
        LinkedList<TreeNode> quene = new LinkedList<>();
        TreeNode root = new TreeNode(1);
        quene.add(root);
        while (m < n) {
            int num = quene.size();
            for (int j = 0; j < num; j++) {
                TreeNode cur = quene.pollFirst();
                quene.add(cur.left=new TreeNode(1));
                quene.add(cur.right=new TreeNode(0));
            }
            m++;
        }
        List<Integer> list = mid(root);
        String[] arr = new String[list.size()];
        for(int i=0;i<list.size();i++){
            if(list.get(i)==0){
                arr[i]="up";
            }else{
                arr[i]="down";
            }
        }
        return arr;

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
class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;
    }
}
