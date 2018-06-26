public class sumOfLeftLeaves {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    static int solution(TreeNode root) {
        if (root == null) return 0; //root为空
        if (root.left == null) //左子树为空
            return solution(root.right);
        if (root.left.left == null && root.left.right == null) //出现左叶子
            return root.left.val + solution(root.right);
        return solution(root.left) + solution(root.right);

    }

    public static void main(String[] args) {

    }
}
