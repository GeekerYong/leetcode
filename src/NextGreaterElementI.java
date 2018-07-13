public class NextGreaterElementI {
    static int[] solution(int[] nums1, int[] nums2) {
        int[] ans = new int[nums1.length];
        int indx = 0;
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    j++;
                    while (j < nums2.length) {
                        if (nums2[j] > nums1[i]) {
                            ans[indx++] = nums2[j];
                            break;
                        }
                        j++;
                    }
                    if (j == nums2.length) {
                        ans[indx++] = -1;
                        break;
                    }
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] ans = solution(new int[]{4, 1, 2}, new int[]{1, 3, 4, 2});
        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i]);
        }
    }
}
