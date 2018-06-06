/**
 * Created by sw on 2018-06-06.
 */
public class rotateArray {
    static public void rotate(int[] nums, int k) {
        // 时间复杂度大，高级用例超时
        for (int i = 0; i < k; i++) {
            int cur = 0;
            int temp = 0;
            //将最后一个元素移至第一位
            temp = nums[0];
            nums[0] = nums[nums.length - 1];
            //其余元素整体后移
            for (int j = nums.length - 1; j > 0; j--) {
                if (j == 1) {
                    nums[1] = temp;
                } else {
                    nums[j] = nums[j - 1];
                }
            }
        }
    }

    static public void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    static public void rotate2(int[] nums, int k) {
        if (nums.length == 1 || nums.length == 0)
            return;
        //先反转前n-k个元素，再反转剩下的k个元素，再整体反转
        k %= nums.length; //处理元素数目小于K的情况。 比如2个元素 K=3 相当于 2个元素 K=1(所有元素循环了一次)
        reverse(nums, 0, nums.length - 1 - k);
        reverse(nums, nums.length - k, nums.length - 1);
        reverse(nums, 0, nums.length - 1);


    }

    public static void main(String[] args) {
        int[] nums = new int[]{1, 2};
        int k = 3;
        rotate2(nums, k);
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }
}
