public class pathSum {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    static public boolean findSum(TreeNode root, int sum, int curSum) {
        if (root == null) return false;
        if (((curSum + root.val) == sum) && (root.left == null && root.right == null)) return true;
        boolean lans = findSum(root.left, sum, curSum + root.val);
        boolean rans = findSum(root.right, sum, curSum + root.val);
        return lans || rans;
    }

    static public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null) return false;
        return findSum(root, sum, 0);
    }

    public static void main(String[] args) {
        TreeNode t1 = new TreeNode(5);
        t1.left = new TreeNode(4);
        t1.right = new TreeNode(8);
        t1.left.left = new TreeNode(11);
        t1.right.left = new TreeNode(13);
        t1.right.right = new TreeNode(4);
        t1.left.left.left = new TreeNode(7);
        t1.left.left.right = new TreeNode(2);
        t1.right.right.right = new TreeNode(1);

        TreeNode t2 = new TreeNode(1);
        t2.left = new TreeNode(2);

        System.out.println(hasPathSum(t1, 22));
    }
}
