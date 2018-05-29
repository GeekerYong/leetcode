/**
 * Created by sw on 2018-05-28.
 */
public class removeElement {
    static public int solution(int[] nums, int val) {
        //split the nums into haveNum and noNum region
        if (nums.length ==0) {
            return 0;
        }
        int i = -1;
        int j = 0;
        while (j != nums.length) {
            if (nums[j] != val) {
                nums[++i] = nums[j++];
            } else {
                j++;
            }
        }
        return i + 1;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{0, 1, 2, 2, 3, 0, 4, 2};
        int val = 2;
        int ans = solution(nums, val);
        System.out.println("len:" + ans);
        for (int i = 0; i < ans; i++) {
            System.out.println(nums[i]);
        }
    }
}
