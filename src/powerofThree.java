/**
 * Created by sw on 2018-06-14.
 */
public class powerofThree {
    static public boolean isPowerOfThree(int n) {
        return n > 0 && (Math.pow(3, 19) % n == 0);
    }

    public static void main(String[] args) {
        System.out.println(isPowerOfThree(45));
    }
}
