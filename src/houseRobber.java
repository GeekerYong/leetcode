/**
 * Created by sw on 2018-06-06.
 */
public class houseRobber {
    //动态规划
    //1，首先找到暴力解法，找到冗余
    //2,设计并存储状态
    //3，递归式（状态转移方程）
    //4,自底向上设计最优解
    public static int[] result; //写结果的矩阵

    static public int solve(int idx, int[] nums) {
        //开抢函数
        if (idx < 0) {
            return 0;
        }

        if (result[idx] >= 0) {
            return result[idx];
        }//如果已经算过

        result[idx] = Math.max(nums[idx] + solve(idx - 2, nums), solve(idx - 1, nums));
        // 抢(不能抢下家)                          //不抢(能抢下家)
        return result[idx];
    }

    static public int rob(int[] nums) {
        result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            result[i] = -1;
        }
        return solve(nums.length - 1, nums);
    }

    public static void main(String[] args) {
        int[] nums = new int[]{2, 7, 9, 3, 1};
        System.out.println(rob(nums));
    }
}
