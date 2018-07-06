/**
 * Created by sw on 2018-07-06.
 */
public class MaxConsecutiveOnes {
    static public int findMaxConsecutiveOnes(int[] nums) {
        int cnt = 0;
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                cnt++;
            } else {
                cnt = 0;
            }
            max = Math.max(max, cnt);
        }
        return max;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1, 1, 0, 1, 1, 1};
        System.out.println(findMaxConsecutiveOnes(nums));
    }
}
