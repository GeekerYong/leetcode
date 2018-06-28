/**
 * Created by sw on 2018-06-28.
 */
public class arrangingCoins {
    static public int solution(int n) {
        //没能通过所有的用例溢出
        long rowsReq = n * (n + 1) / 2; //n行需要的总硬币数目
        long remain = rowsReq - n;//所缺的硬币差额

        if (remain == 0) {
            return n;
        } else {
            long start = n;
            while (remain > 0) {
                remain = remain - start;
                start--;
            }
            return (int) start;
        }
    }

    static public int solution2(int n) {
        //二分法查找,也存在溢出问题
        if (n <= 0) return 0;
        int left = 0;
        int right = n;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            long sum = mid * (mid + 1) / 2;
            if (sum > n) {
                right = mid - 1;
            } else if (sum <= n) {
                left = mid + 1;
            }
        }
        return left - 1;
    }

    static public int solution3(int n) {
        //数学公式解方程即得

        return (int) (Math.sqrt(2 * (long) n + 0.25) - 0.5);
    }

    public static void main(String[] args) {
        System.out.println(solution3(1804289383));
    }
}
