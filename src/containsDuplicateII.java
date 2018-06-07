/**
 * Created by sw on 2018-06-07.
 */
public class containsDuplicateII {
    static public boolean solution(int[] nums, int k) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if ((nums[i] == nums[j]) && (Math.abs(i - j) <= k)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 1, 2, 3};
        int k = 2;
        System.out.println(solution(nums, k));
    }
}
