/**
 * Created by sw on 2018-06-29.
 */
public class MinimumMovesToEqualArrayElements {

    static public int solution(int[] nums) {
        int sum = 0;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (nums[i] < min) {
                min = nums[i];
            }
        }
        return sum - (nums.length * min);

    }

    public static void main(String[] args) {
        int[] test = new int[]{1, 2, 3};
        System.out.println(solution(test));
    }


}
