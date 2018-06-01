public class minimumDepthOfBinaryTree {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    static public int minDepth(TreeNode root) {
        //递归解法
        if (root == null) return 0;
        int lDepth = minDepth(root.left);
        int rDepth = minDepth(root.right);
        return (lDepth == 0 || rDepth == 0) ? lDepth + rDepth + 1 : Math.min(lDepth, rDepth) + 1;
    }


    public static void main(String[] args) {
        TreeNode t1 = new TreeNode(1);
        t1.left = new TreeNode(2);
//        t1.right = new TreeNode(20);
//        t1.right.left = new TreeNode(15);
//        t1.right.right = new TreeNode(7);

        System.out.println(minDepth(t1));
    }
}
