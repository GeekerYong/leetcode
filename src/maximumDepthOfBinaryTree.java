import java.util.Stack;

public class maximumDepthOfBinaryTree {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    static public int maxDepth(TreeNode root) {
        //递归解法
        if (root == null) return 0;
        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }

    static public int maxDepth2(TreeNode root) {
        //非递归解法
        Stack<TreeNode> nodesStack = new Stack<TreeNode>();
        Stack<Integer> depthStack = new Stack<Integer>();

        int maxDepth = 1;
        nodesStack.push(root);
        depthStack.push(maxDepth);
        while (!nodesStack.empty()) {
            TreeNode curNode = nodesStack.pop();
            int d = depthStack.pop();
            if (d > maxDepth) {
                maxDepth = d;
            }
            if (curNode.left != null) {
                nodesStack.push(curNode.left);
                depthStack.push(d + 1);
            }
            if (curNode.right != null) {
                nodesStack.push(curNode.right);
                depthStack.push(d + 1);
            }

        }
        return maxDepth;
    }

    public static void main(String[] args) {
        TreeNode t1 = new TreeNode(3);
        t1.left = new TreeNode(9);
        t1.right = new TreeNode(20);
        t1.right.left = new TreeNode(15);
        t1.right.right = new TreeNode(7);

        System.out.println(maxDepth2(t1));

    }
}
