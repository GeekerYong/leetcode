/**
 * Created by sw on 2018-06-22.
 */
public class guessNumberHigherOrLower {
    static public int guess(int n) {
        int gn = 6;
        if (gn == n) {
            return 0;
        } else if (gn > n) {
            return 1;
        } else return -1;
    }

    static public int solution(int l, int r) {
        int mid = l + (r - l) / 2;
        int ans = guess(mid);
        if (ans == 0) {
            return mid;
        } else if (ans == 1) {
            return solution(mid + 1, r);
        } else {
            return solution(l, mid - 1);
        }
    }

    static public int guessNumber(int n) {
        return solution(0, n);
    }

    public static void main(String[] args) {
        System.out.println(guessNumber(10));
    }
}
