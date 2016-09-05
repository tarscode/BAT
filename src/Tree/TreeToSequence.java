package Tree;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by liuyang on 16/8/20.
 * 递归二叉树的序列打印
 */
public class TreeToSequence {
    private List<Integer> preList = new ArrayList<>();
    private List<Integer> midList = new ArrayList<>();
    private List<Integer> afterList = new ArrayList<>();

    public int[][] convert(TreeNode root) {
        pre(root);
        mid(root);
        after(root);
        int[] preArr = list2Array(preList);
        int[] midArr = list2Array(midList);
        int[] afterArr = list2Array(afterList);
        return new int[][]{preArr, midArr, afterArr};
    }

    public void pre(TreeNode node) {
        if (node == null) {
            return;
        }
        preList.add(node.val);
        pre(node.left);
        pre(node.right);
    }

    public void mid(TreeNode node) {
        if (node == null) {
            return;
        }
        mid(node.left);
        midList.add(node.val);
        mid(node.right);
    }

    public void after(TreeNode node) {
        if (node == null) {
            return;
        }
        after(node.left);
        after(node.right);
        afterList.add(node.val);
    }

    public int[] list2Array(List<Integer> list) {
        int len = list.size();
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = list.get(i);
        }
        return arr;
    }
}
/*
class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;
    }
}
*/