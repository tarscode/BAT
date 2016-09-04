package Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by liuyang on 16/9/4.
 * 二叉树的打印练习
 */
public class TreePrinter {
    public int[][] printTree(TreeNode root) {
        LinkedList<TreeNode> quene= new LinkedList<>();
        List<Integer> arr = new ArrayList<>();
        List<List<Integer>> arrList = new ArrayList<>();
        quene.add(root);
        TreeNode last = root;
        TreeNode nlast = null;
        while (!quene.isEmpty()){
            TreeNode cur= quene.poll();
            if(cur.left!=null){
                quene.add(cur.left);
                nlast = cur.left;
            }
            if(cur.right!=null){
                quene.add(cur.right);
                nlast = cur.right;
            }
            arr.add(cur.val);
            if(cur.equals(last)){
                last = nlast;
                arrList.add(arr);
                arr = new ArrayList<>();
            }
        }
        int level = arrList.size();
        int[][] res = new int[level][];
        for(int i=0;i<level;i++){
            int nodes = arrList.get(i).size();
            res[i] = new int[nodes];//开数组
            for(int j=0;j<nodes;j++){
                res[i][j]=arrList.get(i).get(j);
            }
        }
        return res;
    }
}
