/**
 * Created by sw on 2018-06-10.
 */
public class firstBadVersion {
    static public boolean isBadVersion(int num) {
        return true;
    }

    static public int firstBadVersion(int n) {
        int l = 1;
        int r = n;
        while (l < r) {
            int mid = l + (r - l) / 2;
            if (isBadVersion(mid)) {
                r = mid;
            } else {
                l = mid + 1;
            }
        }
        return l;
    }

    public static void main(String[] args) {
        System.out.println(firstBadVersion(4));
    }
}
