package Tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by liuyang on 16/9/4.
 * 非递归二叉树的序列打印
 */
public class TreeToSequence2 {
    public int[][] convert(TreeNode root) {
        List<Integer> preList = pre(root);
        List<Integer> midList = mid(root);
        List<Integer> afterList = after(root);
        int[] preArr = list2Array(preList);
        int[] midArr = list2Array(midList);
        int[] afterArr = list2Array(afterList);
        return new int[][]{preArr, midArr, afterArr};
    }

    private List<Integer> pre(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        List<Integer> list = new ArrayList<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode top = stack.pop();
            list.add(top.val);
            if (top.right != null) {
                stack.push(top.right);
            }
            if (top.left != null) {
                stack.push(top.left);
            }
        }
        return list;
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

    private List<Integer> after(TreeNode root) {
        Stack<TreeNode> stack1 = new Stack<>();
        Stack<TreeNode> stack2 = new Stack<>();
        List<Integer> list = new ArrayList<>();
        stack1.push(root);
        while (!stack1.isEmpty()) {
            TreeNode top = stack1.pop();
            stack2.push(top);
            if (top.left != null) {
                stack1.push(top.left);
            }
            if (top.right != null) {
                stack1.push(top.right);
            }
        }
        while (!stack2.isEmpty()) {
            list.add(stack2.pop().val);
        }
        return list;
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
