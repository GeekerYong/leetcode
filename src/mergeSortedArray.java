/**
 * Created by sw on 2018-05-30.
 */
public class mergeSortedArray {
    static public void solution(int[] nums1, int m, int[] nums2, int n) {
        //从大到小倒序处理更为方便,这样不需要移动nums1数组的元素
        int i = m - 1;
        int j = n - 1;
        int target = m + n - 1;
        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[target--] = nums1[i--];
            } else {
                nums1[target--] = nums2[j--];
            }
        }

        while (i >= 0) {
            nums1[target--] = nums1[i--];
        }


        while (j >= 0) {
            nums1[target--] = nums2[j--];
        }
    }

    public static void main(String[] args) {
        int[] nums1 = new int[]{1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = new int[]{2, 5, 6};
        int n = 3;
        solution(nums1, m, nums2, n);
        for (int i = 0; i < nums1.length; i++) {
            System.out.println(nums1[i]);
        }
    }
}
