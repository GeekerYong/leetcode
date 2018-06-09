import java.util.ArrayList;
import java.util.List;

public class binaryTreePaths {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    static public void find(TreeNode root, List<String> ans, String str) {
        if (str.equals("")) {
            str = str + root.val;
        } else {
            str = str + " " + root.val;
        }
        if (root.left == null && root.right == null) {
            ans.add(str.replace(" ", "->"));
        }
        if (root.left != null) {
            find(root.left, ans, str);
        }
        if (root.right != null) {
            find(root.right, ans, str);
        }
    }

    static public List<String> solution(TreeNode root) {
        List<String> ans = new ArrayList<>();
        if (root == null) {
            return ans;
        }
        find(root, ans, "");
        return ans;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        List<String> ans = solution(root);
        for (int i = 0; i < ans.size(); i++) {
            System.out.println(ans.get(i));
        }

    }
}
