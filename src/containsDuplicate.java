import java.util.Arrays;

/**
 * Created by sw on 2018-06-07.
 */
public class containsDuplicate {

    static public boolean solution(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if ((nums[i] ^ nums[i + 1]) == 0) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 1};
        System.out.println(solution(nums));
    }
}
