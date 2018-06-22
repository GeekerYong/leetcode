/**
 * Created by sw on 2018-06-22.
 */
public class sumOfTwoIntegers {
    static public int getSum(int a, int b) {
        //基本思想： 异或的重要性质就是不进位加法，那么我们只需要通过与找到进位（1 & 1 = 1）,然后通过两次不进位加法
        if (b == 0) return a;        // 当进位值为0时，返回
        int sum = a ^ b;        // 不进位加法
        int carry = (a & b) << 1;       // 计算进位
        return getSum(sum, carry);
    }

    public static void main(String[] args) {
        System.out.println(getSum(5, 3));
    }
}
