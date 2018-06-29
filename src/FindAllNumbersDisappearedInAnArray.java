import java.util.ArrayList;
import java.util.List;

/**
 * Created by sw on 2018-06-29.
 */
public class FindAllNumbersDisappearedInAnArray {

    static public List<Integer> solution(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        boolean[] bucket = new boolean[nums.length];
        for (int i = 0; i < bucket.length; i++) {
            bucket[i] = false;
        }
        for (int i = 0; i < nums.length; i++) {
            bucket[nums[i]] = true;
        }

        for (int i = 0; i < bucket.length; i++) {
            if (bucket[i] == false) {
                ans.add(i);
            }
        }
        return ans;
    }

    public static void main(String[] args) {

    }
}
