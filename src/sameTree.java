/**
 * Created by sw on 2018-05-30.
 */

public class sameTree {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    static public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null || q == null) {
            if (p == q) {
                return true;
            } else {
                return false;
            }
        }
        return (p.val == q.val) && (isSameTree(p.left, q.left)) && (isSameTree(p.right, q.right));
    }

    public static void main(String[] args) {
        TreeNode t1 = new TreeNode(1);
        t1.left = new TreeNode(2);
        t1.right = new TreeNode(1);
        TreeNode t2 = new TreeNode(1);
        t2.left = new TreeNode(2);
        t2.right = new TreeNode(1);

        System.out.println(isSameTree(t1, t2));
    }
}
