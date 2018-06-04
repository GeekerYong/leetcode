/**
 * Created by sw on 2018-06-04.
 */
public class singleNumber {
    static public int singleNumber(int[] nums) {
        // 1^1 = 0
        // 0^2 = 2
        // 1^1^2 = 2
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            ans ^= nums[i];
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{4, 1, 2, 1, 2};
        System.out.println(singleNumber(nums));
    }
}
