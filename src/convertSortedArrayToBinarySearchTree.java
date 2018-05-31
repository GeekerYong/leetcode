public class convertSortedArrayToBinarySearchTree {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    static public TreeNode solution(int[] nums, int begin, int end) {
        if (begin <= end) {
            return null;
        }
        int mid = (begin + end) / 2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = solution(nums, begin, mid - 1);
        root.right = solution(nums, mid + 1, end);
        return root;
    }

    static public TreeNode sortedArrayToBST(int[] nums) {
        //在中序遍历的情况下，根节点位于最中间，左孩子为左边的中间值，右孩子为右边的中间值
        //以此思路实现递归构造方法
        if (nums.length == 0) {
            return null;
        }
        return solution(nums, 0, nums.length - 1);
    }

    public static void main(String[] args) {
        int[] nums = new int[]{-10, -3, 0, 5, 9};
        TreeNode ans = sortedArrayToBST(nums);
        System.out.println("ans");
    }
}
