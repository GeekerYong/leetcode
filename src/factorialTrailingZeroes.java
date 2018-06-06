/**
 * Created by sw on 2018-06-06.
 */
public class factorialTrailingZeroes {
    static public int trailingZeroes(int n) {
        int count = 0;
        while (n > 1) {
            count += (n /= 5);
        }
        return count;
    }

    public static void main(String[] args) {
        int n = 100;
        System.out.println(trailingZeroes(100));
    }
}
