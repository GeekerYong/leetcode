/**
 * Created by sw on 2018-05-28.
 */
public class removeDuplicatesFromSortedArray {
    static public int removeDuplicates(int[] nums) {
        //split the array into Norp and rp region
        if (nums.length==0){
            return 0;
        }
        int i = 0;
        int j = i + 1;
        while (j != nums.length){
            if (nums[i] != nums[j]){
                nums[++i] = nums[j];
            }else{
                j++;
            }
        }
        return i+1;
    }

    public static void main(String[] args) {
        int[] nums= new int[]{0,0,1,1,1,2,2,3,3,4};
        int len = removeDuplicates(nums);
        System.out.println("len:" + len);
        for (int i = 0; i < len; i++) {
            System.out.println(nums[i]);
        }
    }
}
