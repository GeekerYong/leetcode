public class thirdMaximumNumber {
    static public int solution(int[] nums) {
        long max1 = nums[0];
        long max2 = Long.MIN_VALUE;
        long max3 = Long.MIN_VALUE;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max1) {
                max3 = max2;
                max2 = max1;
                max1 = nums[i];
            } else if (nums[i] > max2) {
                if (nums[i] != max1) {
                    max3 = max2;
                    max2 = nums[i];
                }

            } else if (nums[i] > max3) {
                if (nums[i] != max2) {
                    max3 = nums[i];
                }

            }
        }

        if (max3 == Long.MIN_VALUE) {
            return (int) max1;
        } else {
            return (int) max3;
        }
    }

    public static void main(String[] args) {
        int[] a = new int[]{2, 2, 3, 1};
        System.out.println(solution(a));
    }
}
