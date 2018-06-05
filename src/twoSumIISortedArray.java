/**
 * Created by sw on 2018-06-05.
 */
public class twoSumIISortedArray {
    static public int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];
        int i = 0;
        int j = numbers.length - 1;
        while (i < j) {
            if (numbers[i] + numbers[j] == target) {
                result[0] = i + 1;
                result[1] = j + 1;
                return result;
            } else {
                if (numbers[i] + numbers[j] < target) {
                    i++;
                } else {
                    j--;
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{2, 7, 11, 15};
        int target = 9;
        int[] ans = twoSum(nums, target);
        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i]);
        }
    }
}
