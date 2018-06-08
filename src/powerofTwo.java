/**
 * Created by sw on 2018-06-08.
 */
public class powerofTwo {
    class Solution {
        public boolean isPowerOfTwo(int n) {
            if (n == 0) return false;
            while (n != 1) {
                int temp = n % 2;
                if (temp != 0) {
                    return false;
                }
                n = n / 2;
            }
            return true;
        }
    }
}
