import java.util.*;

/**
 * Created by sw on 2018-06-14.
 */
public class intersectionOfTwoArraysII {
    static public int[] intersection(int[] nums1, int[] nums2) {
        //如果已经是排序好的数组，使用两个指针进行追赶即可
        //1大 2加 2大 1加 相等的情况下一起加
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        ArrayList<Integer> ans = new ArrayList<Integer>();
        int i = 0;
        int j = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] == nums2[j]) {
                ans.add(nums1[i]);
                i++;
                j++;
            } else if (nums1[i] > nums2[j]) {
                j++;
            } else {
                i++;
            }
        }
        int[] ansArr = new int[ans.size()];
        Iterator it = ans.iterator();
        int p = 0;
        while (it.hasNext()) {
            ansArr[p++] = (int) it.next();
        }
        return ansArr;
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
