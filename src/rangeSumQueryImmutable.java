/**
 * Created by sw on 2018-06-14.
 */
public class rangeSumQueryImmutable {
    static public int sumRange1(int i, int j, int[] nums) {
        int ans = 0;
        for (int k = i; k <= j; k++) {
            ans += nums[k];
        }
        return ans;
    }

    static public int sumRange2(int i, int j, int[] nums) {
        int[] dp = nums;
        for (int k = 1; k < dp.length; k++) {
            dp[k] += dp[k - 1];
        }
        return i == 0 ? dp[j] : dp[j] - dp[i - 1];
    }

    public static void main(String[] args) {
        int[] nums = new int[]{-2, 0, 3, -5, 2, -1};
        System.out.println(sumRange2(0, 5, nums));
    }
}
