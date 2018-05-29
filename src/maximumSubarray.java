/**
 * Created by sw on 2018-05-29.
 */
public class maximumSubarray {
    static public int solution(int[] nums) {
        //遍历一遍，时间复杂度O(N)
        int ans = Integer.MIN_VALUE;
        int curmax = 0;
        for (int i = 0; i < nums.length; i++) {
            if (curmax <=0){
                curmax = nums[i];
            }else {
                curmax +=nums[i];
            }

            if (curmax > ans){
                ans = curmax;
            }
        }
        return ans;
    }

    static public int soluttion2(int[] nums){
        //分治法
        return 0;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(solution(nums));
    }
}
