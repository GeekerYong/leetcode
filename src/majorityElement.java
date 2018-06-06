import java.util.Arrays;
import java.util.HashMap;
import java.util.regex.Matcher;

/**
 * Created by sw on 2018-06-06.
 */
public class majorityElement {

    static public int solution(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length;
        if (nums[0] == nums[len / 2]) {
            return nums[0];
        } else if (nums[len - 1] == nums[len / 2]) {
            return nums[len - 1];
        } else {
            return nums[len / 2];
        }
    }

    public static void main(String[] args) {
        int[] nums = new int[]{3, 2, 3};
        System.out.println(solution(nums));
    }
}
