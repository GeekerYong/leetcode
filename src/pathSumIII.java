/**
 * Created by sw on 2018-06-27.
 */
public class pathSumIII {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    static public int findSum(TreeNode root, int sum, int curSum) {
        if (root == null) return 0;
        int ans = 0;
        if ((curSum + root.val) == sum) ans = ans + 1;
        int lans = findSum(root.left, sum, curSum + root.val);
        int rans = findSum(root.right, sum, curSum + root.val);
        return lans + rans + ans;
    }

    static public int pathSum(TreeNode root, int sum) {
        int ans = 0;
        if (root == null) return 0;
        ans += findSum(root, sum, 0);
        ans += pathSum(root.right, sum);
        ans += pathSum(root.left, sum);
        return ans;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.right = new TreeNode(3);
        root.right.right.right = new TreeNode(4);
        root.right.right.right.right = new TreeNode(5);

        System.out.println(pathSum(root, 3));
    }
}
