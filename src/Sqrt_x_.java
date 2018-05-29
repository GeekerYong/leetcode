public class Sqrt_x_ {
    static public int mySqrt(int x) {
        //采用二分搜索
        if (x <= 1) {
            return x;
        }
        int left = 0;
        int right = x;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (x / mid >= mid) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return right - 1;
    }

    public static int mySqrt2(int x) {
        //牛顿迭代法
        if (x == 0) return 0;
        double last = 0;
        double now = 1;
        while (now != last) {
            last = now;
            now = (now + x / now) / 2;
        }
        return (int) now;
    }

    public static void main(String[] args) {
        int x = 81;
        System.out.println(mySqrt2(x));
    }
}
