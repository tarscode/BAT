package String;

import java.util.List;

/**
 * Created by liuyang on 16/7/5.
 * 拓扑结构相同子树
 */
public class IdenticalTree {
    public boolean chkIdentical(TreeNode A, TreeNode B) {
        StringBuffer strA = posOrderRecur(A);
        StringBuffer strB = posOrderRecur(B);
        String stra = strA.toString();
        String strb = strB.toString();
        if (getIndexOf(stra,strb)==-1){
            return false;
        }
        else{
            return true;
        }
    }
    //#!和!定位,例如1!2#!#!3#!3#!和1!#!#!
    public StringBuffer posOrderRecur(TreeNode head){
        StringBuffer buffer = new StringBuffer("#!");
        if(head == null){
            return buffer;
        }
        StringBuffer buf = new StringBuffer(head.val+"!");
        buf = buf.append(posOrderRecur(head.left));
        buf = buf.append(posOrderRecur(head.right));
        return buf;
    }
    //KMP算法
    public int getIndexOf(String s, String m) {
        if (s == null || m == null || m.length() < 1 || s.length() < m.length()) {
            return -1;
        }
        char[] ss = s.toCharArray();
        char[] ms = m.toCharArray();
        int si = 0;
        int mi = 0;
        int[] next = getNextArray(ms);
        while (si < ss.length&&mi<ms.length) {
            if (ss[si] == ms[mi]) {
                si++;
                mi++;
            } else if (next[mi] == -1) {
                si++;
            } else {
                mi = next[mi];
            }
        }
        return mi == ms.length ? si - mi : -1;
    }

    private int[] getNextArray(char[] ms) {
        if (ms.length == 1) {
            return new int[]{-1};
        }
        int[] next = new int[ms.length];
        next[0] = -1;
        next[1] = 0;
        int pos = 2;
        int cn = 0;
        while (pos < next.length) {
            if (ms[pos - 1] == ms[cn]) {
                next[pos++] = ++cn;
            } else if (cn > 0) {
                cn = next[cn];
            } else {
                next[pos++] = 0;
            }
        }
        return next;
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

