/**
 * Created by sw on 2018-05-30.
 */
//判断两棵树是否对称，本质上就是判断两棵树是否镜像。
public class symmerticTree {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    static public boolean compRoot(TreeNode lRoot, TreeNode rRoot) {
        if (lRoot == null || rRoot == null) {
            if (lRoot == rRoot) {
                return true;
            } else {
                return false;
            }
        }
        if (lRoot.val != rRoot.val) {
            return false;
        }
        return compRoot(lRoot.left, rRoot.right) && compRoot(lRoot.right, rRoot.left);
    }

    static public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        } //处理初始根节点为null
        return compRoot(root.left, root.right);
    }

    public static void main(String[] args) {
        TreeNode t1 = new TreeNode(1);
        t1.left = new TreeNode(2);
        t1.right = new TreeNode(2);
        t1.left.left = new TreeNode(3);
        t1.left.right = new TreeNode(4);
        t1.right.left = new TreeNode(4);
        t1.right.right = new TreeNode(3);

        System.out.println(isSymmetric(t1));
    }
}
