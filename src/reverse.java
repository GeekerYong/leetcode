
public class reverse {
    static public int solution(int x) {
        long ans = 0;
        while (x != 0) {
            ans = ans * 10 + (x % 10);
            x = x / 10;
        }
        if (ans > Integer.MAX_VALUE || ans < Integer.MIN_VALUE) {
            return 0;
        }
        return (int) ans;
    }

    public static void main(String[] args) {
        int x = -123;
        System.out.println(solution(x));
    }
}
