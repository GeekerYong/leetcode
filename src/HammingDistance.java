/**
 * Created by sw on 2018-06-29.
 */
public class HammingDistance {

    static public int solution(int x, int y) {
        int ans = 0;
        int xorRes = x ^ y;
        while (xorRes != 0) {
            ans += xorRes & 1;
            xorRes = xorRes >> 1;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(solution(1, 4));
    }
}
