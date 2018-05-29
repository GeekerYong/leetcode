/**
 * Created by sw on 2018-05-29.
 */
public class plusOne {
    static public int[] solution(int[] digits){
        //分别处理最高位不存在进位与存在进位的情况
        int carry = 1;
        for (int i = digits.length-1; i >=0 ; i--) {
            if (carry == 0){
                return digits;
            }
            int tmp = digits[i] + carry; //+1操作
            carry = tmp/10; //保存进位值
            digits[i] = tmp %10; //保存当前位的值
        }
        //上述循环结束后，如果carry非0，那么最高位有进位值
        if (carry != 0){
            int[] ans = new int[digits.length+1];
            ans[0] = 1;
            return ans;
        }
        return digits;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{9};
        nums = solution(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }
}
