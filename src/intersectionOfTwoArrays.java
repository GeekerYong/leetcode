import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by sw on 2018-06-14.
 */
public class intersectionOfTwoArrays {
    static public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> ansSet = new HashSet<>();
        //首先对一个数组去重
        Set<Integer> nums = new HashSet<>();
        for (int i = 0; i < nums1.length; i++) {
            nums.add(nums1[i]);
        }
        //对比另外一个数组
        for (int i = 0; i < nums2.length; i++) {
            if (nums.contains(nums2[i])) {
                ansSet.add(nums2[i]);
            }
        }
        //集合转数组
        int[] ans = new int[ansSet.size()];
        Iterator it = ansSet.iterator();
        int i = 0;
        while (it.hasNext()) {
            ans[i++] = (int) it.next();
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums1 = new int[]{1, 2, 2, 1};
        int[] nums2 = new int[]{2, 2};
        int[] ans = intersection(nums1, nums2);
        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i]);
        }
    }
}
