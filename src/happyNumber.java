/**
 * Created by sw on 2018-06-06.
 */
public class happyNumber {
    static public boolean isHappy(int n) {
        while (n != 1 && n != 4) {
            int ans = 0;
            boolean flag = false;
            while (!flag) {
                ans += (n % 10) * (n % 10);
                n = n / 10;
                if (n == 0) {
                    flag = true;
                }
            }
            n = ans;
        }

        if (n == 1) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        int n = 19;
        System.out.println(isHappy(n));
    }
}
