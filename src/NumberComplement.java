/**
 * Created by sw on 2018-07-06.
 */
public class NumberComplement {
    static public int solution1(int num) {
        String bit = "";
        while (num != 0) {
            bit = ((num & 1) == 1 ? 0 : 1) + bit;
            num >>= 1;
        }
        return Integer.valueOf(bit, 2);
    }

    static public int solution2(int num) {
        int biggerOne = 1;
        while (biggerOne <= num) {
            biggerOne = biggerOne << 1;
        }
        biggerOne -= 1;
        return biggerOne ^ num;
    }
}
