/**
 * Created by sw on 2018-06-14.
 */
public class powerofFour {
    static boolean isPowerOfFour(int num) {
        //循环
        if (num <= 0) return false;
        while (num > 1) {
            if (num % 4 != 0) {
                return false;
            }
            num = num / 4;
        }
        return true;
    }

    static boolean isPowerOfFour2(int num) {
        //递归
        if (num <= 0) return false;
        if (num == 1) return true;
        return (num % 4 == 0) && isPowerOfFour2(num / 4);
    }


    public static void main(String[] args) {
        System.out.println(isPowerOfFour(16));
    }
}
