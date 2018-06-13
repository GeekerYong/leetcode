/**
 * Created by sw on 2018-06-10.
 */
public interface moveZeroes {
    static public void solution(int[] nums) {
        //划分零区与非零区
        int nz = 0;
        int z = nums.length - 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[nz] = nums[i];
                nz++;
            } else {
                z--;
            }
        }
        //将零区全部置零
        for (int i = z + 1; i < nums.length; i++) {
            nums[i] = 0;
        }
    }

    public static void main(String[] args) {
        int[] nums = new int[]{0, 1, 0, 3, 12};
        solution(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }
}
