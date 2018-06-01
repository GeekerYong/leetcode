public class balancedBinaryTree {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    static public int judge(TreeNode root) {
        if (root == null) return 0;
        int lDepth = judge(root.left);
        int rDepth = judge(root.right);
        if (lDepth < 0 || rDepth < 0 || Math.abs(lDepth - rDepth) > 1) {
            //当前节点左子树不平衡/右子树不平衡/本身不平衡
            return -1;
        }
        return Math.max(lDepth, rDepth) + 1;
    }

    static public boolean isBalanced(TreeNode root) {
        return judge(root) >= 0 ? true : false;
    }

    public static void main(String[] args) {
        TreeNode t1 = new TreeNode(3);
        t1.left = new TreeNode(9);
        t1.right = new TreeNode(20);
        t1.right.left = new TreeNode(15);
        t1.right.right = new TreeNode(7);

        TreeNode t2 = new TreeNode(1);
        t2.left = new TreeNode(2);
        t2.right = new TreeNode(2);
        t2.right.left = new TreeNode(3);
        t2.right.right = new TreeNode(3);
        t2.right.left.left = new TreeNode(4);
        t2.right.left.right = new TreeNode(4);

        System.out.println(isBalanced(t1));
    }
}
